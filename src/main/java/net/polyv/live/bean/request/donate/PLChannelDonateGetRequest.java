package net.polyv.live.bean.request.donate;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  获取频道打赏设置请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDonateGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Integer
     * 示例值：10001
     * 描述：直播账号下的频道号
     * </pre>
     */
    protected Integer channelId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLChannelDonateGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    /**
     * 带参数的打赏的构造函数
     * @param channelId 频道ID
     */
    public PLChannelDonateGetRequest(String appId, String appSecret, Integer channelId) {
        super(appId, appSecret);
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "PLChannelDonateGetRequest{" +
                "channelId=" + channelId +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
