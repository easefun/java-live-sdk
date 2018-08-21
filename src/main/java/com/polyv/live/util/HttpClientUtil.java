package com.polyv.live.util;

import com.polyv.live.bean.client.HttpDeleteWithBody;
import com.polyv.live.bean.client.RequestHost;
import com.polyv.live.enumeration.ProxyType;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *  httpclient的操作实现类
 * </pre>
 *
 * @author HuangYF
 */
public class HttpClientUtil {

    private static final String CHARSET_UTF8 = "UTF-8";

    private static final Logger LOG = LoggerFactory.getLogger(HttpClientUtil.class);

    private static final String HTTPS_SCHEME = "https";
    
    private RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(15000).setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000).build();

    private static HttpClientUtil instance = null;

    private RequestHost requestHost = null;

    private String defaultProxyHost = null;

    private HttpClientUtil() {
    }

    public static HttpClientUtil getInstance() {
        if (null == instance) {
            instance = new HttpClientUtil();
        }
        instance.requestHost = null;
        instance.defaultProxyHost = null;
        return instance;
    }

    public static HttpClientUtil getInstance(RequestHost requestHost, String proxyHost) {
        if (null == instance) {
            instance = new HttpClientUtil();
        }
        instance.requestHost = requestHost;
        instance.defaultProxyHost = proxyHost;
        return instance;
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     */
    public String sendHttpPost(String httpUrl) {
        HttpPost httpPost = new HttpPost(httpUrl);
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param params 参数(格式:key1=value1&key2=value2)
     */
    public String sendHttpPost(String httpUrl, String params) {
        HttpPost httpPost = new HttpPost(httpUrl);
        try {
            // 设置参数
            StringEntity stringEntity = new StringEntity(params, CHARSET_UTF8);
            stringEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(stringEntity);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param headers 请求头
     * @param params 参数(格式:key1=value1&key2=value2)
     */
    public String sendHttpPostWithHeader(String httpUrl, String params, Header[] headers) {
        HttpPost httpPost = new HttpPost(httpUrl);
        try {
            httpPost.setHeaders(headers);
            // 设置参数
            StringEntity stringEntity = new StringEntity(params, CHARSET_UTF8);
            stringEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(stringEntity);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param maps 参数
     */
    public String sendHttpPost(String httpUrl, Map<String, String> maps) {
        HttpPost httpPost = new HttpPost(httpUrl);
        if (null != maps && !maps.isEmpty()) {
            httpPost.setEntity(this.getNameValuePair(maps));
        }
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求（带文件）
     * @param httpUrl 地址
     * @param maps 参数
     * @param fileLists 附件
     */
    public String sendHttpPost(String httpUrl, Map<String, String> maps, List<File> fileLists) {
        HttpPost httpPost = new HttpPost(httpUrl);
        MultipartEntityBuilder meBuilder = MultipartEntityBuilder.create();
        for (Map.Entry<String, String> entry : maps.entrySet()) {
            meBuilder.addPart(entry.getKey(), new StringBody(entry.getValue(), ContentType.TEXT_PLAIN));
        }
        for (File file : fileLists) {
            FileBody fileBody = new FileBody(file);
            meBuilder.addPart("files", fileBody);
        }
        HttpEntity reqEntity = meBuilder.build();
        httpPost.setEntity(reqEntity);
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 get请求
     * @return 成功时为响应内容，失败时为 null
     */
    public String sendHttpGet(String httpUrl) {
        HttpGet httpGet = new HttpGet(httpUrl);
        return sendHttpRequest(httpGet);
    }

    /**
     * 发送http delete请求
     */
    public String sendHttpDelete(String httpUrl, Map<String, String> maps) {
        HttpDeleteWithBody httpDelete = new HttpDeleteWithBody(httpUrl);
        if (null != maps && !maps.isEmpty()) {
            httpDelete.setEntity(this.getNameValuePair(maps));
        }
        return sendHttpRequest(httpDelete);
    }

    /**
     * 生成UrlEncodedFormEntity
     */
    private UrlEncodedFormEntity getNameValuePair(Map<String, String> maps) {
        try {
            // 创建参数队列
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            return new UrlEncodedFormEntity(nameValuePairs, CHARSET_UTF8);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 发送http put请求
     */
    public String sentHttpPut(String httpUrl, Map<String, String> maps) {
        HttpPut httpPut = new HttpPut(httpUrl);
        //设置header
        httpPut.setHeader("Content-type", "application/json");
        if (maps != null && maps.size() > 0) {
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                httpPut.setHeader(entry.getKey(),entry.getValue());
            }
        }
        return sendHttpRequest(httpPut);
    }

    /**
     * 发送Request请求
     * @return 成功时为响应内容，失败时为 null
     */
    private String sendHttpRequest(HttpRequestBase httpRequest) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        if (null != requestHost){
            boolean status = setProxyToRequest(httpRequest);
            if (!status) return null;
        } else {
            httpRequest.setConfig(requestConfig);
        }

        try {
            // 创建默认的httpClient实例.
            httpClient = HttpClients.createDefault();

            // 执行请求
            response = httpClient.execute(httpRequest);
            LOG.info("Http请求状态码：{}", response.getStatusLine().getStatusCode());
            return EntityUtils.toString(response.getEntity(), CHARSET_UTF8);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        } finally {
            // 关闭连接,释放资源
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }
        return null;
    }

    /**
     * 在请求中设置代理
     */
    private boolean setProxyToRequest(HttpRequestBase httpRequest) {
        if (ProxyType.FORWARD.getValue().equals(requestHost.getProxyType())) {
            // 正向代理
            RequestConfig customRequestConfig = getCustomRequestConfig(requestHost);
            if (null == customRequestConfig) {
                return false;
            }
            httpRequest.setConfig(customRequestConfig);
        } else {
            // 反向代理
            String host = StringUtils.isBlank(requestHost.getIp()) ? requestHost.getHost() : requestHost.getIp();
            if (0 != requestHost.getPort()) {
                host += ":" + requestHost.getPort();
            }

            String url = httpRequest.getURI().toString();
            url = url.replace(defaultProxyHost, host);

            // 替换scheme
            url = replaceScheme(url);
            try {
                httpRequest.setURI(new URI(url));
            } catch (URISyntaxException e) {
                LOG.error("生成代理url出错了，cause={}", e);
                return false;
            }

            // 设置host头
            setHostHeader(httpRequest);

            httpRequest.setConfig(requestConfig);
        }
        return true;
    }

    /**
     * 把host添加到header中
     * @param httpRequest http请求
     */
    private void setHostHeader(HttpRequestBase httpRequest) {
        boolean isHttps = StringUtils.isNotBlank(requestHost.getScheme()) && HTTPS_SCHEME.equals(requestHost.getScheme());
        int port = requestHost.getPort();
        if (StringUtils.isNotBlank(requestHost.getHost())) {
            if ((0 != port) && (443 != port) && isHttps) {
                httpRequest.setHeader("Host", requestHost.getHost());
            } else if ((0 != port) && (80 != port) && !isHttps) {
                httpRequest.setHeader("Host", requestHost.getHost() + ":" + port);
            } else {
                httpRequest.setHeader("Host", requestHost.getHost());
            }
        } else {
            httpRequest.setHeader("Host", defaultProxyHost);
        }
    }

    /**
     * 替换scheme
     * @param url 请求地址
     * @return 替换后的地址
     */
    private String replaceScheme(String url) {
        boolean isHttps = url.startsWith(HTTPS_SCHEME);
        if (isHttps) {
            if (StringUtils.isBlank(requestHost.getScheme())
                    || !HTTPS_SCHEME.equals(requestHost.getScheme())) {
                url = url.replace(HTTPS_SCHEME, HttpHost.DEFAULT_SCHEME_NAME);
            }
        } else {
            if (StringUtils.isNotBlank(requestHost.getScheme())
                    && HTTPS_SCHEME.equals(requestHost.getScheme())) {
                url = url.replace(HttpHost.DEFAULT_SCHEME_NAME, HTTPS_SCHEME);
            }
        }
        return url;
    }

    /**
     * 生成自定义请求代理配置
     * @param proxy 代理
     * @return 请求配置
     */
    private RequestConfig getCustomRequestConfig(RequestHost proxy) {
        String scheme = HttpHost.DEFAULT_SCHEME_NAME;
        if (StringUtils.isNotBlank(proxy.getScheme()) && HTTPS_SCHEME.equals(proxy.getScheme())) {
            scheme = proxy.getScheme();
        }
        HttpHost host = new HttpHost(proxy.getHost(), proxy.getPort(), scheme);
        return RequestConfig.custom().setProxy(host).setSocketTimeout(15000).setConnectTimeout(15000)
                .setConnectionRequestTimeout(15000).build();
    }

}
