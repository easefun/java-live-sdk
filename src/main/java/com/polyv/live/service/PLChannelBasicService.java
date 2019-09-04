package com.polyv.live.service;

import com.polyv.live.bean.request.channel.PLChannelBasicCreateRequest;
import com.polyv.live.bean.request.channel.PLChannelBasicUpdateRequest;
import com.polyv.live.bean.result.channel.PLChannelBasicCreateResult;
import com.polyv.live.bean.result.channel.PLChannelCommonResult;

public interface PLChannelBasicService {
    
    /**
     * <pre>
     * 创建频道(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/pdcz/basic-create/)
     * 该接口提供用户创建新的账号下的频道。
     * 需要调用该接口的情况：
     * ◆ 业务需要创建新的频道进行直播；
     * 接口地址：http://api.polyv.net/live/v3/channel/basic/create
     * </pre>
     *
     * @param request 创建频道需要的参数对象。
     */
    PLChannelBasicCreateResult createChannel(PLChannelBasicCreateRequest request);
    
    /**
     * <pre>
     * 更新频道(详见http://dev.polyv.net/2019/uncategorized/update-channel-detail-setting/)
     * 该接口提供用户更新账号下的频道。
     * 需要调用该接口的情况：
     * ◆ 业务需要更新频道信息；
     * 接口地址：http://api.polyv.net/live/v3/channel/basic/update
     * </pre>
     *
     * @param request 创建频道需要的参数对象。
     */
    PLChannelCommonResult updateChannel(PLChannelBasicUpdateRequest request);
}
