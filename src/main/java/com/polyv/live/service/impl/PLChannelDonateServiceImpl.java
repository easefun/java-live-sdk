package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.donate.PLChannelDonateGetRequest;
import com.polyv.live.bean.request.donate.PLDonateCashSetRequest;
import com.polyv.live.bean.request.donate.PLDonateGoodsSetRequest;
import com.polyv.live.bean.result.PLCommonResult;
import com.polyv.live.bean.result.donate.PLChannelDonateGetResult;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelDonateService;

/**
 * <pre>
 *  直播打赏接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelDonateServiceImpl extends PLAbstractService implements PLChannelDonateService {

    /**
     * <pre>
     * 获取频道打赏设置
     * </pre>
     *
     * @param request 获取频道打赏设置的参数对象。
     */
    public PLChannelDonateGetResult getDonateSetting(PLChannelDonateGetRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_DONATE_GET_URL, request.getParams(), GET_METHOD);
        PLChannelDonateGetResult result = new PLChannelDonateGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelDonateGetResult.class);
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 频道现金打赏设置
     * </pre>
     *
     * @param request 设置频道现金打赏的参数对象。
     */
    public PLCommonResult setDonateCash(PLDonateCashSetRequest request) {
        return getPLCommonResult(PolyvLiveConstants.CASH_DONATE_SET_URL, null,
                request.getParams(), POST_METHOD, request.getRequestBody());
    }

    /**
     * <pre>
     * 频道道具打赏设置
     * </pre>
     *
     * @param request 设置频道道具打赏的参数对象。
     */
    public PLCommonResult setDonateGoods(PLDonateGoodsSetRequest request) {
        return getPLCommonResult(PolyvLiveConstants.GOOD_DONATE_SET_URL, null,
                request.getParams(), POST_METHOD, request.getRequestBody());
    }

}
