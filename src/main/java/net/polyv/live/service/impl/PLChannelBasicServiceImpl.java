package net.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.polyv.live.bean.client.WrappedResponse;
import net.polyv.live.bean.request.channel.PLChannelBasicCreateRequest;
import net.polyv.live.bean.request.channel.PLChannelBasicUpdateRequest;
import net.polyv.live.bean.result.channel.PLChannelBasicCreateResult;
import net.polyv.live.bean.result.channel.PLChannelCommonResult;
import net.polyv.live.constant.PolyvLiveConstants;
import net.polyv.live.service.PLAbstractService;
import net.polyv.live.service.PLChannelBasicService;

/**
 * <pre>
 *  POLYV直播频道basic相关接口
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicServiceImpl extends PLAbstractService implements PLChannelBasicService {

    /**
     * <pre>
     * 创建频道
     * </pre>
     *
     * @param request 创建频道需要的参数对象。
     */
    public PLChannelBasicCreateResult createChannel(PLChannelBasicCreateRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_BASIC_CREATE_URL, request.getParams(), POST_METHOD, request.getRequestBody());
        PLChannelBasicCreateResult result = new PLChannelBasicCreateResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelBasicCreateResult.class);
        }
        return this.getResult(response, result);
    }

    /**
     * <pre>
     * 创建频道
     * </pre>
     *
     * @param request 创建频道需要的参数对象。
     */
    public PLChannelCommonResult updateChannel(PLChannelBasicUpdateRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_BASIC_UPDATE_URL, request.getParams(), POST_METHOD, request.getRequestBody());
        PLChannelCommonResult result = new PLChannelCommonResult();
        if (response.isRequestOk()) {
            result.setData(response.getData());
        }
        return getResult(response, result);
    }
}
