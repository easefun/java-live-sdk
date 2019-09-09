package net.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.polyv.live.bean.client.WrappedResponse;
import net.polyv.live.bean.request.user.PLUserDurationsGetRequest;
import net.polyv.live.bean.result.user.PLUserDurationsGetResult;
import net.polyv.live.constant.PolyvLiveConstants;
import net.polyv.live.service.PLAbstractService;
import net.polyv.live.service.PLUserService;

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
     * @return 获取用户分钟数结果对象
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
