package net.polyv.live.service;

import net.polyv.live.bean.model.ChannelAccount;
import net.polyv.live.bean.request.account.PLChannelAccountsGetRequest;
import net.polyv.live.bean.result.PLCommonListResult;

/**
 * <pre>
 *  直播频道的子频道相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelAccountService extends PLBaseService {

    /**
     * <pre>
     * 获取频道下所有子频道(详见http://dev.polyv.net/2018/liveproduct/l-api/zbglgn/pdcz/get-accounts/)
     * 该接口提供用户查询频道下所有子频道信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取某个频道的子频道用于管理；
     * 接口地址：https://api.polyv.net/live/v2/channelAccount/{channelId}/accounts
     * </pre>
     *
     * @param channelId 频道号
     * @param request   获取频道的子频道列表的参数对象。
     */
    PLCommonListResult<ChannelAccount> getAccounts(int channelId, PLChannelAccountsGetRequest request);

}
