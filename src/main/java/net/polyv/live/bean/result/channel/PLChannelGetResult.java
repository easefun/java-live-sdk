package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

/**
 * <pre>
 *  直播频道信息获取请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 类型：int(11)
     * </pre>
     */
    protected int channelId;

    /**
     * <pre>
     * 字段名：用户Id
     * 变量名：userId
     * 类型：String(64)
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：频道名称
     * 变量名：name
     * 类型：String(64)
     * </pre>
     */
    protected String name;

    /**
     * <pre>
     * 字段名：频道描述
     * 变量名：description
     * 类型：String
     * </pre>
     */
    protected String description;

    /**
     * <pre>
     * 字段名：直播推流地址
     * 变量名：url
     * 类型：String
     * </pre>
     */
    protected String url;

    /**
     * <pre>
     * 字段名：直播流名称
     * 变量名：stream
     * 类型：String
     * </pre>
     */
    protected String stream;

    /**
     * <pre>
     * 字段名：LOGO图片
     * 变量名：logoImage
     * 类型：String
     * </pre>
     */
    protected String logoImage;

    /**
     * <pre>
     * 字段名：LOGO透明度
     * 变量名：logoOpacity （1表示完全不透明）
     * 类型：Int
     * </pre>
     */
    protected int logoOpacity;

    /**
     * <pre>
     * 字段名：LOGO位置
     * 变量名：logoPosition
     * 类型：String
     * </pre>
     */
    protected String logoPosition;

    /**
     * <pre>
     * 字段名：Logo的跳转链接
     * 变量名：logoHref
     * 类型：String
     * </pre>
     */
    protected String logoHref;

    /**
     * <pre>
     * 字段名：播放前显示的封面图
     * 变量名：coverImage
     * 类型：String
     * </pre>
     */
    protected String coverImage;

    /**
     * <pre>
     * 字段名：封面图的跳转链接
     * 变量名：coverHref
     * 类型：String
     * </pre>
     */
    protected String coverHref;

    /**
     * <pre>
     * 字段名：等待推流时的显示图片
     * 变量名：waitImage
     * 类型：String
     * </pre>
     */
    protected String waitImage;

    /**
     * <pre>
     * 字段名：等待推流时显示图片的跳转链接
     * 变量名：waitHref
     * 类型：String
     * </pre>
     */
    protected String waitHref;

    /**
     * <pre>
     * 字段名：切断流时的显示图片
     * 变量名：cutoffImage
     * 类型：String
     * </pre>
     */
    protected String cutoffImage;

    /**
     * <pre>
     * 字段名：切断流时显示图片的跳转链接
     * 变量名：cutoffHref
     * 类型：String
     * </pre>
     */
    protected String cutoffHref;

    /**
     * <pre>
     * 字段名：广告类型
     * 变量名：advertType
     * 类型：String
     * </pre>
     */
    protected String advertType;

    /**
     * <pre>
     * 字段名：广告时长
     * 变量名：advertDuration
     * 类型：Int
     * </pre>
     */
    protected int advertDuration;

    /**
     * <pre>
     * 字段名：广告区域宽度
     * 变量名：advertWidth
     * 类型：Int
     * </pre>
     */
    protected int advertWidth;

    /**
     * <pre>
     * 字段名：广告区域高度
     * 变量名：advertHeight
     * 类型：Int
     * </pre>
     */
    protected int advertHeight;

    /**
     * <pre>
     * 字段名：图片广告
     * 变量名：advertImage
     * 类型：String
     * </pre>
     */
    protected String advertImage;

    /**
     * <pre>
     * 字段名：广告的跳转链接
     * 变量名：advertHref
     * 类型：String
     * </pre>
     */
    protected String advertHref;

    /**
     * <pre>
     * 字段名：视频广告ID
     * 变量名：advertFlvVid
     * 类型：String
     * </pre>
     */
    protected String advertFlvVid;

    /**
     * <pre>
     * 字段名：视频广告链接
     * 变量名：advertFlvVid
     * 类型：String
     * </pre>
     */
    protected String advertFlvUrl;

    /**
     * <pre>
     * 字段名：播放器控制栏颜色
     * 变量名：playerColor
     * 类型：String
     * </pre>
     */
    protected String playerColor;

    /**
     * <pre>
     * 字段名：自动播放
     * 变量名：autoPlay
     * 类型：boolean
     * </pre>
     */
    protected boolean autoPlay;

    /**
     * <pre>
     * 字段名：一开始的暖场视频
     * 变量名：warmUpFlv
     * 类型：String
     * </pre>
     */
    protected String warmUpFlv;

    /**
     * <pre>
     * 字段名：观看密码限制，需要输入观看密码才能播放流
     * 变量名：passwdRestrict
     * 类型：boolean
     * </pre>
     */
    protected boolean passwdRestrict;

    /**
     * <pre>
     * 字段名：观看密码加密后的密文
     * 变量名：passwdEncrypted
     * 类型：String
     * </pre>
     */
    protected String passwdEncrypted;

    /**
     * <pre>
     * 字段名：仅推音频流
     * 变量名：isOnlyAudio
     * 类型：String
     * </pre>
     */
    protected String isOnlyAudio;

    /**
     * <pre>
     * 字段名：低延迟
     * 变量名：isLowLatency
     * 类型：String
     * </pre>
     */
    protected String isLowLatency;

    /**
     * <pre>
     * 字段名：直播拉流（播放）m3u8地址
     * 变量名：m3u8Url
     * 类型：String
     * </pre>
     */
    protected String m3u8Url;

    /**
     * <pre>
     * 字段名：直播拉流（播放）m3u8地址1
     * 变量名：m3u8Url1
     * 类型：String
     * </pre>
     */
    protected String m3u8Url1;

    /**
     * <pre>
     * 字段名：直播拉流（播放）m3u8地址2
     * 变量名：m3u8Url2
     * 类型：String
     * </pre>
     */
    protected String m3u8Url2;

    /**
     * <pre>
     * 字段名：直播拉流（播放）m3u8地址3
     * 变量名：m3u8Url3
     * 类型：String
     * </pre>
     */
    protected String m3u8Url3;

    /**
     * <pre>
     * 字段名：主持人姓名
     * 变量名：publisher
     * 类型：String
     * </pre>
     */
    protected String publisher;

    /**
     * <pre>
     * 字段名：频道的图标
     * 变量名：channelLogoImage
     * 类型：String
     * </pre>
     */
    protected String channelLogoImage;

    /**
     * <pre>
     * 字段名：服务器返回的时间戳（毫秒）
     * 变量名：currentTimeMillis
     * 类型：String
     * </pre>
     */
    protected Long currentTimeMillis;

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public int getLogoOpacity() {
        return logoOpacity;
    }

    public void setLogoOpacity(int logoOpacity) {
        this.logoOpacity = logoOpacity;
    }

    public String getLogoPosition() {
        return logoPosition;
    }

    public void setLogoPosition(String logoPosition) {
        this.logoPosition = logoPosition;
    }

    public String getLogoHref() {
        return logoHref;
    }

    public void setLogoHref(String logoHref) {
        this.logoHref = logoHref;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getCoverHref() {
        return coverHref;
    }

    public void setCoverHref(String coverHref) {
        this.coverHref = coverHref;
    }

    public String getWaitImage() {
        return waitImage;
    }

    public void setWaitImage(String waitImage) {
        this.waitImage = waitImage;
    }

    public String getWaitHref() {
        return waitHref;
    }

    public void setWaitHref(String waitHref) {
        this.waitHref = waitHref;
    }

    public String getCutoffImage() {
        return cutoffImage;
    }

    public void setCutoffImage(String cutoffImage) {
        this.cutoffImage = cutoffImage;
    }

    public String getCutoffHref() {
        return cutoffHref;
    }

    public void setCutoffHref(String cutoffHref) {
        this.cutoffHref = cutoffHref;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public int getAdvertDuration() {
        return advertDuration;
    }

    public void setAdvertDuration(int advertDuration) {
        this.advertDuration = advertDuration;
    }

    public int getAdvertWidth() {
        return advertWidth;
    }

    public void setAdvertWidth(int advertWidth) {
        this.advertWidth = advertWidth;
    }

    public int getAdvertHeight() {
        return advertHeight;
    }

    public void setAdvertHeight(int advertHeight) {
        this.advertHeight = advertHeight;
    }

    public String getAdvertImage() {
        return advertImage;
    }

    public void setAdvertImage(String advertImage) {
        this.advertImage = advertImage;
    }

    public String getAdvertHref() {
        return advertHref;
    }

    public void setAdvertHref(String advertHref) {
        this.advertHref = advertHref;
    }

    public String getAdvertFlvVid() {
        return advertFlvVid;
    }

    public void setAdvertFlvVid(String advertFlvVid) {
        this.advertFlvVid = advertFlvVid;
    }

    public String getAdvertFlvUrl() {
        return advertFlvUrl;
    }

    public void setAdvertFlvUrl(String advertFlvUrl) {
        this.advertFlvUrl = advertFlvUrl;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public boolean isAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    public String getWarmUpFlv() {
        return warmUpFlv;
    }

    public void setWarmUpFlv(String warmUpFlv) {
        this.warmUpFlv = warmUpFlv;
    }

    public boolean isPasswdRestrict() {
        return passwdRestrict;
    }

    public void setPasswdRestrict(boolean passwdRestrict) {
        this.passwdRestrict = passwdRestrict;
    }

    public String getPasswdEncrypted() {
        return passwdEncrypted;
    }

    public void setPasswdEncrypted(String passwdEncrypted) {
        this.passwdEncrypted = passwdEncrypted;
    }

    public String getIsOnlyAudio() {
        return isOnlyAudio;
    }

    public void setIsOnlyAudio(String isOnlyAudio) {
        this.isOnlyAudio = isOnlyAudio;
    }

    public String getIsLowLatency() {
        return isLowLatency;
    }

    public void setIsLowLatency(String isLowLatency) {
        this.isLowLatency = isLowLatency;
    }

    public String getM3u8Url() {
        return m3u8Url;
    }

    public void setM3u8Url(String m3u8Url) {
        this.m3u8Url = m3u8Url;
    }

    public String getM3u8Url1() {
        return m3u8Url1;
    }

    public void setM3u8Url1(String m3u8Url1) {
        this.m3u8Url1 = m3u8Url1;
    }

    public String getM3u8Url2() {
        return m3u8Url2;
    }

    public void setM3u8Url2(String m3u8Url2) {
        this.m3u8Url2 = m3u8Url2;
    }

    public String getM3u8Url3() {
        return m3u8Url3;
    }

    public void setM3u8Url3(String m3u8Url3) {
        this.m3u8Url3 = m3u8Url3;
    }

    public Long getCurrentTimeMillis() {
        return currentTimeMillis;
    }

    public void setCurrentTimeMillis(Long currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getChannelLogoImage() {
        return channelLogoImage;
    }

    public void setChannelLogoImage(String channelLogoImage) {
        this.channelLogoImage = channelLogoImage;
    }

    @Override
    public String toString() {
        return "PLChannelGetResult{" +
                "code=" + code +
                ", channelId=" + channelId +
                ", status='" + status + '\'' +
                ", userId='" + userId + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", stream='" + stream + '\'' +
                ", logoImage='" + logoImage + '\'' +
                ", logoOpacity=" + logoOpacity +
                ", logoPosition='" + logoPosition + '\'' +
                ", logoHref='" + logoHref + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", coverHref='" + coverHref + '\'' +
                ", waitImage='" + waitImage + '\'' +
                ", waitHref='" + waitHref + '\'' +
                ", cutoffImage='" + cutoffImage + '\'' +
                ", cutoffHref='" + cutoffHref + '\'' +
                ", advertType='" + advertType + '\'' +
                ", advertDuration=" + advertDuration +
                ", advertWidth=" + advertWidth +
                ", advertHeight=" + advertHeight +
                ", advertImage='" + advertImage + '\'' +
                ", advertHref='" + advertHref + '\'' +
                ", advertFlvVid='" + advertFlvVid + '\'' +
                ", advertFlvUrl='" + advertFlvUrl + '\'' +
                ", playerColor='" + playerColor + '\'' +
                ", autoPlay=" + autoPlay +
                ", warmUpFlv='" + warmUpFlv + '\'' +
                ", passwdRestrict=" + passwdRestrict +
                ", passwdEncrypted='" + passwdEncrypted + '\'' +
                ", isOnlyAudio='" + isOnlyAudio + '\'' +
                ", isLowLatency='" + isLowLatency + '\'' +
                ", m3u8Url='" + m3u8Url + '\'' +
                ", m3u8Url1='" + m3u8Url1 + '\'' +
                ", m3u8Url2='" + m3u8Url2 + '\'' +
                ", m3u8Url3='" + m3u8Url3 + '\'' +
                ", publisher='" + publisher + '\'' +
                ", channelLogoImage='" + channelLogoImage + '\'' +
                ", currentTimeMillis=" + currentTimeMillis +
                '}';
    }
}
