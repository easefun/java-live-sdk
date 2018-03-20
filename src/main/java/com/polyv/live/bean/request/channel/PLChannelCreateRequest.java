package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

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
    protected int autoPlay;

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

    public int getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(int autoPlay) {
        this.autoPlay = autoPlay;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public PLChannelCreateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelCreateRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", name='" + name + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", channelPasswd='" + channelPasswd + '\'' +
                ", timestamp=" + timestamp +
                ", courseId='" + courseId + '\'' +
                ", sign='" + sign + '\'' +
                ", autoPlay=" + autoPlay +
                ", playerColor='" + playerColor + '\'' +
                '}';
    }

}
