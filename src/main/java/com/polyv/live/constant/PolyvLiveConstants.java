package com.polyv.live.constant;

/**
 * <pre>
 *  POLYV直播常量类
 * </pre>
 *
 * @author HuangYF
 */
public class PolyvLiveConstants {

    /**
     * POLYV live api base uri
     */
    private static final String Base_Uri = "http://api.polyv.net/live/";

    /**
     * url 替换通配符
     */
    private static final String Param_Replace_Char = "{param}";

    /**
     * 直播创建频道URL
     */
    public static final String Channel_Create_Url = Base_Uri + "v2/channels/";

    /**
     * 修改频道名称URL
     */
    public static final String Channel_Name_Set_Url = Base_Uri + "v2/channels/" + Param_Replace_Char + "/update";

    /**
     * 修改主持人姓名URL
     */
    public static final String Channel_Publisher_Set = Base_Uri + "v2/channelSetting/" + Param_Replace_Char + "/setPublisher";

    /**
     * 设置频道号密码
     */
    public static final String Channel_Password_Set = Base_Uri + "v2/channels/" + Param_Replace_Char + "/passwdSetting";

    /**
     * 设置后台回放开关
     */
    public static final String Channel_Playback_Set = Base_Uri + "v2/channelSetting/" + Param_Replace_Char + "/setPlayBackEnabled";

    /**
     * 获取按频道汇总统计的播放数据
     */
    public static final String Channel_Summary_List_Get = Base_Uri + "v2/statistics/" + Param_Replace_Char + "/channel_summary";

    /**
     * 获取频道直播状态
     */
    public static final String Channel_Live_Status_Get = "http://api.polyv.net/live_status/query?stream=";

    /**
     * 获取多个频道的实时在线人数
     */
    public static final String Channel_Real_Time_Viewers_Get = Base_Uri + "v2/statistics/get-realtime-viewers";

    /**
     * 分页获取频道观看日志
     */
    public static final String Channel_View_Logs_Get = Base_Uri + "v2/statistics/" + Param_Replace_Char + "/viewlog";

    /**
     * 删除频道
     */
    public static final String Channel_Delete = Base_Uri + "v2/channels/" + Param_Replace_Char + "/delete";

    /**
     * 设置最大在线人数
     */
    public static final String Channel_Max_Viewer_Set = Base_Uri + "v2/channelRestrict/" + Param_Replace_Char + "/set-max-viewer";

    /**
     * 400错误码
     */
    public static final int Code_400 = 400;

    /**
     * 请求错误提示
     */
    public static final String Request_Error_Msg = "Bad Request";

    /**
     * 获取替换参数后的URL地址
     * @return
     */
    public static String getRealUrl(String oldUrl, String param) {
        return oldUrl.replace(Param_Replace_Char, param);
    }

}
