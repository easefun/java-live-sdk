package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道最大在线人数对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelMaxViewerSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：POLYV用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：edvf2fpec9
     * 描述：POLYV账号的直播用户ID
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：频道最多在线人数
     * 变量名：maxViewer
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：3
     * 描述：设置频道直播中进入直播的最大在线人数
     * </pre>
     */
    protected String maxViewer;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMaxViewer() {
        return maxViewer;
    }

    public void setMaxViewer(String maxViewer) {
        this.maxViewer = maxViewer;
    }

    public PLChannelMaxViewerSetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelViewerSetRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", maxViewer='" + maxViewer + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
