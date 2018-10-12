package com.polyv.live.bean.request.donate;

import com.polyv.live.bean.model.DonateGoods;
import com.polyv.live.bean.request.PLBaseBody;

import java.util.List;

/**
 * <pre>
 *  频道现金打赏请求体对象
 * </pre>
 *
 * @author HuangYF
 */
public class PLDonateGoodsBody extends PLBaseBody {

    /**
     * <pre>
     * 字段名：道具打赏列表
     * 变量名：goods
     * 是否必填：是
     * 类型：List
     * 示例值：[1.00, 2.00, 1.00, 2.00, 1.00, 2.00]
     * 描述：道具打赏列表（道具对象数量必须大于0小于10）
     * </pre>
     */
    protected List<DonateGoods> goods;

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

    public List<DonateGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<DonateGoods> goods) {
        this.goods = goods;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public PLDonateGoodsBody(List<DonateGoods> goods, String enabled) {
        this.goods = goods;
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "PLDonateGoodsBody{" +
                "goods=" + goods +
                ", enabled='" + enabled + '\'' +
                '}';
    }
}