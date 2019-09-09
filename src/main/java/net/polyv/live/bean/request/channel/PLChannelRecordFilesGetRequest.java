package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道录制文件信息请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordFilesGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：XXXXXXXX
     * 描述：POLYV账号下的用户ID
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：开始日期
     * 变量名：startDate
     * 是否必填：否
     * 类型：String(64)
     * 示例值：yyyy-MM-dd
     * 描述：查询时间的开始日期
     * </pre>
     */
    protected String startDate;

    /**
     * <pre>
     * 字段名：结束日期
     * 变量名：endDate
     * 是否必填：否
     * 类型：String(64)
     * 示例值：yyyy-MM-dd
     * 描述：查询时间的结束日期
     * </pre>
     */
    protected String endDate;

    /**
     * <pre>
     * 字段名：场次ID
     * 变量名：sessionId
     * 是否必填：否
     * 类型：String(64)
     * 示例值：2ii9kkkjjd
     * 描述：直播的场次ID
     * </pre>
     */
    protected String sessionId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public PLChannelRecordFilesGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChanelRecordFilesGetRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", endDate='" + endDate + '\'' +
                ", timestamp=" + timestamp +
                ", sessionId='" + sessionId + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
