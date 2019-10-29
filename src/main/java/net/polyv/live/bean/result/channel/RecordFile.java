package net.polyv.live.bean.result.channel;

/**
 * <pre>
 *  频道录制文件信息
 * </pre>
 *
 * @author HuangYF
 */
public class RecordFile {

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
     *  字段名：录制文件地址
     *  变量名：url
     *  类型：String
     * </pre>
     */
    protected String url;

    /**
     * <pre>
     *  字段名：开始时间
     *  变量名：startTime
     *  类型：String
     * </pre>
     */
    protected String startTime;

    /**
     * <pre>
     *  字段名：结束时间
     *  变量名：endTime
     *  类型：String
     * </pre>
     */
    protected String endTime;

    /**
     * <pre>
     *  字段名：文件大小
     *  变量名：fileSize
     *  类型：Long
     * </pre>
     */
    protected Long fileSize;

    /**
     * <pre>
     *  字段名：时长（单位：秒）
     *  变量名：duration
     *  类型：Long
     * </pre>
     */
    protected Integer duration;

    /**
     * <pre>
     *  字段名：录制文件码率（单位：字节）
     *  变量名：bitrate
     *  类型：Long
     * </pre>
     */
    protected Long bitrate;

    /**
     * <pre>
     *  字段名：分辨率
     *  变量名：resolution
     *  类型：String
     * </pre>
     */
    protected String resolution;

    /**
     * <pre>
     *  字段名：频道的场次ID
     *  变量名：channelSessionId
     *  类型：String
     * </pre>
     */
    protected String channelSessionId;

    /**
     * <pre>
     *  字段名：录制文件ID
     *  变量名：fileId
     *  类型：String
     * </pre>
     */
    protected String fileId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
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

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getChannelSessionId() {
        return channelSessionId;
    }

    public void setChannelSessionId(String channelSessionId) {
        this.channelSessionId = channelSessionId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "RecordFile{" +
                "channelId=" + channelId +
                ", url='" + url + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", fileSize=" + fileSize +
                ", duration=" + duration +
                ", bitrate=" + bitrate +
                ", resolution='" + resolution + '\'' +
                ", channelSessionId='" + channelSessionId + '\'' +
                ", fileId='" + fileId + '\'' +
                '}';
    }
}