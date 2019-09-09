package net.polyv.live.bean.request.menu;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  频道菜单列表请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelMenuListGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：频道号
     * </pre>
     */
    protected Integer channelId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLChannelMenuListGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    /**
     * 必要参数构造函数
     * @param appId 加密ID
     * @param appSecret 加密secret
     * @param channelId 频道ID
     */
    public PLChannelMenuListGetRequest(String appId, String appSecret, Integer channelId) {
        super(appId, appSecret);
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "PLChannelMenuListGetRequest{" +
                "channelId=" + channelId +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
