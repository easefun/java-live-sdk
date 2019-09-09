package net.polyv.live.bean.result.channel;

import java.util.Date;

/**
 * <pre>
 *  频道当天统计的播放数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelDailySummary extends ChannelSummary {

    /**
     * <pre>
     *  字段名：当天
     *  变量名：currentDay
     *  类型：String
     * </pre>
     */
    protected String currentDay;

    /**
     * <pre>
     *  字段名：创建时间
     *  变量名：createdTime
     *  类型：Date
     * </pre>
     */
    protected Date createdTime;

    /**
     * <pre>
     *  字段名：更新时间
     *  变量名：lastModified
     *  类型：Date
     * </pre>
     */
    protected Date lastModified;

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "ChannelDailySummary{" +
                "currentDay='" + currentDay + '\'' +
                ", createdTime=" + createdTime +
                ", lastModified=" + lastModified +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", name='" + name + '\'' +
                ", pcPlayDuration=" + pcPlayDuration +
                '}';
    }
}