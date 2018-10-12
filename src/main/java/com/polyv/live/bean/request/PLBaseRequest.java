package com.polyv.live.bean.request;

import com.polyv.live.util.EncryptionUtils;
import com.polyv.live.util.MapUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * <pre>
 *  POLYV直播API请求对象共用的参数存放类
 * </pre>
 *
 * @author HuangYF
 */
public abstract class PLBaseRequest {

    /**
     * <pre>
     * 字段名：账号应用ID
     * 变量名：appId
     * 是否必填：是
     * 类型：String(32)
     * 示例值：egzkiq28qv
     * 描述：POLYV账号的APPID
     * </pre>
     */
    protected String appId;

    /**
     * <pre>
     * 字段名：加密串
     * 变量名：appSecret
     * 是否必填：是
     * 类型：String(64)
     * 示例值：4a5e6b18237d4766a1f61ad771ad5734
     * 描述：接口加密辨识串
     * </pre>
     */
    protected String appSecret;

    /**
     * <pre>
     * 字段名：时间戳
     * 变量名：timestamp
     * 是否必填：是
     * 类型：Long
     * 示例值：1469777806
     * 描述：当前系统时间戳
     * </pre>
     */
    protected Long timestamp;

    /**
     * <pre>
     * 字段名：签名
     * 变量名：sign
     * 是否必填：是
     * 类型：String(32)
     * 示例值：3C9F8A701D475DE50D501EDE8DFBE0F9
     * 描述：签名，详见签名生成算法
     * </pre>
     */
    protected String sign;

    public PLBaseRequest(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.timestamp = System.currentTimeMillis();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取请求参数集合Map
     */
    public Map<String, String> getParams() {
        Map<String, String> pMap = MapUtil.objectToMap(this);
        Map<String, String> params = this.paraFilter(pMap);
        this.sign = this.generateSign(params);
        params.put("sign", this.sign);
        return params;
    }

    /**
     * 通过map获取加密串
     * @return 返回加密串
     */
    private String generateSign(Map<String, String> params) {
        String concatStr = this.concatParams(params);
        String secret = this.getAppSecret();
        String plain = secret + concatStr + secret;
        return EncryptionUtils.md5Hex(plain).toUpperCase();
    }

    /**
     * 过滤数组中参数
     * @param sArray 待过滤数组
     * @return 返回过滤后的map
     */
    private Map<String, String> paraFilter(Map<String, String> sArray) {
        Map<String, String> result = new HashMap<String, String>();
        if (null == sArray || sArray.size() <= 0) {
            return result;
        }
        for (Map.Entry<String, String> entry : sArray.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (StringUtils.isBlank(value) || key.equalsIgnoreCase("appSecret")
                    || key.equalsIgnoreCase("sign") || key.equalsIgnoreCase("requestBody")) {
                continue;
            }
            result.put(key, value);
        }
        return result;
    }

    /**
     * 拼接参数
     * @param params 需要拼接的参数
     * @return 获取拼接后的字符串
     */
    private String concatParams(Map<String, String> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            sb.append(key).append(value);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "PLBaseRequest{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
