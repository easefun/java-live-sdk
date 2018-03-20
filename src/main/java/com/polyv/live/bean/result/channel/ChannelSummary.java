package com.polyv.live.bean.result.channel;

/**
 * <pre>
 *  频道汇总统计的播放数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelSummary {

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
     *  字段名：频道名称
     *  变量名：name
     *  类型：String
     * </pre>
     */
    protected String name;

    /**
     * <pre>
     *  字段名：pc端播放时长，单位秒
     *  变量名：pcPlayDuration
     *  类型：Integer
     * </pre>
     */
    protected Integer pcPlayDuration;

    /**
     * <pre>
     *  字段名：pc端播放流量，单位为Byte
     *  变量名：pcFlowSize
     *  类型：Long
     * </pre>
     */
    private Long pcFlowSize;

    /**
     * <pre>
     *  字段名：pc视频播放量
     *  变量名：pcVideoView
     *  类型：Integer
     * </pre>
     */
    private Integer pcVideoView;

    /**
     * <pre>
     *  字段名：pc端唯一观众数
     *  变量名：pcUniqueViewer
     *  类型：Integer
     * </pre>
     */
    private Integer pcUniqueViewer;

    /**
     * <pre>
     *  字段名：移动端播放时长，单位秒
     *  变量名：mobilePlayDuration
     *  类型：Integer
     * </pre>
     */
    private Integer mobilePlayDuration;

    /**
     * <pre>
     *  字段名：移动端播放流量，单位为Byte
     *  变量名：mobileFlowSize
     *  类型：Long
     * </pre>
     */
    private Long mobileFlowSize;

    /**
     * <pre>
     *  字段名：移动端播放量
     *  变量名：mobileVideoView
     *  类型：Integer
     * </pre>
     */
    private Integer mobileVideoView;

    /**
     * <pre>
     *  字段名：移动端唯一观众数
     *  变量名：mobileUniqueViewer
     *  类型：Integer
     * </pre>
     */
    private Integer mobileUniqueViewer;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPcPlayDuration() {
        return pcPlayDuration;
    }

    public void setPcPlayDuration(Integer pcPlayDuration) {
        this.pcPlayDuration = pcPlayDuration;
    }

    public Long getPcFlowSize() {
        return pcFlowSize;
    }

    public void setPcFlowSize(Long pcFlowSize) {
        this.pcFlowSize = pcFlowSize;
    }

    public Integer getPcVideoView() {
        return pcVideoView;
    }

    public void setPcVideoView(Integer pcVideoView) {
        this.pcVideoView = pcVideoView;
    }

    public Integer getPcUniqueViewer() {
        return pcUniqueViewer;
    }

    public void setPcUniqueViewer(Integer pcUniqueViewer) {
        this.pcUniqueViewer = pcUniqueViewer;
    }

    public Integer getMobilePlayDuration() {
        return mobilePlayDuration;
    }

    public void setMobilePlayDuration(Integer mobilePlayDuration) {
        this.mobilePlayDuration = mobilePlayDuration;
    }

    public Long getMobileFlowSize() {
        return mobileFlowSize;
    }

    public void setMobileFlowSize(Long mobileFlowSize) {
        this.mobileFlowSize = mobileFlowSize;
    }

    public Integer getMobileVideoView() {
        return mobileVideoView;
    }

    public void setMobileVideoView(Integer mobileVideoView) {
        this.mobileVideoView = mobileVideoView;
    }

    public Integer getMobileUniqueViewer() {
        return mobileUniqueViewer;
    }

    public void setMobileUniqueViewer(Integer mobileUniqueViewer) {
        this.mobileUniqueViewer = mobileUniqueViewer;
    }

    @Override
    public String toString() {
        return "ChannelSummary{" +
                "userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", name='" + name + '\'' +
                ", pcPlayDuration='" + pcPlayDuration + '\'' +
                ", pcFlowSize=" + pcFlowSize +
                ", pcVideoView=" + pcVideoView +
                ", pcUniqueViewer=" + pcUniqueViewer +
                ", mobilePlayDuration=" + mobilePlayDuration +
                ", mobileFlowSize=" + mobileFlowSize +
                ", mobileVideoView=" + mobileVideoView +
                ", mobileUniqueViewer=" + mobileUniqueViewer +
                '}';
    }
}