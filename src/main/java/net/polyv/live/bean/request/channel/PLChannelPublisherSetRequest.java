package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道主讲人请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelPublisherSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：主持人名称
     * 变量名：publisher
     * 是否必填：是
     * 类型：String(64)
     * 示例值：保利威视主讲人
     * 描述：POLYV账号的直播频道的主讲人
     * </pre>
     */
    protected String publisher;

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLChannelPublisherSetRequest(String appId, String appSecret, String publisher, Integer channelId) {
        super(appId, appSecret);
        this.publisher = publisher;
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "PLChannelPublisherSetRequest{" +
                "publisher='" + publisher + '\'' +
                ", appId='" + appId + '\'' +
                ", channelId=" + channelId +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
