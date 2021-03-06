package net.polyv.live.service;

import net.polyv.live.bean.request.user.PLUserDurationsGetRequest;
import net.polyv.live.bean.result.user.PLUserDurationsGetResult;

/**
 * <pre>
 *  直播频道菜单相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLUserService extends PLBaseService {

    /**
     * <pre>
     * 获取用户分钟数(详见http://dev.polyv.net/2017/liveproduct/l-api/hqzbxx/get-user-durations/)
     * 该接口提供用户分钟数信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取分钟数的信息；
     * 接口地址：http://api.polyv.net/live/v2/user/get-user-durations
     * </pre>
     *
     * @param request 获取用户分钟数的参数对象。
     * @return 获取用户分钟数结果对象
     */
    PLUserDurationsGetResult getDurations(PLUserDurationsGetRequest request);

}
