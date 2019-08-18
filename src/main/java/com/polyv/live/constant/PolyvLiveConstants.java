package com.polyv.live.constant;

/**
 * <pre>
 *  POLYV直播常量类
 * </pre>
 *
 * @author HuangYF
 */
public class PolyvLiveConstants {

    private PolyvLiveConstants() {}

    /**
     * POLYV live api base uri
     */
    public static final String BASE_DOMAIN = "api.polyv.net";

    /**
     * POLYV live api base uri
     */
    private static final String BASE_URI = "https://api.polyv.net/live/";

    /**
     * url 替换通配符
     */
    private static final String PARAM_REPLACE_CHAR = "%s";

    /**
     * 直播创建频道URL
     */
    public static final String CHANNEL_CREATE_URL = BASE_URI + "v2/channels/";

    /**
     * 修改频道名称URL
     */
    public static final String CHANNEL_NAME_SET_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/update";

    /**
     * 修改主持人姓名URL
     */
    public static final String CHANNEL_PUBLISHER_SET_URL = BASE_URI + "v2/channelSetting/" + PARAM_REPLACE_CHAR + "/setPublisher";

    /**
     * 设置频道号密码
     */
    public static final String CHANNEL_PWD_SET_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/passwdSetting";

    /**
     * 设置后台回放开关
     */
    public static final String CHANNEL_PLAYBACK_SET_URL = BASE_URI + "v2/channelSetting/" + PARAM_REPLACE_CHAR + "/setPlayBackEnabled";

    /**
     * 获取按频道汇总统计的播放数据
     */
    public static final String CHANNEL_SUMMARY_LIST_GET_URL = BASE_URI + "v2/statistics/" + PARAM_REPLACE_CHAR + "/channel_summary";

    /**
     * 获取频道直播状态
     */
    public static final String CHANNEL_LIVE_STATUS_GET_URL = "http://api.polyv.net/live_status/query?stream=";

    /**
     * 获取多个频道的实时在线人数
     */
    public static final String CHANNEL_REAL_TIME_VIEWERS_GET_URL = BASE_URI + "v2/statistics/get-realtime-viewers";

    /**
     * 分页获取频道观看日志
     */
    public static final String CHANNEL_VIEW_LOGS_GET_URL = BASE_URI + "v2/statistics/" + PARAM_REPLACE_CHAR + "/viewlog";

    /**
     * 删除频道
     */
    public static final String CHANNEL_DELETE_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/delete";

    /**
     * 设置最大在线人数
     */
    public static final String CHANNEL_MAX_VIEWER_SET_URL = BASE_URI + "v2/channelRestrict/" + PARAM_REPLACE_CHAR + "/set-max-viewer";

    /**
     * 获取频道信息的接口
     */
    public static final String CHANNEL_GET_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/get";

    /**
     * 获取频道录制视频信息接口
     */
    public static final String CHANNEL_RECORD_FILES_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/recordFiles";

    /**
     * 直播转存点播接口
     */
    public static final String CHANNEL_RECORD_FILE_CONVERT_URL = BASE_URI + "v2/channel/recordFile/" + PARAM_REPLACE_CHAR + "/convert";

    /**
     * 获取回放列表接口
     */
    public static final String CHANNEL_PLAYBACK_LIST_URL = BASE_URI + "v2/channel/recordFile/" + PARAM_REPLACE_CHAR + "/playback/list";

    /**
     * 设置默认回放视频
     */
    public static final String CHANNEL_PLAYBACK_SET_DEFAULT_URL = BASE_URI + "v2/channel/recordFile/" + PARAM_REPLACE_CHAR + "/playback/set-Default";

    /**
     * 删除回放列表视频
     */
    public static final String CHANNEL_PLAYBACK_DELETE_URL = BASE_URI + "v2/channel/recordFile/" + PARAM_REPLACE_CHAR + "/playback/delete";

    /**
     * 合并录制文件
     */
    public static final String CHANNEL_RECORD_FILE_MERGE_URL = BASE_URI + "v2/channel/recordFile/" + PARAM_REPLACE_CHAR + "/merge";

    /**
     * 频道某段时间的直播统计数据
     */
    public static final String CHANNEL_DAILY_SUMMARY_URL = BASE_URI + "v2/statistics/" + PARAM_REPLACE_CHAR + "/summary";

    /**
     * 设置点赞数和观看人数接口
     */
    public static final String CHANNEL_LIKES_UPDATE_URL = BASE_URI + "v2/channels/" + PARAM_REPLACE_CHAR + "/update-likes";

    /**
     * 获取简单的频道列表接口
     */
    public static final String CHANNEL_LIST_URL = BASE_URI + "v3/channel/management/list";

    /**
     * 获取频道菜单列表接口
     */
    public static final String CHANNEL_MENU_LIST_URL = BASE_URI + "v3/channel/menu/list";

    /**
     * 修改频道菜单
     */
    public static final String CHANNEL_MENU_UPDATE_URL = BASE_URI + "v3/channel/menu/update";

    /**
     * 查询账户分钟数
     */
    public static final String USER_DURATION_GET_URL = BASE_URI + "v2/user/get-user-durations";

    /**
     * 获取打赏设置
     */
    public static final String CHANNEL_DONATE_GET_URL = BASE_URI + "v3/channel/donate/get";

    /**
     * 道具打赏设置
     */
    public static final String GOOD_DONATE_SET_URL = BASE_URI + "v3/channel/donate/update-good";

    /**
     * 现金打赏设置
     */
    public static final String CASH_DONATE_SET_URL = BASE_URI + "v3/channel/donate/update-cash";

    /**
     * 获取频道点赞数和历史观看人数
     */
    public static final String CHANNEL_LIKES_GET_URL = BASE_URI + "v2/channels/live-likes";

    /**
     * 400错误码
     */
    public static final int CODE_400 = 400;

    /**
     * 200响应码
     */
    public static final int CODE_200 = 200;

    /**
     * 请求错误提示
     */
    public static final String REQUEST_ERR_MSG = "Bad Request";

    /**
     * 设置代理错误提示
     */
    public static final String PROXY_ERR_MSG = "Proxy Error";

    /**
     * 获取替换参数后的URL地址
     */
    public static String getRealUrl(String format, Object... param) {
        return String.format(format, param);
    }

}
