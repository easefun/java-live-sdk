package com.polyv.live.bean.client;

/**
 * <pre>
 *  处理v1接口response的数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class WrappedResponseV1 implements java.io.Serializable {

    private static final long serialVersionUID = 2271521171625442431L;

    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_FAIL = "failure";

    /**
     * Contains the HTTP response status code as an integer.
     */
    private String code;

    /**
     * Contains the text: "success", "fail", or "error". Where "fail" is for HTTP status response values from 500-599, "error" is for
     * statuses 400-499, and "success" is for everything else (e.g. 1XX, 2XX and 3XX responses).
     */
    private String status;

    /**
     * Only used for "fail" and "error" statuses to contain the error message.
     * For internationalization (i18n) purpose, this could contain a message number or code, either alone or contained within delimiters.
     */
    private String msg;

    /**
     * Contains the response body. In the case of "error" or "fail" statuses, this contains the cause, or exception name.
     */
    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "WrappedResponseV1{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }

    public WrappedResponseV1(String code, String status, String msg, Object result) {
        this.code = code;
        this.status = status;
        this.msg = msg;
        this.result = result;
    }

    public boolean isRequestOk() {
        return this.status.equals(STATUS_SUCCESS);
    }
}
