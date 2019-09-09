package net.polyv.live.bean.result.user;

import net.polyv.live.bean.result.PLBaseResult;

/**
 * <pre>
 *  直播用户分钟数请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLUserDurationsGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 类型：String
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：可用分钟数
     * 变量名：available
     * 类型：Integer
     * </pre>
     */
    protected Integer available;

    /**
     * <pre>
     * 字段名：已使用分钟数
     * 变量名：used
     * 类型：Integer
     * </pre>
     */
    protected Integer used;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "PLUserDurationsGetResult{" +
                "userId='" + userId + '\'' +
                ", available=" + available +
                ", used=" + used +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
