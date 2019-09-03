package com.polyv.live.bean.request.advert;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道获取轮播广告列表对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelAdvertListGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public PLChannelAdvertListGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    public PLChannelAdvertListGetRequest(String appId, String appSecret, Integer channelId) {
        super(appId, appSecret);
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "PLChannelAdvertListGetRequest{" +
                "channelId=" + channelId +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
