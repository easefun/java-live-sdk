package com.polyv.live.bean.request.channel;

/**
 * <pre>
 *  POLYV创建频道基本设置对象
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicSettingCreateBody {
    
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
     * 字段名：自动播放
     * 变量名：autoPlay
     * 是否必填：否
     * 类型：int
     * 示例值：1
     * 描述：是否自动播放，0/1，默认1
     * </pre>
     */
    private Integer autoPlay;

    /**
     * <pre>
     * 字段名：播放器颜色
     * 变量名：playerColor
     * 是否必填：否
     * 类型：string
     * 示例值：#666666
     * 描述：播放器控制栏颜色
     * </pre>
     */
    private String playerColor;

    /**
     * <pre>
     * 字段名：直播场景
     * 变量名：scene
     * 是否必填：否
     * 类型：string
     * 示例值：ppt
     * 描述：alone 活动拍摄，ppt 三分屏，topclass 大班课
     * </pre>
     */
    private String scene;

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
    
    public Long getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
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
}
