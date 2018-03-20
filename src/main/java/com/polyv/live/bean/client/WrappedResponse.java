package com.polyv.live.bean.client;

/**
 * <pre>
 *  处理response的数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class WrappedResponse implements java.io.Serializable {

    private static final long serialVersionUID = 2271521171625442431L;

    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_FAIL = "fail";
    public static final String STATUS_ERROR = "error";

    /**
     * Contains the HTTP response status code as an integer.
     */
    private int code;

    /**
     * Contains the text: "success", "fail", or "error". Where "fail" is for HTTP status response values from 500-599, "error" is for
     * statuses 400-499, and "success" is for everything else (e.g. 1XX, 2XX and 3XX responses).
     */
    private String status;

    /**
     * Only used for "fail" and "error" statuses to contain the error message.
     * For internationalization (i18n) purpose, this could contain a message number or code, either alone or contained within delimiters.
     */
    private String message;

    /**
     * Contains the response body. In the case of "error" or "fail" statuses, this contains the cause, or exception name.
     */
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WrappedResponse other = (WrappedResponse) obj;
        if (code != other.code)
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WrappedResponse{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public WrappedResponse(int code, String status, String message, Object data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isRequestOk() {
        return 200 == this.code && this.status.equals(STATUS_SUCCESS);
    }
}
