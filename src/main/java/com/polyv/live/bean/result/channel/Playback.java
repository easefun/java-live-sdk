package com.polyv.live.bean.result.channel;

import java.util.Date;

/**
 * <pre>
 *  频道回放视频
 * </pre>
 *
 * @author HuangYF
 */
public class Playback {

    /**
     * <pre>
     *  字段名：视频ID
     *  变量名：videoId
     *  类型：String
     * </pre>
     */
    protected String videoId;

    /**
     * <pre>
     *  字段名：点播视频ID
     *  变量名：videoPoolId
     *  类型：String
     * </pre>
     */
    protected String videoPoolId;

    /**
     * <pre>
     *  字段名：用户ID
     *  变量名：userId
     *  类型：String
     * </pre>
     */
    protected String userId;

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
     *  字段名：视频标题
     *  变量名：title
     *  类型：String
     * </pre>
     */
    protected String title;

    /**
     * <pre>
     *  字段名：视频头图
     *  变量名：firstImage
     *  类型：String
     * </pre>
     */
    protected String firstImage;

    /**
     * <pre>
     *  字段名：视频时长
     *  变量名：duration
     *  类型：String
     * </pre>
     */
    protected String duration;

    /**
     * <pre>
     *  字段名：默认视频的播放清晰度，1为流畅，2为高清，3为超清
     *  变量名：myBr
     *  类型：String
     * </pre>
     */
    protected String myBr;

    /**
     * <pre>
     *  字段名：访客信息收集id
     *  变量名：qid
     *  类型：String
     * </pre>
     */
    protected String qid;

    /**
     * <pre>
     *  字段名：视频加密状态，1表示为加密状态，0为非加密
     *  变量名：seed
     *  类型：Integer
     * </pre>
     */
    protected Integer seed;

    /**
     * <pre>
     *  字段名：访客信息收集id
     *  变量名：ordertime
     *  类型：Integer
     * </pre>
     */
    protected Integer ordertime;

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

    /**
     * <pre>
     *  字段名：是否为默认播放
     *  变量名：asDefault
     *  类型：String
     * </pre>
     */
    protected String asDefault;

    /**
     * <pre>
     *  字段名：视频地址
     *  变量名：url
     *  类型：String
     * </pre>
     */
    protected String url;

    /**
     * <pre>
     *  字段名：场次ID
     *  变量名：channelSessionId
     *  类型：String
     * </pre>
     */
    protected String channelSessionId;

    /**
     * <pre>
     *  字段名：合并信息
     *  变量名：channelSessionId
     *  类型：String
     * </pre>
     */
    protected String mergeInfo;

    /**
     * <pre>
     *  字段名：状态
     *  变量名：status
     *  类型：String
     * </pre>
     */
    protected String status;

    /**
     * <pre>
     *  字段名：视频文件地址
     *  变量名：fileUrl
     *  类型：String
     * </pre>
     */
    protected String fileUrl;

    /**
     * <pre>
     *  字段名：对应录制文件的ID
     *  变量名：fileId
     *  类型：String
     * </pre>
     */
    protected String fileId;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoPoolId() {
        return videoPoolId;
    }

    public void setVideoPoolId(String videoPoolId) {
        this.videoPoolId = videoPoolId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMyBr() {
        return myBr;
    }

    public void setMyBr(String myBr) {
        this.myBr = myBr;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Integer getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Integer ordertime) {
        this.ordertime = ordertime;
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

    public String getAsDefault() {
        return asDefault;
    }

    public void setAsDefault(String asDefault) {
        this.asDefault = asDefault;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChannelSessionId() {
        return channelSessionId;
    }

    public void setChannelSessionId(String channelSessionId) {
        this.channelSessionId = channelSessionId;
    }

    public String getMergeInfo() {
        return mergeInfo;
    }

    public void setMergeInfo(String mergeInfo) {
        this.mergeInfo = mergeInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "Playback{" +
                "videoId='" + videoId + '\'' +
                ", videoPoolId='" + videoPoolId + '\'' +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", title='" + title + '\'' +
                ", firstImage='" + firstImage + '\'' +
                ", duration='" + duration + '\'' +
                ", myBr='" + myBr + '\'' +
                ", qid='" + qid + '\'' +
                ", seed=" + seed +
                ", ordertime=" + ordertime +
                ", createdTime=" + createdTime +
                ", lastModified=" + lastModified +
                ", asDefault='" + asDefault + '\'' +
                ", url='" + url + '\'' +
                ", channelSessionId='" + channelSessionId + '\'' +
                ", mergeInfo='" + mergeInfo + '\'' +
                ", status='" + status + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", fileId='" + fileId + '\'' +
                '}';
    }
}
