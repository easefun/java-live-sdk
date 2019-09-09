package net.polyv.live.bean.result.channel;

public class PLChannelBasicCreateResult extends PLChannelCreateResult {
    
    /**
     * <pre>
     * 字段名：频道主持人
     * 变量名：publisher
     * 类型：string
     * </pre>
     */
    protected String publisher;
    
    /**
     * <pre>
     * 字段名：频道Logo图片
     * 变量名：channelLogoImage
     * 类型：string
     * </pre>
     */
    protected String channelLogoImage;
    
    /**
     * <pre>
     * 字段名：频道直播场景。直播场景：alone 活动拍摄 ，ppt 三分屏 ，topclass 大班课
     * 变量名：scene
     * 类型：string
     * </pre>
     */
    protected String scene;
    
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
    
    public String getScene() {
        return scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }
    
    @Override
    public String toString() {
        return "PLChannelBasicCreateResult{" + "publisher='" + publisher + '\'' + ", channelLogoImage='" +
                channelLogoImage + '\'' + ", scene='" + scene + '\'' + ", channelId=" + channelId + ", userId='" +
                userId + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", url='" + url +
                '\'' + ", stream='" + stream + '\'' + ", logoImage='" + logoImage + '\'' + ", logoOpacity=" +
                logoOpacity + ", logoPosition='" + logoPosition + '\'' + ", logoHref='" + logoHref + '\'' +
                ", coverImage='" + coverImage + '\'' + ", coverHref='" + coverHref + '\'' + ", waitImage='" +
                waitImage + '\'' + ", waitHref='" + waitHref + '\'' + ", cutoffImage='" + cutoffImage + '\'' +
                ", cutoffHref='" + cutoffHref + '\'' + ", advertType='" + advertType + '\'' + ", advertDuration=" +
                advertDuration + ", advertWidth=" + advertWidth + ", advertHeight=" + advertHeight + ", advertImage='" +
                advertImage + '\'' + ", advertHref='" + advertHref + '\'' + ", advertFlvVid='" + advertFlvVid + '\'' +
                ", advertFlvUrl='" + advertFlvUrl + '\'' + ", playerColor='" + playerColor + '\'' + ", autoPlay=" +
                autoPlay + ", warmUpFlv='" + warmUpFlv + '\'' + ", passwdRestrict=" + passwdRestrict +
                ", passwdEncrypted='" + passwdEncrypted + '\'' + ", isOnlyAudio='" + isOnlyAudio + '\'' +
                ", isLowLatency='" + isLowLatency + '\'' + ", m3u8Url='" + m3u8Url + '\'' + ", m3u8Url1='" + m3u8Url1 +
                '\'' + ", m3u8Url2='" + m3u8Url2 + '\'' + ", m3u8Url3='" + m3u8Url3 + '\'' + ", currentTimeMillis=" +
                currentTimeMillis + ", code=" + code + ", status='" + status + '\'' + ", message='" + message + '\'' +
                '}';
    }
}
