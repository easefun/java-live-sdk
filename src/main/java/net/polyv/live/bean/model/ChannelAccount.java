package net.polyv.live.bean.model;

import java.util.Date;

/**
 * <pre>
 *  频道子账号数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelAccount {

    /**
     * <pre>
     *  字段名：子频道
     *  变量名：account
     *  类型：String
     * </pre>
     */
    private String account;

    /**
     * <pre>
     *  字段名：用户ID
     *  变量名：userId
     *  类型：String
     * </pre>
     */
    private String userId;

    /**
     * <pre>
     *  字段名：频道ID
     *  变量名：channelId
     *  类型：Integer
     * </pre>
     */
    private Integer channelId;

    /**
     * <pre>
     *  字段名：密码
     *  变量名：passwd
     *  类型：String
     * </pre>
     */
    private String passwd;

    /**
     * <pre>
     *  字段名：昵称
     *  变量名：nickname
     *  类型：String
     * </pre>
     */
    private String nickname;

    /**
     * <pre>
     *  字段名：流名
     *  变量名：stream
     *  类型：String
     * </pre>
     */
    private String stream;

    /**
     * <pre>
     *  字段名：状态
     *  变量名：status
     *  类型：String
     * </pre>
     */
    private String status;

    /**
     * <pre>
     *  字段名：创建时间
     *  变量名：createdTime
     *  类型：Date
     * </pre>
     */
    private Date createdTime;

    /**
     * <pre>
     *  字段名：更新时间
     *  变量名：lastModified
     *  类型：Date
     * </pre>
     */
    private Date lastModified;

    /**
     * <pre>
     *  字段名：子频道场次ID
     *  变量名：channelSessionId
     *  类型：String
     * </pre>
     */
    private String channelSessionId;

    /**
     * <pre>
     *  字段名：排序
     *  变量名：sort
     *  类型：Integer
     * </pre>
     */
    private Integer sort;

    /**
     * <pre>
     *  字段名：助教头像
     *  变量名：avatar
     *  类型：String
     * </pre>
     */
    private String avatar;

    /**
     * <pre>
     *  字段名：角标
     *  变量名：actor
     *  类型：String
     * </pre>
     */
    private String actor;

    /**
     * <pre>
     *  字段名：助教翻页权限
     *  变量名：pageTurnEnabled
     *  类型：String
     * </pre>
     */
    private String pageTurnEnabled;

    /**
     * <pre>
     *  字段名：发布公告权限
     *  变量名：notifyEnabled
     *  类型：String
     * </pre>
     */
    private String notifyEnabled;

    /**
     * <pre>
     *  字段名：开启签到权限
     *  变量名：checkinEnabled
     *  类型：String
     * </pre>
     */
    private String checkinEnabled;

    /**
     * <pre>
     *  字段名：发起投票权限
     *  变量名：voteEnabled
     *  类型：String
     * </pre>
     */
    private String voteEnabled;

    /**
     * <pre>
     *  字段名：抽奖权限
     *  变量名：lotteryEnabled
     *  类型：String
     * </pre>
     */
    private String lotteryEnabled;

    /**
     * <pre>
     *  字段名：聊天列表权限
     *  变量名：chatListEnabled
     *  类型：String
     * </pre>
     */
    private String chatListEnabled;

    /**
     * <pre>
     *  字段名：角色
     *  变量名：role
     *  类型：String
     * </pre>
     */
    private String role;

    /**
     * <pre>
     *  字段名：子频道推流地址
     *  变量名：pushUrl
     *  类型：String
     * </pre>
     */
    private String pushUrl;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getChannelSessionId() {
        return channelSessionId;
    }

    public void setChannelSessionId(String channelSessionId) {
        this.channelSessionId = channelSessionId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPageTurnEnabled() {
        return pageTurnEnabled;
    }

    public void setPageTurnEnabled(String pageTurnEnabled) {
        this.pageTurnEnabled = pageTurnEnabled;
    }

    public String getNotifyEnabled() {
        return notifyEnabled;
    }

    public void setNotifyEnabled(String notifyEnabled) {
        this.notifyEnabled = notifyEnabled;
    }

    public String getCheckinEnabled() {
        return checkinEnabled;
    }

    public void setCheckinEnabled(String checkinEnabled) {
        this.checkinEnabled = checkinEnabled;
    }

    public String getVoteEnabled() {
        return voteEnabled;
    }

    public void setVoteEnabled(String voteEnabled) {
        this.voteEnabled = voteEnabled;
    }

    public String getLotteryEnabled() {
        return lotteryEnabled;
    }

    public void setLotteryEnabled(String lotteryEnabled) {
        this.lotteryEnabled = lotteryEnabled;
    }

    public String getChatListEnabled() {
        return chatListEnabled;
    }

    public void setChatListEnabled(String chatListEnabled) {
        this.chatListEnabled = chatListEnabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    @Override
    public String toString() {
        return "ChannelAccount{" +
                "account='" + account + '\'' +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", passwd='" + passwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", stream='" + stream + '\'' +
                ", status='" + status + '\'' +
                ", createdTime=" + createdTime +
                ", lastModified=" + lastModified +
                ", channelSessionId='" + channelSessionId + '\'' +
                ", sort=" + sort +
                ", avatar='" + avatar + '\'' +
                ", actor='" + actor + '\'' +
                ", pageTurnEnabled='" + pageTurnEnabled + '\'' +
                ", notifyEnabled='" + notifyEnabled + '\'' +
                ", checkinEnabled='" + checkinEnabled + '\'' +
                ", voteEnabled='" + voteEnabled + '\'' +
                ", lotteryEnabled='" + lotteryEnabled + '\'' +
                ", chatListEnabled='" + chatListEnabled + '\'' +
                ", role='" + role + '\'' +
                ", pushUrl='" + pushUrl + '\'' +
                '}';
    }
}
