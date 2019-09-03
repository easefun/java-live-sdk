package com.polyv.live.service.impl;

import com.polyv.live.bean.model.ChannelAdvert;
import com.polyv.live.bean.request.advert.PLChannelAdvertListGetRequest;
import com.polyv.live.bean.result.PLCommonListResult;
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
    public PLCommonListResult<ChannelAdvert> getAccounts(PLChannelAdvertListGetRequest request) {
        return null;
    }
}
