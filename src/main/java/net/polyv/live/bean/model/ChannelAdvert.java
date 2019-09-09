package net.polyv.live.bean.model;

/**
 * <pre>
 *  频道子广告数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelAdvert {

    /**
     * <pre>
     *  字段名：文字广告内容
     *  变量名：text
     *  类型：String
     * </pre>
     */
    private String text;

    /**
     * <pre>
     *  字段名：图片广告的图片URL
     *  变量名：img
     *  类型：String
     * </pre>
     */
    private String img;

    /**
     * <pre>
     *  字段名：跳转URL
     *  变量名：href
     *  类型：String
     * </pre>
     */
    private String href;

    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getImg() {
        return img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }
    
    public String getHref() {
        return href;
    }
    
    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "ChannelAdvert{" +
                "text='" + text + '\'' +
                ", img='" + img + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}
