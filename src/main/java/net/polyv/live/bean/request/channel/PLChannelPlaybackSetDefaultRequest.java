package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道设置默认回放视频请求类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelPlaybackSetDefaultRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：视频ID
     * 变量名：videoId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：xxxxxxxxxxxxxxx
     * 描述：直播系统生成的ID，可在回放列表接口的返回数据获取
     * </pre>
     */
    protected String videoId;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public PLChannelPlaybackSetDefaultRequest(String appId, String appSecret, String videoId) {
        super(appId, appSecret);
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "PLChannelPlaybackDeleteRequest{" +
                "videoId='" + videoId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
