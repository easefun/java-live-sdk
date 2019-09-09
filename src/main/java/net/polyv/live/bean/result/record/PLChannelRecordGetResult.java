package net.polyv.live.bean.result.record;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.Date;

/**
 * <pre>
 *  获取频道录制文件信息请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：文件ID
     * 变量名：fileId
     * 类型：String
     * </pre>
     */
    protected String fileId;

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 类型：String
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 类型：int(11)
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：录制开始时间
     * 变量名：startTime
     * 类型：String
     * </pre>
     */
    protected String startTime;

    /**
     * <pre>
     * 字段名：录制结束时间
     * 变量名：endTime
     * 类型：String
     * </pre>
     */
    protected String endTime;

    /**
     * <pre>
     * 字段名：文件名
     * 变量名：filename
     * 类型：String
     * </pre>
     */
    protected String filename;

    /**
     * <pre>
     * 字段名：文件大小
     * 变量名：filesize
     * 类型：Long
     * </pre>
     */
    protected Long filesize;

    /**
     * <pre>
     * 字段名：开始时间
     * 变量名：createdTime
     * 类型：date
     * </pre>
     */
    private Date createdTime;

    /**
     * <pre>
     * 字段名：宽
     * 变量名：width
     * 类型：int(11)
     * </pre>
     */
    private Integer width;

    /**
     * <pre>
     * 字段名：高
     * 变量名：height
     * 类型：int(11)
     * </pre>
     */
    private Integer height;

    /**
     * <pre>
     * 字段名：文件大小
     * 变量名：duration
     * 类型：int(11)
     * </pre>
     */
    private Integer duration;

    /**
     * <pre>
     * 字段名：码率
     * 变量名：bitrate
     * 类型：Long
     * </pre>
     */
    private Long bitrate;

    /**
     * <pre>
     * 字段名：mp4地址
     * 变量名：mp4
     * 类型：String
     * </pre>
     */
    private String mp4;

    /**
     * <pre>
     * 字段名：m3u8地址
     * 变量名：m3u8
     * 类型：String
     * </pre>
     */
    private String m3u8;

    /**
     * <pre>
     * 字段名：录制场次ID
     * 变量名：channelSessionId
     * 类型：String
     * </pre>
     */
    private String channelSessionId;

    /**
     * <pre>
     * 字段名：直播类型
     * 变量名：liveType
     * 类型：String
     * </pre>
     */
    private String liveType;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getM3u8() {
        return m3u8;
    }

    public void setM3u8(String m3u8) {
        this.m3u8 = m3u8;
    }

    public String getChannelSessionId() {
        return channelSessionId;
    }

    public void setChannelSessionId(String channelSessionId) {
        this.channelSessionId = channelSessionId;
    }

    public String getLiveType() {
        return liveType;
    }

    public void setLiveType(String liveType) {
        this.liveType = liveType;
    }

    @Override
    public String toString() {
        return "PLChannelRecordGetResult{" +
                "fileId='" + fileId + '\'' +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", filename='" + filename + '\'' +
                ", filesize=" + filesize +
                ", createdTime=" + createdTime +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", bitrate=" + bitrate +
                ", mp4='" + mp4 + '\'' +
                ", m3u8='" + m3u8 + '\'' +
                ", channelSessionId='" + channelSessionId + '\'' +
                ", liveType='" + liveType + '\'' +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
