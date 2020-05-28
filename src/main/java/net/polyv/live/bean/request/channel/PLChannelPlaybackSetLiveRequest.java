package net.polyv.live.bean.request.channel;

public class PLChannelPlaybackSetLiveRequest extends PLChannelPlaybackSetRequest {

    protected String type;

    protected String origin;

    protected String videoId;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public PLChannelPlaybackSetLiveRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelPlaybackSetLiveRequest{" +
                "type='" + type + '\'' +
                ", origin='" + origin + '\'' +
                ", channelId=" + channelId +
                ", playBackEnabled='" + playBackEnabled + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
