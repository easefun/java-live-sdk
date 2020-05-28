package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV创建频道对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelCreateRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：POLYV用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：edvf2fpec9
     * 描述：POLYV账号的直播用户ID
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：频道名称
     * 变量名：name
     * 是否必填：是
     * 类型：String(64)
     * 示例值：POLYV
     * 描述：创建频道时传入的频道名称
     * </pre>
     */
    protected String name;

    /**
     * <pre>
     * 字段名：频道密码
     * 变量名：channelPasswd
     * 是否必填：是
     * 类型：String(64)
     * 示例值：123456
     * 描述：创建频道传入的频道密码
     * </pre>
     */
    protected String channelPasswd;

    /**
     * <pre>
     * 字段名：课程号
     * 变量名：courseId
     * 是否必填：否
     * 类型：String(64)
     * 示例值：course1
     * 描述：创建频道时传入的课程Id标识
     * </pre>
     */
    protected String courseId;

    /**
     * <pre>
     * 字段名：自动播放标识
     * 变量名：autoPlay
     * 是否必填：否
     * 类型：int(11)
     * 示例值：0/1，默认1
     * 描述：创建的频道是否自动播放
     * </pre>
     */
    protected Integer autoPlay;

    /**
     * <pre>
     * 字段名：播放器控制栏颜色，
     * 变量名：playerColor
     * 是否必填：否
     * 类型：String(64)
     * 示例值：默认：#666666
     * 描述：创建频道的播放器控制栏颜色
     * </pre>
     */
    protected String playerColor;

    /**
     * <pre>
     * 字段名：直播场景
     * 变量名：scene
     * 是否必填：否
     * 类型：String(64)
     * 示例值：默认：alone
     * 描述：直播场景：alone 活动拍摄; ppt 三分屏; topclass 大班课
     * </pre>
     */
    protected String scene;

    /**
     * <pre>
     * 字段名：分类ID
     * 变量名：categoryId
     * 是否必填：否
     * 类型：int(11)
     * 示例值：1
     * 描述：新建频道的所属分类，如果不提交，则为默认分类（分类ID可通过“获取直播分类”接口得到）
     * </pre>
     */
    protected Integer categoryId;

    /**
     * <pre>
     * 字段名：频道的最大在线观看的人数
     * 变量名：maxViewer
     * 是否必填：否
     * 类型：int(11)
     * 示例值：1
     * 描述：频道的最大在线观看的人数
     * </pre>
     */
    protected Integer maxViewer;

    /**
     * <pre>
     * 字段名：三分屏频道的观看布局
     * 变量名：watchLayout
     * 是否必填：否
     * 类型：String(64)
     * 示例值：ppt
     * 描述：三分屏频道的观看布局，不设置会使用账号的通用设置，取值：ppt 文档为主，video 视频为主
     * </pre>
     */
    protected String watchLayout;

    /**
     * <pre>
     * 字段名：连麦人数
     * 变量名：linkMicLimit
     * 是否必填：否
     * 类型：int(11)
     * 示例值：1
     * 描述：连麦人数。-1：表示使用账号的连麦人数; 范围大于等于-1，小于等于账号的连麦人数，最大16人
     * </pre>
     */
    protected Integer linkMicLimit;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannelPasswd() {
        return channelPasswd;
    }

    public void setChannelPasswd(String channelPasswd) {
        this.channelPasswd = channelPasswd;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Integer getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(Integer autoPlay) {
        this.autoPlay = autoPlay;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getMaxViewer() {
        return maxViewer;
    }

    public void setMaxViewer(Integer maxViewer) {
        this.maxViewer = maxViewer;
    }

    public String getWatchLayout() {
        return watchLayout;
    }

    public void setWatchLayout(String watchLayout) {
        this.watchLayout = watchLayout;
    }

    public Integer getLinkMicLimit() {
        return linkMicLimit;
    }

    public void setLinkMicLimit(Integer linkMicLimit) {
        this.linkMicLimit = linkMicLimit;
    }

    public PLChannelCreateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelCreateRequest{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", channelPasswd='" + channelPasswd + '\'' +
                ", courseId='" + courseId + '\'' +
                ", autoPlay=" + autoPlay +
                ", playerColor='" + playerColor + '\'' +
                ", scene='" + scene + '\'' +
                ", categoryId=" + categoryId +
                ", maxViewer=" + maxViewer +
                ", watchLayout='" + watchLayout + '\'' +
                ", linkMicLimit=" + linkMicLimit +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
