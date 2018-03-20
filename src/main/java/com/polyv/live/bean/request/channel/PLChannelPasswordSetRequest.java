package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道设置密码对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelPasswordSetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：否
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：密码
     * 变量名：passwd
     * 是否必填：是
     * 类型：String(64)
     * 示例值：123456
     * 描述：直播频道的登录密码
     * </pre>
     */
    protected String passwd;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public PLChannelPasswordSetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelPasswordSetRequest{" +
                "channelId=" + channelId +
                ", appId='" + appId + '\'' +
                ", passwd='" + passwd + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
