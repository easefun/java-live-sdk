package net.polyv.live.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.polyv.live.bean.client.WrappedResponse;
import net.polyv.live.bean.model.ChannelAdvert;
import net.polyv.live.bean.request.advert.PLChannelAdvertListGetRequest;
import net.polyv.live.bean.result.PLCommonListResult;
import net.polyv.live.constant.PolyvLiveConstants;
import net.polyv.live.service.PLAbstractService;
import net.polyv.live.service.PLChannelAdvertService;

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
