package com.polyv.live.service.impl;

import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.channel.PLChannelBasicCreateBody;
import com.polyv.live.bean.request.channel.PLChannelBasicCreateRequest;
import com.polyv.live.bean.request.channel.PLChannelBasicUpdateBody;
import com.polyv.live.bean.request.channel.PLChannelBasicUpdateRequest;
import com.polyv.live.bean.result.channel.PLChannelCommonResult;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelBasicService;

/**
 * <pre>
 *  POLYV直播频道basic相关接口
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicServiceImpl extends PLAbstractService implements PLChannelBasicService {
    
    @Override
    public PLChannelCommonResult createChannel(PLChannelBasicCreateRequest request, PLChannelBasicCreateBody body) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_BASIC_CREATE_URL, request.getParams(), POST_METHOD, body);
        PLChannelCommonResult result = new PLChannelCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getData());
        }
        return this.getResult(response, result);
    }
    
    @Override
    public PLChannelCommonResult updateChannel(PLChannelBasicUpdateRequest request, PLChannelBasicUpdateBody body) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_BASIC_UPDATE_URL, request.getParams(), POST_METHOD, body);
        PLChannelCommonResult result = new PLChannelCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getData());
        }
        return getResult(response, result);
    }
}
