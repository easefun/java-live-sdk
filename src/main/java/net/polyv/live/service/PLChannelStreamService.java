package net.polyv.live.service;

import net.polyv.live.bean.request.stream.PLChannelStreamCommonRequest;
import net.polyv.live.bean.result.PLCommonResult;

/**
 * <pre>
 *  直播频道流处理相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelStreamService extends PLBaseService {

    /**
     * <pre>
     * 频道禁止流接口(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/hqzbxx/banpush/)
     * 该接口提供用户禁止频道推流接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要禁止特定频道的推流的信息；
     * 接口地址：http://api.polyv.net/live/v2/stream/{channelId}/cutoff
     * </pre>
     *
     * @param channelId 频道ID
     * @param request 频道流公共的参数对象。
     * @return 公共结果对象
     */
    PLCommonResult cutoff(int channelId, PLChannelStreamCommonRequest request);

    /**
     * <pre>
     * 频道恢复流接口(详见http://dev.polyv.net/2017/liveproduct/l-api/zbglgn/hqzbxx/resume/)
     * 该接口提供用户恢复频道的推流的接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要禁流后恢复频道的推流；
     * 接口地址：http://api.polyv.net/live/v2/stream/{channelId}/resume
     * </pre>
     *
     * @param channelId 频道ID
     * @param request   频道流公共的参数对象。
     * @return 公共结果对象
     */
    PLCommonResult resume(int channelId, PLChannelStreamCommonRequest request);

}
