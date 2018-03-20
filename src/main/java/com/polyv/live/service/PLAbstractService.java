package com.polyv.live.service;

import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.result.PLBaseResult;
import com.polyv.live.bean.result.channel.PLChannelCommonResult;
import com.polyv.live.bean.result.channel.PLChannelCreateResult;
import com.polyv.live.constant.PolyvLiveConstants;
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

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String Get_Method = HttpGet.METHOD_NAME;

    public static final String Post_Method = HttpPost.METHOD_NAME;

    public static final String Delete_Method = HttpDelete.METHOD_NAME;

    public static final String Put_Method = HttpPut.METHOD_NAME;

    /**
     * 请求接口
     * @param url    请求URL
     * @param params 请求参数集合
     * @return
     */
    protected WrappedResponse request(String url, Map<String, String> params, String method) {
        HttpClientUtil client = HttpClientUtil.getInstance();
        String content;
        if (Post_Method.equals(method)) {
            content = client.sendHttpPost(url, params);
        } else if (Delete_Method.equals(method)) {
            content = client.sendHttpDelete(url, params);
        } else if (Put_Method.equals(method)) {
            content = client.sentHttpPut(url, params);
        } else {
            String paramStr = MapUtil.mapJoinNotEncode(params);
            if (StringUtils.isNotBlank(paramStr))
                paramStr = "?" + paramStr;
            content = client.sendHttpGet(url + paramStr);
        }
        WrappedResponse response = null;
        if (StringUtils.isNotBlank(content)) {
            try {
                response = JsonUtil.parseObject(content, WrappedResponse.class);
            } catch (Exception e) {
                logger.error("response json cast to object occur an error，content = {}", content);
            }
        }
        if (null == response) {
            response = new WrappedResponse(PolyvLiveConstants.Code_400, WrappedResponse.STATUS_ERROR, PolyvLiveConstants.Request_Error_Msg, null);
        }
        return response;
    }

    /**
     * 把请求对象转换为Result对象
     * @param response  响应对象
     * @param result    响应结果
     * @param <T>       自定义类（继承PLBaseResult类）
     * @return
     */
    protected <T extends PLBaseResult> T getResult(WrappedResponse response, T result) {
        result.setCode(response.getCode());
        result.setMessage(response.getMessage());
        result.setStatus(response.getStatus());
        return result;
    }

    /**
     * 放回公用对象时共用方法
     * @param url       请求地址
     * @param urlParam  动态地址的地址参数
     * @param params    请求参数
     * @param method    请求方法
     * @return
     */
    protected PLChannelCommonResult getPLChannelCommonResult(String url, String urlParam, Map<String, String> params, String method) {
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

}
