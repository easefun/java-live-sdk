package com.polyv.live.bean.result;

import java.util.List;

/**
 * <pre>
 *  列表请求响应公共对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLCommonListResult<T> extends PLBaseResult {

    /**
     * <pre>
     * 字段名：返回请求列表结果
     * 变量名：t
     * 类型：请求
     * </pre>
     */
    protected List<T> t;

    public List<T> getT() {
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "PLCommonListResult{" +
                "t=" + t +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
