package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

public class PLChannelBasicUpdateRequest extends PLBaseRequest {
    
    private Integer channelId;
    
    public PLChannelBasicUpdateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }
    
    public Integer getChannelId() {
        return channelId;
    }
    
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}
