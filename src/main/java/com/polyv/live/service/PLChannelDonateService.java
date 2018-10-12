package com.polyv.live.service;

import com.polyv.live.bean.request.donate.PLChannelDonateGetRequest;
import com.polyv.live.bean.request.donate.PLDonateCashSetRequest;
import com.polyv.live.bean.request.donate.PLDonateGoodsSetRequest;
import com.polyv.live.bean.result.PLCommonResult;
import com.polyv.live.bean.result.donate.PLChannelDonateGetResult;

/**
 * <pre>
 *  直播频道打赏相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelDonateService extends PLBaseService {

    /**
     * <pre>
     * 获取频道打赏设置(详见http://dev.polyv.net/2018/liveproduct/l-api/hqzbxx/donate-get/)
     * 该接口提供用户查询频道打赏设置信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道打赏设置的信息；
     * 接口地址：http://api.polyv.net/live/v3/channel/donate/get
     * </pre>
     *
     * @param request 获取频道打赏设置的参数对象。
     */
    PLChannelDonateGetResult getDonateSetting(PLChannelDonateGetRequest request);

    /**
     * <pre>
     * 频道现金打赏设置(详见http://dev.polyv.net/2018/liveproduct/l-api/szgkygg/updatecash/)
     * 该接口提供用户设置频道现金打赏。
     * 需要调用该接口的情况：
     * ◆ 业务需要设置频道现金打赏；
     * 接口地址：http://api.polyv.net/live/v3/channel/donate/update-cash
     * </pre>
     *
     * @param request 设置频道现金打赏的参数对象。
     */
    PLCommonResult setDonateCash(PLDonateCashSetRequest request);

    /**
     * <pre>
     * 频道道具打赏设置(详见http://dev.polyv.net/2018/liveproduct/l-api/szgkygg/updategood/)
     * 该接口提供用户设置频道道具打赏。
     * 需要调用该接口的情况：
     * ◆ 业务需要设置频道道具打赏；
     * 接口地址：http://api.polyv.net/live/v3/channel/donate/update-good
     * </pre>
     *
     * @param request 设置频道道具打赏的参数对象。
     */
    PLCommonResult setDonateGoods(PLDonateGoodsSetRequest request);

}
