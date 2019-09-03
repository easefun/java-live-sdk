package com.polyv.live.service;

import com.polyv.live.bean.model.ChannelAdvert;
import com.polyv.live.bean.request.advert.PLChannelAdvertListGetRequest;
import com.polyv.live.bean.result.PLCommonListResult;

/**
 * <pre>
 *  直播频道的广告相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelAdvertService extends PLBaseService {

    /**
     * <pre>
     * 获取频道下的轮播广告列表(详见)
     * 该接口提供用户查询频道下轮播广告列表信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道轮播广告列表用于管理；
     * ◆ 业务需要获取频道轮播广告列表用于前端展示；
     * 接口地址：https://api.polyv.net/live/v3/channel/advert/list
     * </pre>
     *
     * @param request   获取频道的广告列表的参数对象。
     */
    PLCommonListResult<ChannelAdvert> getAdvertList(PLChannelAdvertListGetRequest request);

}
