package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV多频道的点赞数和历史在线人数对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelLikesGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：POLYV频道ID组
     * 变量名：channelIds
     * 是否必填：是
     * 类型：String
     * 示例值：10001,10002
     * 描述：POLYV账号的直播频道通过"英文逗号"连接成的字符串
     * </pre>
     */
    protected String channelIds;

    public String getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String channelIds) {
        this.channelIds = channelIds;
    }

    public PLChannelLikesGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelViewersGetRequest{" +
                "channelIds='" + channelIds + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
