package net.polyv.live.bean.result.channel;

import java.util.Date;

/**
 * <pre>
 *  频道观看日志
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelViewLog {

    /**
     * <pre>
     *  字段名：表示此次播放动作的ID
     *  变量名：playId
     *  类型：String
     * </pre>
     */
    protected String playId;

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
     *  类型：Int
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     *  字段名：播放时长
     *  变量名：playDuration
     *  类型：Int
     * </pre>
     */
    protected Integer playDuration;

    /**
     * <pre>
     *  字段名：缓存时长
     *  变量名：stayDuration
     *  类型：Int
     * </pre>
     */
    protected Integer stayDuration;

    /**
     * <pre>
     *  字段名：流量大小
     *  变量名：playDuration
     *  类型：Long
     * </pre>
     */
    protected Long flowSize;

    /**
     * <pre>
     *  字段名：用户自定义参数，如学员ID等
     *  变量名：sessionId
     *  类型：String
     * </pre>
     */
    protected String sessionId;

    /**
     * <pre>
     *  字段名：POLYV系统参数
     *  变量名：param1
     *  类型：String
     * </pre>
     */
    protected String param1;

    /**
     * <pre>
     *  字段名：POLYV系统参数
     *  变量名：param2
     *  类型：String
     * </pre>
     */
    protected String param2;

    /**
     * <pre>
     *  字段名：POLYV系统参数
     *  变量名：param3
     *  类型：String
     * </pre>
     */
    protected String param3;

    /**
     * <pre>
     *  字段名：POLYV系统参数
     *  变量名：param4
     *  类型：String
     * </pre>
     */
    protected String param4;

    /**
     * <pre>
     *  字段名：POLYV系统参数
     *  变量名：param5
     *  类型：String
     * </pre>
     */
    protected String param5;

    /**
     * <pre>
     *  字段名：IP地址
     *  变量名：ipAddress
     *  类型：String
     * </pre>
     */
    protected String ipAddress;

    /**
     * <pre>
     *  字段名：国家
     *  变量名：country
     *  类型：String
     * </pre>
     */
    protected String country;

    /**
     * <pre>
     *  字段名：省份
     *  变量名：province
     *  类型：String
     * </pre>
     */
    protected String province;

    /**
     * <pre>
     *  字段名：城市
     *  变量名：city
     *  类型：String
     * </pre>
     */
    protected String city;

    /**
     * <pre>
     *  字段名：ISP运营商
     *  变量名：isp
     *  类型：String
     * </pre>
     */
    protected String isp;

    /**
     * <pre>
     *  字段名：播放视频页面地址
     *  变量名：referer
     *  类型：String
     * </pre>
     */
    protected String referer;

    /**
     * <pre>
     *  字段名：用户设备
     *  变量名：userAgent
     *  类型：String
     * </pre>
     */
    protected String userAgent;

    /**
     * <pre>
     *  字段名：操作系统
     *  变量名：operatingSystem
     *  类型：String
     * </pre>
     */
    protected String operatingSystem;

    /**
     * <pre>
     *  字段名：浏览器
     *  变量名：browser
     *  类型：String
     * </pre>
     */
    protected String browser;

    /**
     * <pre>
     *  字段名：是否是移动端
     *  变量名：isMobile
     *  类型：String
     * </pre>
     */
    protected String isMobile;

    /**
     * <pre>
     *  字段名：当天
     *  变量名：currentDay
     *  类型：String
     * </pre>
     */
    protected String currentDay;

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

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
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

    public Integer getPlayDuration() {
        return playDuration;
    }

    public void setPlayDuration(Integer playDuration) {
        this.playDuration = playDuration;
    }

    public Integer getStayDuration() {
        return stayDuration;
    }

    public void setStayDuration(Integer stayDuration) {
        this.stayDuration = stayDuration;
    }

    public Long getFlowSize() {
        return flowSize;
    }

    public void setFlowSize(Long flowSize) {
        this.flowSize = flowSize;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4;
    }

    public String getParam5() {
        return param5;
    }

    public void setParam5(String param5) {
        this.param5 = param5;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(String isMobile) {
        this.isMobile = isMobile;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
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

    @Override
    public String toString() {
        return "ChannelViewLog{" +
                "playId='" + playId + '\'' +
                ", userId='" + userId + '\'' +
                ", channelId=" + channelId +
                ", playDuration=" + playDuration +
                ", stayDuration=" + stayDuration +
                ", flowSize=" + flowSize +
                ", sessionId='" + sessionId + '\'' +
                ", param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                ", param5='" + param5 + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", isp='" + isp + '\'' +
                ", referer='" + referer + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", browser='" + browser + '\'' +
                ", isMobile='" + isMobile + '\'' +
                ", currentDay='" + currentDay + '\'' +
                ", createdTime=" + createdTime +
                ", lastModified=" + lastModified +
                '}';
    }
}
