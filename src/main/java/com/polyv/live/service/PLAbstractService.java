package com.polyv.live.service;

import com.polyv.live.bean.client.RequestHost;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.client.WrappedResponseV1;
import com.polyv.live.bean.request.PLBaseBody;
import com.polyv.live.bean.result.PLBaseResult;
import com.polyv.live.bean.result.PLCommonResult;
import com.polyv.live.bean.result.channel.PLChannelCommonResult;
import com.polyv.live.constant.MarkConstants;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.enumeration.ProxyType;
import com.polyv.live.util.HttpClientUtil;
import com.polyv.live.util.JsonUtil;
import com.polyv.live.util.MapUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * <pre>
 *  POLYV直播相关的接口调用基础类
 * </pre>
 *
 * @author HuangYF
 */
public abstract class PLAbstractService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected static final String GET_METHOD = HttpGet.METHOD_NAME;

    protected static final String POST_METHOD = HttpPost.METHOD_NAME;

    protected static final String DELETE_METHOD = HttpDelete.METHOD_NAME;

    protected static final String PUT_METHOD = HttpPut.METHOD_NAME;

    protected static final String CONTENTS_TAG = "contents";

    /**
     * 代理
     */
    private RequestHost proxy = null;

    /**
     * 请求接口（包括v2, v3）
     * @param url    请求URL
     * @param params 请求参数集合
     * @param method 请求方式
     * @return 请求响应对象
     */
    protected WrappedResponse request(String url, Map<String, String> params, String method) {
        return request(url, params, method, null);
    }

    /**
     * 请求接口（带请求体参数，包括v2, v3）
     * @param url    请求URL
     * @param params 请求参数集合
     * @param method 请求方式
     * @param t      请求体对象
     * @return 请求响应对象
     */
    protected <T extends PLBaseBody> WrappedResponse request(String url, Map<String, String> params,
            String method, T t) {
        // 获取请求体json
        String body = (null == t) ? null : t.toJson();
        WrappedResponse response = requestBase(url, params, method, WrappedResponse.class, body);
        if (null == response) {
            response = new WrappedResponse(PolyvLiveConstants.CODE_400, WrappedResponse.STATUS_ERROR,
                    PolyvLiveConstants.REQUEST_ERR_MSG, null);
        }
        return response;
    }

    /**
     * 请求V1接口
     * @param url    请求URL
     * @param params 请求参数集合
     * @param method 请求方式
     * @return 请求响应对象
     */
    protected WrappedResponseV1 requestV1(String url, Map<String, String> params, String method) {
        WrappedResponseV1 response = requestBase(url, params, method, WrappedResponseV1.class, null);
        if (null == response) {
            response = new WrappedResponseV1(String.valueOf(PolyvLiveConstants.CODE_400), WrappedResponseV1.STATUS_FAIL,
                    PolyvLiveConstants.REQUEST_ERR_MSG, null);
        }
        return response;
    }

    /**
     * 请求接口基础方法
     * @param url    请求URL
     * @param params 请求参数集合
     * @param method 请求方式
     * @return 请求响应对象
     */
    private <T> T requestBase(String url, Map<String, String> params, String method, Class<T> clazz, String body) {
        HttpClientUtil client = initHttpClient();

        String content;
        if (StringUtils.isNotBlank(body) && POST_METHOD.equals(method)) { // 发送请求体POST请求
            content = client.sendHttpPost(url, params, body);
        } else if (POST_METHOD.equals(method)) {
            content = client.sendHttpPost(url, params);
        } else if (DELETE_METHOD.equals(method)) {
            content = client.sendHttpDelete(url, params);
        } else if (PUT_METHOD.equals(method)) {
            content = client.sentHttpPut(url, params);
        } else {
            String paramStr = MapUtil.mapJoinNotEncode(params);
            if (StringUtils.isNotBlank(paramStr))
                paramStr = MarkConstants.QUESTION_MARK + paramStr;
            content = client.sendHttpGet(url + paramStr);
        }
        T t = null;
        if (StringUtils.isNotBlank(content)) {
            try {
                t = JsonUtil.parseObject(content, clazz);
            } catch (Exception e) {
                logger.error("response json cast to object occur an error，content = {}", content);
            }
        }
        return t;
    }

    /**
     * 实例化HttpClient对象
     * @return HttpClient对象
     */
    protected HttpClientUtil initHttpClient() {
        if (null != proxy) {
            return HttpClientUtil.getInstance(proxy, PolyvLiveConstants.BASE_DOMAIN);
        }
        return HttpClientUtil.getInstance();
    }

    /**
     * 把请求对象转换为Result对象
     * @param response  响应对象
     * @param result    响应结果
     * @param <T>       自定义类（继承PLBaseResult类）
     * @return Result对象
     */
    protected <T extends PLBaseResult> T getResult(WrappedResponse response, T result) {
        result.setCode(response.getCode());
        result.setMessage(response.getMessage());
        result.setStatus(response.getStatus());
        return result;
    }

    /**
     * 把v1接口请求对象转换为Result对象
     * @param response  响应对象
     * @param result    响应结果
     * @param <T>       自定义类（继承PLBaseResult类）
     * @return Result对象
     */
    protected <T extends PLBaseResult> T getResult(WrappedResponseV1 response, T result) {
        if (response.isRequestOk()) {
            result.setCode(PolyvLiveConstants.CODE_200);
        } else {
            result.setCode(PolyvLiveConstants.CODE_400);
        }
        result.setMessage(response.getMsg());
        result.setStatus(response.getStatus());
        return result;
    }

    /**
     * 放回公用对象时共用方法
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @return 公用对象
     * @deprecated
     */
    @Deprecated
    protected PLChannelCommonResult getPLChannelCommonResult(String url, String urlParam, Map<String, String> params,
                                                             String method) {
        if (StringUtils.isNotBlank(urlParam)) {
            url = PolyvLiveConstants.getRealUrl(url, urlParam);
        }
        WrappedResponse response = request(url, params, method);
        PLChannelCommonResult result = new PLChannelCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getData());
        }
        return this.getResult(response, result);
    }

    /**
     * 放回公用对象时共用方法
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @return 公用对象
     * @deprecated
     */
    @Deprecated
    protected PLChannelCommonResult getPLChannelCommonResultV1(String url, String urlParam, Map<String, String> params,
                                                               String method) {
        if (StringUtils.isNotBlank(urlParam)) {
            url = PolyvLiveConstants.getRealUrl(url, urlParam);
        }
        WrappedResponseV1 response = requestV1(url, params, method);
        PLChannelCommonResult result = new PLChannelCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getResult());
        }
        return this.getResult(response, result);
    }

    /**
     * 放回公用对象时共用方法
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @return 公用对象
     */
    protected PLCommonResult getPLCommonResult(String url, String urlParam, Map<String, String> params,
            String method) {
        return getPLCommonResult(url, urlParam, params, method, null);
    }

    /**
     * 放回公用对象时共用方法(包含请求体参数)
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @param t         请求体对象
     * @return 公用对象
     */
    protected <T extends PLBaseBody> PLCommonResult getPLCommonResult(String url, String urlParam,
            Map<String, String> params, String method, T t) {
        if (StringUtils.isNotBlank(urlParam)) {
            url = PolyvLiveConstants.getRealUrl(url, urlParam);
        }
        WrappedResponse response = request(url, params, method, t);
        PLCommonResult result = new PLCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getData());
        }
        return this.getResult(response, result);
    }

    /**
     * 放回公用对象时共用方法
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @return 公用对象
     */
    protected PLCommonResult getPLCommonResultV1(String url, String urlParam, Map<String, String> params,
                                                               String method) {
        if (StringUtils.isNotBlank(urlParam)) {
            url = PolyvLiveConstants.getRealUrl(url, urlParam);
        }
        WrappedResponseV1 response = requestV1(url, params, method);
        PLCommonResult result = new PLCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getResult());
        }
        return this.getResult(response, result);
    }

    /**
     * <pre>
     *  设置正向代理
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param scheme    http/https
     */
    public void initForwardProxy(String host, int port, String scheme) {
        proxy = new RequestHost(host, port, scheme, ProxyType.FORWARD.getValue());
    }

    /**
     * <pre>
     *  设置反向代理(带IP地址)
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param ipAddress 代理IP地址
     * @param scheme    http/https
     */
    public void initReverseProxy(String host, int port, String ipAddress, String scheme) {
        proxy = new RequestHost(host, port, ipAddress, scheme, ProxyType.REVERSE.getValue());
    }

    /**
     * <pre>
     *  设置反向代理
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param scheme    http/https
     */
    public void initReverseProxy(String host, int port, String scheme) {
        proxy = new RequestHost(host, port, scheme, ProxyType.REVERSE.getValue());
    }


    /**
     * <pre>
     *  销毁代理
     * </pre>
     */
    public void destroyProxy() {
        proxy = null;
    }

}
