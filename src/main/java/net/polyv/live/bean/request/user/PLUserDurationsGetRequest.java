package net.polyv.live.bean.request.user;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  获取用户分钟数请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLUserDurationsGetRequest extends PLBaseRequest {

    public PLUserDurationsGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLUserDurationsGetRequest{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
