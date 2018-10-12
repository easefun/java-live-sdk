package com.polyv.live.bean.request.donate;

import com.polyv.live.bean.request.PLBaseBody;

import java.math.BigDecimal;
import java.util.List;

/**
 * <pre>
 *  频道现金打赏请求体对象
 * </pre>
 *
 * @author HuangYF
 */
public class PLDonateCashBody extends PLBaseBody {

    /**
     * <pre>
     * 字段名：现金打赏金额
     * 变量名：cashes
     * 是否必填：是
     * 类型：List
     * 示例值：[1.00, 2.00, 1.00, 2.00, 1.00, 2.00]
     * 描述：现金打赏金额（数组的长度必须为6）
     * </pre>
     */
    protected List<Double> cashes;

    /**
     * <pre>
     * 字段名：现金打赏自定义最小金额
     * 变量名：cashMin
     * 是否必填：是
     * 类型：Double
     * 示例值：1.00
     * 描述：现金打赏自定义最小金额
     * </pre>
     */
    protected Double cashMin;

    /**
     * <pre>
     * 字段名：现金打赏开关
     * 变量名：enabled
     * 是否必填：否
     * 类型：List
     * 示例值：[1.00, 2.00]
     * 描述：不传默认开启，值为 Y/N , Y为开启
     * </pre>
     */
    protected String enabled;

    public List<Double> getCashes() {
        return cashes;
    }

    public void setCashes(List<Double> cashes) {
        this.cashes = cashes;
    }

    public Double getCashMin() {
        return cashMin;
    }

    public void setCashMin(Double cashMin) {
        this.cashMin = cashMin;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public PLDonateCashBody(List<Double> cashes, Double cashMin, String enabled) {
        this.cashes = cashes;
        this.cashMin = cashMin;
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "DonateCashBody{" +
                "cashes=" + cashes +
                '}';
    }
}