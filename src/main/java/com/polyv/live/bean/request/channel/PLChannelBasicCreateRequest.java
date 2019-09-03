package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV创建频道请求接口对象
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicCreateRequest extends PLBaseRequest {
    
    public PLChannelBasicCreateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }
}
