package net.polyv.live.bean.request.record;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV合并频道录制MP4文件请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordMergeMp4Request extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：开始时间戳
     * 变量名：startTime
     * 是否必填：是
     * 类型：Long
     * 示例值：1313131313230
     * 描述：开始时间的13位时间戳
     * </pre>
     */
    protected Long startTime;

    /**
     * <pre>
     * 字段名：结束时间戳
     * 变量名：endTime
     * 是否必填：是
     * 类型：Long
     * 示例值：1313131313230
     * 描述：结束时间的13位时间戳
     * </pre>
     */
    protected Long endTime;

    /**
     * <pre>
     * 字段名：文件名
     * 变量名：fileName
     * 是否必填：否
     * 类型：Long
     * 示例值：record
     * 描述：文件名，默认错
     * </pre>
     */
    protected String fileName;

    /**
     * <pre>
     * 字段名：回调地址
     * 变量名：callbackUrl
     * 是否必填：否
     * 类型：Long
     * 示例值：http://www.polyv.net/callback
     * 描述：生成录制文件后回调通知的地址
     * </pre>
     */
    protected String callbackUrl;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public PLChannelRecordMergeMp4Request(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelRecordMergeMp4Request{" +
                "channelId=" + channelId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", fileName='" + fileName + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
