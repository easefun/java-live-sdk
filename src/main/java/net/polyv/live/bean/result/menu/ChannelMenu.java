package net.polyv.live.bean.result.menu;

/**
 * <pre>
 *  频道菜单信息
 * </pre>
 *
 * @author HuangYF
 */
public class ChannelMenu {

    /**
     * <pre>
     *  字段名：菜单ID
     *  变量名：menuId
     *  类型：String
     * </pre>
     */
    protected String menuId;

    /**
     * <pre>
     *  字段名：菜单类型
     *  变量名：menu
     *  类型：String
     * </pre>
     */
    protected String menuType;

    /**
     * <pre>
     *  字段名：菜单名称
     *  变量名：name
     *  类型：String
     * </pre>
     */
    protected String name;

    /**
     * <pre>
     *  字段名：菜单排序
     *  变量名：ordered
     *  类型：String
     * </pre>
     */
    protected Integer ordered;

    /**
     * <pre>
     *  字段名：菜单内容
     *  变量名：content
     *  类型：String
     * </pre>
     */
    protected String content;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChannelMenu{" +
                "menuId='" + menuId + '\'' +
                ", menuType='" + menuType + '\'' +
                ", name='" + name + '\'' +
                ", ordered=" + ordered +
                ", content='" + content + '\'' +
                '}';
    }
}
