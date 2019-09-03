package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.menu.PLChannelMenuListGetRequest;
import com.polyv.live.bean.request.menu.PLChannelMenuSetRequest;
import com.polyv.live.bean.result.PLCommonListResult;
import com.polyv.live.bean.result.PLCommonResult;
import com.polyv.live.bean.result.menu.ChannelMenu;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelMenuService;

/**
 * <pre>
 *  直播频道菜单接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelMenuServiceImpl extends PLAbstractService implements PLChannelMenuService {

    /**
     * <pre>
     * 获取频道菜单列表
     * </pre>
     *
     * @param request 获取频道菜单列表的参数对象。
     */
    public PLCommonListResult<ChannelMenu> getMenus(PLChannelMenuListGetRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_MENU_LIST_URL, request.getParams(), GET_METHOD);
        PLCommonListResult<ChannelMenu> result = new PLCommonListResult<ChannelMenu>();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setT(JSONObject.parseArray(json, ChannelMenu.class));
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 通过菜单ID设置频道菜单
     * </pre>
     *
     * @param request 设置频道菜单的参数对象。
     */
    public PLCommonResult setMenuById(PLChannelMenuSetRequest request) {
        return getPLCommonResult(PolyvLiveConstants.CHANNEL_MENU_UPDATE_URL, null,
                request.getParams(), POST_METHOD);
    }

    /**
     * <pre>
     * 设置频道自定义菜单
     * </pre>
     *
     * @param channelId 频道ID
     * @param userId 用户ID
     * @param request 设置频道自定义菜单的参数对象。
     */
    public PLCommonResult setCustomMenu(int channelId, String userId, PLChannelMenuSetRequest request) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_MENU_SET_URL, userId, channelId);
        return getPLCommonResult(url, null, request.getParams(), POST_METHOD);
    }
}
