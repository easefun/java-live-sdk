package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  频道点赞数和历史在线人数请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelLikesGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：频道点赞数和历史在线人数列表
     * 变量名：channelLikes
     * 类型：List
     * </pre>
     */
    protected List<ChannelLikes> channelLikes;

    public List<ChannelLikes> getChannelLikes() {
        return channelLikes;
    }

    public void setChannelLikes(List<ChannelLikes> channelLikes) {
        this.channelLikes = channelLikes;
    }

    @Override
    public String toString() {
        return "PLChannelLikesGetResult{" +
                "channelLikes=" + channelLikes +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
