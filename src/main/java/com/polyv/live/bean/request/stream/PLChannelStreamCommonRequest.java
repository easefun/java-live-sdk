package com.polyv.live.bean.request.stream;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  频道流公共请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelStreamCommonRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String
     * 示例值：xxxxxxx
     * 描述：用户ID
     * </pre>
     */
    protected String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PLChannelStreamCommonRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    /**
     * 必要参数构造函数
     * @param appId 加密ID
     * @param appSecret 加密secret
     * @param userId 用户ID
     */
    public PLChannelStreamCommonRequest(String appId, String appSecret, String userId) {
        super(appId, appSecret);
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PLChannelStreamCommonRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
