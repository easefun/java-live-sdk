package com.polyv.live.util;

import com.polyv.live.bean.client.HttpDeleteWithBody;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
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
    
    private static final Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
    
    private RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(15000).setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000).build();

    private static HttpClientUtil instance = null;

    private HttpClientUtil() {
    }

    public static HttpClientUtil getInstance() {
        if (null == instance) {
            instance = new HttpClientUtil();
        }
        return instance;
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     */
    public String sendHttpPost(String httpUrl) {
        HttpPost httpPost = new HttpPost(httpUrl); // 创建httpPost
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param params 参数(格式:key1=value1&key2=value2)
     */
    public String sendHttpPost(String httpUrl, String params) {
        HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
        try {
            // 设置参数
            StringEntity stringEntity = new StringEntity(params, "UTF-8");
            stringEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(stringEntity);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param headers
     * @param params 参数(格式:key1=value1&key2=value2)
     */
    public String sendHttpPostWithHeader(String httpUrl, String params, Header[] headers) {
        HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
        try {
            httpPost.setHeaders(headers);
            // 设置参数
            StringEntity stringEntity = new StringEntity(params, "UTF-8");
            stringEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(stringEntity);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return sendHttpRequest(httpPost);
    }

    /**
     * 发送 post请求
     * @param httpUrl 地址
     * @param maps 参数
     */
    public String sendHttpPost(String httpUrl, Map<String, String> maps) {
        HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
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
        HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
        MultipartEntityBuilder meBuilder = MultipartEntityBuilder.create();
        for (String key : maps.keySet()) {
            meBuilder.addPart(key, new StringBody(maps.get(key), ContentType.TEXT_PLAIN));
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
        HttpGet httpGet = new HttpGet(httpUrl);// 创建get请求
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
            for (String key : maps.keySet()) {
                nameValuePairs.add(new BasicNameValuePair(key, maps.get(key)));
            }
            return new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
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
        httpRequest.setConfig(requestConfig);
        try {
            // 创建默认的httpClient实例.
            httpClient = HttpClients.createDefault();

            // 执行请求
            response = httpClient.execute(httpRequest);
            logger.info("Http请求状态码：" + response.getStatusLine().getStatusCode());
            String responseContent = EntityUtils.toString(response.getEntity(), "UTF-8");
            return responseContent;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                // 关闭连接,释放资源
                if (response != null) {
                    response.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

}
