package com.polyv.live.bean.request.channel;

public class PLChannelBasicSettingUpdateBody {
    
    /**
     * <pre>
     * 字段名：频道名称
     * 变量名：name
     * 是否必填：是
     * 类型：string
     * 示例值：频道1
     * 描述：频道显示名称
     * </pre>
     */
    private String name;
    
    /**
     * <pre>
     * 字段名：频道密码
     * 变量名：channelPasswd
     * 是否必填：是
     * 类型：string
     * 示例值：666
     * 描述：频道密码,长度不能超过16位
     * </pre>
     */
    private String channelPasswd;
    
    /**
     * <pre>
     * 字段名：在线人数
     * 变量名：maxViewer
     * 是否必填：否
     * 类型：int
     * 示例值：20
     * 描述：最大在线人数
     * </pre>
     */
    private Integer maxViewer;
    
    /**
     * <pre>
     * 字段名：直播内容
     * 变量名：desc
     * 是否必填：否
     * 类型：string
     * 示例值：
     * 描述：直播介绍的内容
     * </pre>
     */
    private String desc;
    
    /**
     * <pre>
     * 字段名：支持人
     * 变量名：publisher
     * 是否必填：否
     * 类型：string
     * 示例值：
     * 描述：支持人昵称
     * </pre>
     */
    private String publisher;
    
    /**
     * <pre>
     * 字段名：目录Id
     * 变量名：categoryId
     * 是否必填：否
     * 类型：int
     * 示例值：
     * 描述：新建频道的所属分类，如果不提交，则为默认分类（分类ID可通过“获取直播分类”接口得到）
     * </pre>
     */
    private Integer categoryId;
    
    /**
     * <pre>
     * 字段名：直播时间
     * 变量名：startTime
     * 是否必填：否
     * 类型：long
     * 示例值：
     * 描述：直播开始时间，13位时间戳
     * </pre>
     */
    private Long startTime;
    
    /**
     * <pre>
     * 字段名：引导页开关
     * 变量名：splashEnabled
     * 是否必填：否
     * 类型：string
     * 示例值：Y
     * 描述：引导页开关Y,N
     * </pre>
     */
    private String splashEnabled;
    
    /**
     * <pre>
     * 字段名：频道引导图
     * 变量名：splashImg
     * 是否必填：否
     * 类型：string
     * 示例值：https://www.baidu.com/sdf.png
     * 描述：url
     * </pre>
     */
    private String splashImg;
    
    /**
     * <pre>
     * 字段名：频道提问开关
     * 变量名：consultingMenuEnable
     * 是否必填：否
     * 类型：string
     * 示例值：Y
     * 描述：频道提问开关Y,N
     * </pre>
     */
    private String consultingMenuEnable;
    
    /**
     * <pre>
     * 字段名：累计观看数
     * 变量名：pageView
     * 是否必填：否
     * 类型：long
     * 示例值：120
     * 描述：累计观看数
     * </pre>
     */
    private Long pageView;
    
    /**
     * <pre>
     * 字段名：累计点赞数
     * 变量名：likes
     * 是否必填：否
     * 类型：long
     * 示例值：120
     * 描述：累计点赞数
     * </pre>
     */
    private Long likes;
    
    /**
     * <pre>
     * 字段名：频道图标
     * 变量名：coverImg
     * 是否必填：否
     * 类型：string
     * 示例值：https://www.baidu.com/sdf.png
     * 描述：频道图标,url
     * </pre>
     */
    private String coverImg;
    
    /**
     * <pre>
     * 字段名：最大在线人数限制开关
     * 变量名：maxViewerRestrict
     * 是否必填：否
     * 类型：string
     * 示例值：Y
     * 描述：最大在线人数限制开关Y,N
     * </pre>
     */
    private Integer maxViewerRestrict;
    
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
    
    public Integer getMaxViewer() {
        return maxViewer;
    }
    
    public void setMaxViewer(Integer maxViewer) {
        this.maxViewer = maxViewer;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public Integer getCategoryId() {
        return categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    
    public Long getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    
    public String getSplashEnabled() {
        return splashEnabled;
    }
    
    public void setSplashEnabled(String splashEnabled) {
        this.splashEnabled = splashEnabled;
    }
    
    public String getSplashImg() {
        return splashImg;
    }
    
    public void setSplashImg(String splashImg) {
        this.splashImg = splashImg;
    }
    
    public String getConsultingMenuEnable() {
        return consultingMenuEnable;
    }
    
    public void setConsultingMenuEnable(String consultingMenuEnable) {
        this.consultingMenuEnable = consultingMenuEnable;
    }
    
    public Long getPageView() {
        return pageView;
    }
    
    public void setPageView(Long pageView) {
        this.pageView = pageView;
    }
    
    public Long getLikes() {
        return likes;
    }
    
    public void setLikes(Long likes) {
        this.likes = likes;
    }
    
    public String getCoverImg() {
        return coverImg;
    }
    
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }
    
    public Integer getMaxViewerRestrict() {
        return maxViewerRestrict;
    }
    
    public void setMaxViewerRestrict(Integer maxViewerRestrict) {
        this.maxViewerRestrict = maxViewerRestrict;
    }
}
