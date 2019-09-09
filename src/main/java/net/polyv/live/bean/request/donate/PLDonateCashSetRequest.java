package net.polyv.live.bean.request.donate;

import net.polyv.live.bean.request.PLBaseRequest;

import java.util.List;

/**
 * <pre>
 *  频道现金打赏设置请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLDonateCashSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Integer
     * 示例值：10001
     * 描述：直播账号下的频道号
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：现金打赏请求体对象
     * 变量名：requestBody
     * 是否必填：是
     * 类型：PLDonateCashBody
     * 示例值：
     * 描述：现金打赏请求体对象
     * </pre>
     */
    protected PLDonateCashBody requestBody;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLDonateCashBody getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(PLDonateCashBody requestBody) {
        this.requestBody = requestBody;
    }

    /**
     * 带参数的打赏的构造函数
     * @param channelId 频道ID
     * @param cashes 现金打赏金额列表
     * @param cashMin 最新金额
     */
    public PLDonateCashSetRequest(String appId, String appSecret, Integer channelId, List<Double> cashes,
                                  Double cashMin) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.requestBody = new PLDonateCashBody(cashes, cashMin, null);
    }

    /**
     * 带参数的打赏的构造函数
     * @param channelId 频道ID
     * @param cashes 现金打赏金额列表
     * @param cashMin 最新金额
     * @param enabled 开关
     */
    public PLDonateCashSetRequest(String appId, String appSecret, Integer channelId, List<Double> cashes,
                                  Double cashMin, String enabled) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.requestBody = new PLDonateCashBody(cashes, cashMin, enabled);
    }

    /**
     * 带参数的打赏的构造函数
     * @param cashes 现金打赏金额列表
     * @param cashMin 最新金额
     */
    public PLDonateCashSetRequest(String appId, String appSecret, List<Double> cashes, Double cashMin) {
        super(appId, appSecret);
        this.requestBody = new PLDonateCashBody(cashes, cashMin, null);
    }

    /**
     * 带参数的打赏的构造函数
     * @param cashes 现金打赏金额列表
     * @param cashMin 最新金额
     * @param enabled 开关
     */
    public PLDonateCashSetRequest(String appId, String appSecret, List<Double> cashes, Double cashMin,
                                  String enabled) {
        super(appId, appSecret);
        this.requestBody = new PLDonateCashBody(cashes, cashMin, enabled);
    }

    @Override
    public String toString() {
        return "PLDonateCashSetRequest{" +
                "channelId=" + channelId +
                ", requestBody=" + requestBody +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
