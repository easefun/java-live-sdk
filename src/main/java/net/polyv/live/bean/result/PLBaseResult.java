package net.polyv.live.bean.result;

/**
 * <pre>
 *  POLYV直播API共用响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public abstract class PLBaseResult {

    /**
     * <pre>
     * 字段名：响应码
     * 变量名：code
     * 类型：int(11)
     * </pre>
     */
    protected int code;

    /**
     * <pre>
     * 字段名：请求状态
     * 变量名：status
     * 类型：String(64)
     * </pre>
     */
    protected String status;

    /**
     * <pre>
     * 字段名：错误信息
     * 变量名：message
     * 类型：String(64)
     * </pre>
     */
    protected String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PLBaseResult{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    /**
     * 判断请求是否成功
     * @return true/false
     */
    public boolean isRequestOk() {
        return 200 == this.code;
    }
}
