package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV获取频道某段时间的直播统计数据对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDailySummaryRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：开始日期
     * 变量名：startDay
     * 是否必填：是
     * 类型：String(32)
     * 示例值：2018-01-02
     * 描述：要查询的数据的结束日期，yyyy-MM-dd的日期字符串
     * </pre>
     */
    protected String startDay;

    /**
     * <pre>
     * 字段名：结束日期
     * 变量名：endDay
     * 是否必填：是
     * 类型：String(32)
     * 示例值：2018-01-03
     * 描述：要查询的数据的结束日期，yyyy-MM-dd的日期字符串
     * </pre>
     */
    protected String endDay;

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public PLChannelDailySummaryRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelSummaryRequest{" +
                "startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
