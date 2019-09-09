package net.polyv.live.bean.result.donate;

import net.polyv.live.bean.model.DonateGoods;
import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  获取频道打赏设置请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDonateGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：是否应用全局设置
     * 变量名：globalSettingEnabled
     * 类型：String
     * </pre>
     */
    protected String globalSettingEnabled;

    /**
     * <pre>
     * 字段名：现金打赏开关
     * 变量名：donateCashEnabled
     * 类型：String
     * </pre>
     */
    protected String donateCashEnabled;

    /**
     * <pre>
     * 字段名：道具打赏开关
     * 变量名：donateGoodEnabled
     * 类型：String
     * </pre>
     */
    protected String donateGoodEnabled;

    /**
     * <pre>
     * 字段名：打赏提示
     * 变量名：donateTips
     * 类型：String
     * </pre>
     */
    protected String donateTips;

    /**
     * <pre>
     * 字段名：	最低打赏金额
     * 变量名：cashMin
     * 类型：Integer
     * </pre>
     */
    protected Integer cashMin;

    /**
     * <pre>
     * 字段名：打赏金额选项
     * 变量名：cashes
     * 类型：List
     * </pre>
     */
    protected List<Integer> cashes;

    /**
     * <pre>
     * 字段名：打赏道具选项
     * 变量名：goods
     * 类型：List
     * </pre>
     */
    protected List<DonateGoods> goods;

    public String getGlobalSettingEnabled() {
        return globalSettingEnabled;
    }

    public void setGlobalSettingEnabled(String globalSettingEnabled) {
        this.globalSettingEnabled = globalSettingEnabled;
    }

    public String getDonateCashEnabled() {
        return donateCashEnabled;
    }

    public void setDonateCashEnabled(String donateCashEnabled) {
        this.donateCashEnabled = donateCashEnabled;
    }

    public String getDonateGoodEnabled() {
        return donateGoodEnabled;
    }

    public void setDonateGoodEnabled(String donateGoodEnabled) {
        this.donateGoodEnabled = donateGoodEnabled;
    }

    public String getDonateTips() {
        return donateTips;
    }

    public void setDonateTips(String donateTips) {
        this.donateTips = donateTips;
    }

    public Integer getCashMin() {
        return cashMin;
    }

    public void setCashMin(Integer cashMin) {
        this.cashMin = cashMin;
    }

    public List<Integer> getCashes() {
        return cashes;
    }

    public void setCashes(List<Integer> cashes) {
        this.cashes = cashes;
    }

    public List<DonateGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<DonateGoods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "PLChannelDonateGetResult{" +
                "globalSettingEnabled='" + globalSettingEnabled + '\'' +
                ", donateCashEnabled='" + donateCashEnabled + '\'' +
                ", donateGoodEnabled='" + donateGoodEnabled + '\'' +
                ", donateTips='" + donateTips + '\'' +
                ", cashMin=" + cashMin +
                ", cashes=" + cashes +
                ", goods=" + goods +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
