package net.polyv.live.bean.model;

import java.math.BigDecimal;

/**
 * <pre>
 *  打赏道具开关数据对象
 * </pre>
 *
 * @author HuangYF
 */
public class DonateGoods {

    /**
     * <pre>
     *  字段名：道具名称
     *  变量名：goodName
     *  类型：String
     * </pre>
     */
    protected String goodName;

    /**
     * <pre>
     *  字段名：道具图片
     *  变量名：goodImg
     *  类型：String
     * </pre>
     */
    protected String goodImg;

    /**
     * <pre>
     *  字段名：道具价格
     *  变量名：goodPrice
     *  类型：BigDecimal
     * </pre>
     */
    protected BigDecimal goodPrice;

    /**
     * <pre>
     *  字段名：道具开关
     *  变量名：goodEnabled
     *  类型：String
     * </pre>
     */
    protected String goodEnabled;

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodEnabled() {
        return goodEnabled;
    }

    public void setGoodEnabled(String goodEnabled) {
        this.goodEnabled = goodEnabled;
    }

    @Override
    public String toString() {
        return "GoodDonate{" +
                "goodName='" + goodName + '\'' +
                ", goodImg='" + goodImg + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodEnabled='" + goodEnabled + '\'' +
                '}';
    }
}