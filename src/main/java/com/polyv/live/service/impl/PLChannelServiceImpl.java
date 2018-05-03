package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.PLBaseRequest;
import com.polyv.live.bean.request.channel.*;
import com.polyv.live.bean.result.channel.*;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelService;
import com.polyv.live.util.HttpClientUtil;

/**
 * <pre>
 *  直播频道接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelServiceImpl extends PLAbstractService implements PLChannelService {

    /**
     * <pre>
     *  创建直播频道。
     * </pre>
     *
     * @param plChannelCreateRequest 频道创建请求对象。
     */
    public PLChannelCreateResult createChannel(PLChannelCreateRequest plChannelCreateRequest) {
        WrappedResponse response = request(PolyvLiveConstants.Channel_Create_Url, plChannelCreateRequest.getParams(), Post_Method);
        PLChannelCreateResult result = new PLChannelCreateResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelCreateResult.class);
        }
        return getResult(response, result);
    }


    /**
     * 设置观看频道最大在线人数。
     * @param channelId 频道ID
     * @param plChannelMaxViewerSetRequest 设置频道最大在线人数的请求对象
     * @return
     */
    public PLChannelCommonResult setChannelMaxViewer(int channelId, PLChannelMaxViewerSetRequest plChannelMaxViewerSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Max_Viewer_Set_Url, String.valueOf(channelId), plChannelMaxViewerSetRequest.getParams(), Post_Method);
    }


    /**
     * <pre>
     *   修改频道名称。
     * </pre>
     *
     * @param channelId 频道ID。
     * @param plChannelNameSetRequest 修改频道频道名称需要的参数对象。
     */
    public PLChannelCommonResult setChannelName(int channelId, PLChannelNameSetRequest plChannelNameSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Name_Set_Url, String.valueOf(channelId), plChannelNameSetRequest.getParams(), Post_Method);
    }


    /**
     * <pre>
     *   修改主持人姓名。
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPublisherSetRequest 修改频道频道主持人需要的参数对象。
     */
    public PLChannelCommonResult setChannelPublisher(String userId, PLChannelPublisherSetRequest plChannelPublisherSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Publisher_Set_Url, userId, plChannelPublisherSetRequest.getParams(), Post_Method);
    }

    /**
     * <pre>
     *   删除直播频道。
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelDeleteRequest 删除频道的参数对象。
     */
    public PLChannelCommonResult deleteChannel(int channelId, PLChannelDeleteRequest plChannelDeleteRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Delete_Url, String.valueOf(channelId), plChannelDeleteRequest.getParams(), Post_Method);
    }


    /**
     * <pre>
     *   设置频道密码。
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPasswordSetRequest 设置频道密码参数对象。
     */
    public PLChannelCommonResult setChannelPassword(String userId, PLChannelPasswordSetRequest plChannelPasswordSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Password_Set_Url, userId, plChannelPasswordSetRequest.getParams(), Post_Method);
    }


    /**
     * <pre>
     *   设置频道回放开关。
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPlaybackSetRequest 设置频道回放开关参数对象。
     */
    public PLChannelCommonResult setChannelPlayback(String userId, PLChannelPlaybackSetRequest plChannelPlaybackSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Playback_Set_Url, userId, plChannelPlaybackSetRequest.getParams(), Post_Method);
    }


    /**
     * <pre>
     *   获取频道汇总统计的播放数据
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelSummaryListGetRequest 获取频道汇总统计的播放数据的参数对象。
     */
    public PLChannelSummaryListGetResult getChannelSummaryList(String userId, PLChannelSummaryListGetRequest plChannelSummaryListGetRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.Channel_Summary_List_Get_Url, userId);
        WrappedResponse response = request(url, plChannelSummaryListGetRequest.getParams(), Get_Method);
        PLChannelSummaryListGetResult result = new PLChannelSummaryListGetResult();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setChannelSummarys(JSONObject.parseArray(json, ChannelSummary.class));
        }
        return getResult(response, result);
    }


    /**
     * <pre>
     * 获取频道直播状态
     * 注：
     * ◆ 如果正在直播，返回live，否则返回end
     * </pre>
     *
     * @param stream 流名（可调用获取频道信息接口，获取stream字段的值）
     */
    public String getChannelLiveStatus(String stream) {
        return HttpClientUtil.getInstance().sendHttpGet(PolyvLiveConstants.Channel_Live_Status_Get_Url + stream);
    }


    /**
     * <pre>
     * 获取多个频道的实时在线人数
     * </pre>
     *
     * @param plChannelViewersGetRequest 获取多个频道实时在线人数的参数对象。
     */
    public PLChannelViewersGetResult getChannelViewers(PLChannelViewersGetRequest plChannelViewersGetRequest) {
        WrappedResponse response = request(PolyvLiveConstants.Channel_Real_Time_Viewers_Get_Url, plChannelViewersGetRequest.getParams(), Get_Method);
        PLChannelViewersGetResult result = new PLChannelViewersGetResult();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setChannelViewers(JSONObject.parseArray(json, ChannelViewer.class));
        }
        return getResult(response, result);
    }


    /**
     * <pre>
     * 查询某个频道观看分页日志信息
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelViewLogsGetRequest 获取用户获取频道观看分页日志信息的参数对象。
     */
    public PLChannelViewLogsGetResult getChannelViewLogs(int channelId, PLChannelViewLogsGetRequest plChannelViewLogsGetRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.Channel_View_Logs_Get_Url, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelViewLogsGetRequest.getParams(), Get_Method);
        PLChannelViewLogsGetResult result = new PLChannelViewLogsGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelViewLogsGetResult.class);
            JSONObject jsonObject = (JSONObject) response.getData();
            if (null != jsonObject) {
                String json = JSON.toJSONString(jsonObject.get("contents"));
                result.setChannelViewLogs(JSONObject.parseArray(json, ChannelViewLog.class));
            }
        }
        return getResult(response, result);
    }


    /**
     * <pre>
     * 获取频道信息
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelGetRequest 获取频道信息的参数对象。
     */
    public PLChannelGetResult getChannel(int channelId, PLChannelGetRequest plChannelGetRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.Channel_Get_Url, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelGetRequest.getParams(), Get_Method);
        PLChannelGetResult result = new PLChannelGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelGetResult.class);
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 查询频道录制文件列表
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFilesGetRequest 获取频道录制文件的参数对象。
     */
    public PLChannelRecordFilesGetResult getChannelRecordFiles(int channelId, PLChannelRecordFilesGetRequest plChannelRecordFilesGetRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.Channel_Record_Files_Url, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelRecordFilesGetRequest.getParams(), Get_Method);
        PLChannelRecordFilesGetResult result = new PLChannelRecordFilesGetResult();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setRecordFiles(JSONObject.parseArray(json, RecordFile.class));
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 直播录制文件转存点播
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFileConvertRequest 录制文件转存请求的参数对象。
     */
    public PLChannelCommonResult convertChannelRecords(int channelId, PLChannelRecordFileConvertRequest plChannelRecordFileConvertRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Record_File_Convert_Url, String.valueOf(channelId), plChannelRecordFileConvertRequest.getParams(), Post_Method);
    }

    /**
     * <pre>
     * 获取频道回放列表
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackListGetRequest 回放列表请求的参数对象。
     */
    public PLChannelPlaybackListGetResult getChannelPlaybacks(int channelId, PLChannelPlaybackListGetRequest plChannelPlaybackListGetRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.Channel_Playback_List_Url, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelPlaybackListGetRequest.getParams(), Get_Method);
        PLChannelPlaybackListGetResult result = new PLChannelPlaybackListGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelPlaybackListGetResult.class);
            JSONObject jsonObject = (JSONObject) response.getData();
            if (null != jsonObject) {
                String json = JSON.toJSONString(jsonObject.get("contents"));
                result.setPlaybacks(JSONObject.parseArray(json, Playback.class));
            }
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 设置频道回放列表的默认回放视频
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackSetDefaultRequest 设置默认回放视频的请求的参数对象。
     */
    public PLChannelCommonResult setPlaybackListDefault(int channelId, PLChannelPlaybackSetDefaultRequest plChannelPlaybackSetDefaultRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Playback_Set_Default_Url, String.valueOf(channelId), plChannelPlaybackSetDefaultRequest.getParams(), Post_Method);
    }

    /**
     * <pre>
     * 删除回放视频
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackDeleteRequest 删除回放视频请求的参数对象。
     */
    public PLChannelCommonResult deletePlaybackVideo(int channelId, PLChannelPlaybackDeleteRequest plChannelPlaybackDeleteRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Playback_Delete_Url, String.valueOf(channelId), plChannelPlaybackDeleteRequest.getParams(), Post_Method);
    }

    /**
     * <pre>
     * 直播录制文件合并
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFileMergeRequest 录制文件合并请求的参数对象。
     */
    public PLChannelCommonResult mergeChannelRecords(int channelId, PLChannelRecordFileMergeRequest plChannelRecordFileMergeRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.Channel_Record_File_Merge_Url, String.valueOf(channelId), plChannelRecordFileMergeRequest.getParams(), Post_Method);
    }



}
