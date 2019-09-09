package net.polyv.live.bean.result.channel;

/**
 * <pre>
 *  频道点赞数和历史在线人数数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelLikes {

    /**
     * <pre>
     *  字段名：频道ID
     *  变量名：channelId
     *  类型：Integer
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     *  字段名：点赞数
     *  变量名：likes
     *  类型：Integer
     * </pre>
     */
    protected Integer likes;

    /**
     * <pre>
     *  字段名：历史在线人数
     *  变量名：viewers
     *  类型：Integer
     * </pre>
     */
    private Integer viewers;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    @Override
    public String toString() {
        return "ChannelLikes{" +
                "channelId=" + channelId +
                ", likes=" + likes +
                ", viewers=" + viewers +
                '}';
    }
}