package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道删除对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDeleteRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：POLYV用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：edvf2fpec9
     * 描述：POLYV账号的直播用户ID
     * </pre>
     */
    protected String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PLChannelDeleteRequest(String appId, String appSecret, String userId) {
        super(appId, appSecret);
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PLChannelDeleteRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
