package net.polyv.live.bean.request.account;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV获取频道下子频道列表对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelAccountsGetRequest extends PLBaseRequest {

    public PLChannelAccountsGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelGetRequest{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
