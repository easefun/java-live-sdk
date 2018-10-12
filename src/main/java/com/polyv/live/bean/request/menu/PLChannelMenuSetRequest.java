package com.polyv.live.bean.request.menu;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  频道菜单设置请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelMenuSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：菜单ID（互动聊天或咨询提问的菜单ID不允许设置）
     * 变量名：menuId
     * 是否必填：是
     * 类型：String
     * 示例值：menu
     * 描述：菜单ID
     * </pre>
     */
    protected String menuId;

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

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PLChannelMenuSetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    /**
     * 必要参数构造函数
     * @param appId 加密ID
     * @param appSecret 加密secret
     * @param menuId 菜单ID
     * @param content 菜单内容
     */
    public PLChannelMenuSetRequest(String appId, String appSecret, String menuId, String content) {
        super(appId, appSecret);
        this.menuId = menuId;
        this.content = content;
    }

    @Override
    public String toString() {
        return "PLChannelMenuSetRequest{" +
                "menuId='" + menuId + '\'' +
                ", content='" + content + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
