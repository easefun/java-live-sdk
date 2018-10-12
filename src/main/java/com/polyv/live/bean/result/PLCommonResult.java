package com.polyv.live.bean.result;

/**
 * <pre>
 *  公用请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLCommonResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：返回请求详细结果
     * 变量名：data
     * 类型：Object
     * </pre>
     */
    protected Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PLChannelCommonResult{" +
                "code=" + code +
                ", data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
