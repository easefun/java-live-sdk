package net.polyv.live.bean.request.donate;

import net.polyv.live.bean.model.DonateGoods;
import net.polyv.live.bean.request.PLBaseRequest;

import java.util.List;

/**
 * <pre>
 *  频道道具打赏设置请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLDonateGoodsSetRequest extends PLBaseRequest {

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
     * 字段名：道具打赏请求体对象
     * 变量名：requestBody
     * 是否必填：是
     * 类型：PLDonateGoodsBody
     * 示例值：
     * 描述：道具打赏请求体对象
     * </pre>
     */
    protected PLDonateGoodsBody requestBody;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLDonateGoodsBody getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(PLDonateGoodsBody requestBody) {
        this.requestBody = requestBody;
    }

    /**
     * 带参数的打赏的构造函数
     * @param channelId 频道ID
     * @param goods 道具打赏列表
     */
    public PLDonateGoodsSetRequest(String appId, String appSecret, Integer channelId, List<DonateGoods> goods) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.requestBody = new PLDonateGoodsBody(goods, null);
    }

    /**
     * 带参数的打赏的构造函数
     * @param goods 道具打赏列表
     */
    public PLDonateGoodsSetRequest(String appId, String appSecret, List<DonateGoods> goods) {
        super(appId, appSecret);
        this.requestBody = new PLDonateGoodsBody(goods, null);
    }

    /**
     * 带参数的打赏的构造函数
     * @param channelId 频道ID
     * @param goods 道具打赏列表
     * @param enabled 开关
     */
    public PLDonateGoodsSetRequest(String appId, String appSecret, Integer channelId, List<DonateGoods> goods,
                                   String enabled) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.requestBody = new PLDonateGoodsBody(goods, enabled);
    }

    /**
     * 带参数的打赏的构造函数
     * @param goods 道具打赏列表
     * @param enabled 开关
     */
    public PLDonateGoodsSetRequest(String appId, String appSecret, List<DonateGoods> goods, String enabled) {
        super(appId, appSecret);
        this.requestBody = new PLDonateGoodsBody(goods, enabled);
    }

    @Override
    public String toString() {
        return "PLDonateGoodsSetRequest{" +
                "channelId=" + channelId +
                ", requestBody=" + requestBody +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
