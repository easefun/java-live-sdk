package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.model.ChannelAdvert;
import com.polyv.live.bean.request.advert.PLChannelAdvertListGetRequest;
import com.polyv.live.bean.result.PLCommonListResult;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelAdvertService;

/**
 * <pre>
 *  直播频道广告接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelAdvertServiceImpl extends PLAbstractService implements PLChannelAdvertService {

    /**
     * <pre>
     * 获取频道下的轮播广告列表
     * </pre>
     *
     * @param request 获取频道的广告列表的参数对象。
     */
    public PLCommonListResult<ChannelAdvert> getAdvertList(PLChannelAdvertListGetRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_ADVERT_LIST_GET_URL,
                request.getParams(), GET_METHOD);
        PLCommonListResult<ChannelAdvert> result = new PLCommonListResult<ChannelAdvert>();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setT(JSONObject.parseArray(json, ChannelAdvert.class));
        }
        return getResult(response, result);
    }
}
