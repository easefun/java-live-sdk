package com.polyv.live.bean.request.menu;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  频道自定义菜单设置请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelCustomMenuSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：菜单类型（现只支持desc）
     * 变量名：menuType
     * 是否必填：是
     * 类型：String
     * 示例值：desc
     * 描述：菜单类型
     * </pre>
     */
    protected String menuType;

    /**
     * <pre>
     * 字段名：菜单内容
     * 变量名：content
     * 是否必填：是
     * 类型：String
     * 示例值：菜单
     * 描述：用于设置频道菜单的展示内容
     * </pre>
     */
    protected String content;

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PLChannelCustomMenuSetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    /**
     * 必要参数构造函数
     * @param appId 加密ID
     * @param appSecret 加密secret
     * @param content 菜单内容
     */
    public PLChannelCustomMenuSetRequest(String appId, String appSecret, String content) {
        super(appId, appSecret);
        this.menuType = "desc";
        this.content = content;
    }

    @Override
    public String toString() {
        return "PLChannelCustomMenuSetRequest{" +
                "menuType='" + menuType + '\'' +
                ", content='" + content + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
