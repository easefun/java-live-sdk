package com.polyv.live.bean.result.channel;

/**
 * <pre>
 *  频道在线观看人数
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelViewer {

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
     *  字段名：时间点
     *  变量名：time
     *  类型：String
     * </pre>
     */
    protected String time;

    /**
     * <pre>
     *  字段名：在线观看人数
     *  变量名：count
     *  类型：Integer
     * </pre>
     */
    protected Integer count;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ChannelViewer{" +
                "channelId=" + channelId +
                ", time='" + time + '\'' +
                ", count=" + count +
                '}';
    }
}