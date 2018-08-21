package com.polyv.live.bean.result.channel;

import com.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  频道当天统计的播放数据请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDailySummaryResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：频道日期统计播放数据列表
     * 变量名：channelDailySummary
     * 类型：List
     * </pre>
     */
    protected List<ChannelDailySummary> channelDailySummary;

    public List<ChannelDailySummary> getChannelDailySummary() {
        return channelDailySummary;
    }

    public void setChannelDailySummary(List<ChannelDailySummary> channelDailySummary) {
        this.channelDailySummary = channelDailySummary;
    }

    @Override
    public String toString() {
        return "PLChannelDailySummaryResult{" +
                "channelDailySummary=" + channelDailySummary +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
