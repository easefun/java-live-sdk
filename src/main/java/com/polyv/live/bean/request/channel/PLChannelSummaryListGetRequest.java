package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道汇总统计的播放数据对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelSummaryListGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelIds
     * 是否必填：否
     * 类型：String(32)
     * 示例值：10001,10002
     * 描述：POLYV账号下的直播频道ID,传递多个使用逗号隔开
     * </pre>
     */
    protected String channelIds;

    /**
     * <pre>
     * 字段名：查询的开始日期
     * 变量名：startDate
     * 是否必填：是
     * 类型：String(32)
     * 示例值：格式为yyyy-MM-dd
     * 描述：需要查询数据的时间段的开始日期
     * </pre>
     */
    protected String startDate;

    /**
     * <pre>
     * 字段名：查询的结束日期
     * 变量名：endDate
     * 是否必填：是
     * 类型：String(32)
     * 示例值：格式为yyyy-MM-dd
     * 描述：需要查询数据的时间段的结束日期
     * </pre>
     */
    protected String endDate;

    public String getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String channelIds) {
        this.channelIds = channelIds;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public PLChannelSummaryListGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }


    @Override
    public String toString() {
        return "PLChannelSummaryListGetRequest{" +
                "channelIds='" + channelIds + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
