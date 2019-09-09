package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道设置回放开关对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelPlaybackSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：否
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：回放开关
     * 变量名：playBackEnabled
     * 是否必填：是
     * 类型：String(64)
     * 示例值：值为Y/N
     * 描述：直播频道是否开启回放的开关
     * </pre>
     */
    protected String playBackEnabled;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getPlayBackEnabled() {
        return playBackEnabled;
    }

    public void setPlayBackEnabled(String playBackEnabled) {
        this.playBackEnabled = playBackEnabled;
    }

    public PLChannelPlaybackSetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelPlaybackSetRequest{" +
                "channelId=" + channelId +
                ", appId='" + appId + '\'' +
                ", playBackEnabled='" + playBackEnabled + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
