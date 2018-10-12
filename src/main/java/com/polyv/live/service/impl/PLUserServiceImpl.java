package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.user.PLUserDurationsGetRequest;
import com.polyv.live.bean.result.user.PLUserDurationsGetResult;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLUserService;

/**
 * <pre>
 *  直播用户接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLUserServiceImpl extends PLAbstractService implements PLUserService {

    /**
     * <pre>
     * 获取用户分钟数
     * </pre>
     *
     * @param request 获取用户分钟数的参数对象。
     */
    public PLUserDurationsGetResult getDurations(PLUserDurationsGetRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.USER_DURATION_GET_URL, request.getParams(), GET_METHOD);
        PLUserDurationsGetResult result = new PLUserDurationsGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLUserDurationsGetResult.class);
        }
        return getResult(response, result);
    }

}
