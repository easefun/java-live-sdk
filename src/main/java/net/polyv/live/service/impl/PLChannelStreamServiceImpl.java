package net.polyv.live.service.impl;

import net.polyv.live.bean.request.stream.PLChannelStreamCommonRequest;
import net.polyv.live.bean.result.PLCommonResult;
import net.polyv.live.constant.PolyvLiveConstants;
import net.polyv.live.service.PLAbstractService;
import net.polyv.live.service.PLChannelStreamService;

/**
 * <pre>
 *  直播频道流处理请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelStreamServiceImpl extends PLAbstractService implements PLChannelStreamService {

    /**
     * <pre>
     * 频道禁流接口
     * </pre>
     *
     * @param channelId 频道ID
     * @param request   频道流公共的参数对象。
     * @return 公共结果对象
     */
    public PLCommonResult cutoff(int channelId, PLChannelStreamCommonRequest request) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_STREAM_CUTOFF_URL, channelId);
        return getPLCommonResult(url, null, request.getParams(), POST_METHOD);
    }

    /**
     * <pre>
     * 频道恢复流接口
     * </pre>
     *
     * @param channelId 频道ID
     * @param request   频道流公共的参数对象。
     * @return 公共结果对象
     */
    public PLCommonResult resume(int channelId, PLChannelStreamCommonRequest request) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_STREAM_RESUME_URL, channelId);
        return getPLCommonResult(url, null, request.getParams(), POST_METHOD);
    }
}
