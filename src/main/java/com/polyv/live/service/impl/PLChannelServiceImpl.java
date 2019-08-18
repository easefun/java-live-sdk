package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.client.WrappedResponseV1;
import com.polyv.live.bean.request.channel.*;
import com.polyv.live.bean.result.channel.*;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelService;

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
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_CREATE_URL, plChannelCreateRequest.getParams(), POST_METHOD);
        PLChannelCreateResult result = new PLChannelCreateResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelCreateResult.class);
        }
        return getResult(response, result);
    }


    /**
     * <pre>
     *   设置观看频道最大在线人数。
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelMaxViewerSetRequest 设置频道最大在线人数的请求对象
     */
    public PLChannelCommonResult setChannelMaxViewer(int channelId, PLChannelMaxViewerSetRequest plChannelMaxViewerSetRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_MAX_VIEWER_SET_URL, String.valueOf(channelId), plChannelMaxViewerSetRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_NAME_SET_URL, String.valueOf(channelId), plChannelNameSetRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_PUBLISHER_SET_URL, userId, plChannelPublisherSetRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_DELETE_URL, String.valueOf(channelId), plChannelDeleteRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_PWD_SET_URL, userId, plChannelPasswordSetRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_PLAYBACK_SET_URL, userId, plChannelPlaybackSetRequest.getParams(), POST_METHOD);
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
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_SUMMARY_LIST_GET_URL, userId);
        WrappedResponse response = request(url, plChannelSummaryListGetRequest.getParams(), GET_METHOD);
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
        return initHttpClient().sendHttpGet(PolyvLiveConstants.CHANNEL_LIVE_STATUS_GET_URL + stream);
    }


    /**
     * <pre>
     * 获取多个频道的实时在线人数
     * </pre>
     *
     * @param plChannelViewersGetRequest 获取多个频道实时在线人数的参数对象。
     */
    public PLChannelViewersGetResult getChannelViewers(PLChannelViewersGetRequest plChannelViewersGetRequest) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_REAL_TIME_VIEWERS_GET_URL, plChannelViewersGetRequest.getParams(), GET_METHOD);
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
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_VIEW_LOGS_GET_URL, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelViewLogsGetRequest.getParams(), GET_METHOD);
        PLChannelViewLogsGetResult result = new PLChannelViewLogsGetResult();
        if (response.isRequestOk()) {
            JSONObject jsonObject = (JSONObject) response.getData();
            result = JSONArray.toJavaObject(jsonObject, PLChannelViewLogsGetResult.class);
            if (null != jsonObject) {
                String json = JSON.toJSONString(jsonObject.get(CONTENTS_TAG));
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
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_GET_URL, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelGetRequest.getParams(), GET_METHOD);
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
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_RECORD_FILES_URL, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelRecordFilesGetRequest.getParams(), GET_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_RECORD_FILE_CONVERT_URL, String.valueOf(channelId), plChannelRecordFileConvertRequest.getParams(), POST_METHOD);
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
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_PLAYBACK_LIST_URL, String.valueOf(channelId));
        WrappedResponse response = request(url, plChannelPlaybackListGetRequest.getParams(), GET_METHOD);
        PLChannelPlaybackListGetResult result = new PLChannelPlaybackListGetResult();
        if (response.isRequestOk()) {
            JSONObject jsonObject = (JSONObject) response.getData();
            result = JSONArray.toJavaObject(jsonObject, PLChannelPlaybackListGetResult.class);
            if (null != jsonObject) {
                String json = JSON.toJSONString(jsonObject.get(CONTENTS_TAG));
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_PLAYBACK_SET_DEFAULT_URL, String.valueOf(channelId), plChannelPlaybackSetDefaultRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_PLAYBACK_DELETE_URL, String.valueOf(channelId), plChannelPlaybackDeleteRequest.getParams(), POST_METHOD);
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
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_RECORD_FILE_MERGE_URL, String.valueOf(channelId), plChannelRecordFileMergeRequest.getParams(), POST_METHOD);
    }

    /**
     * <pre>
     * 频道设置点赞数和观看人数
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelLikesUpdateRequest 设置点赞数和观看人数请求的参数对象。
     */
    public PLChannelCommonResult updateLikes(int channelId, PLChannelLikesUpdateRequest plChannelLikesUpdateRequest) {
        return getPLChannelCommonResult(PolyvLiveConstants.CHANNEL_LIKES_UPDATE_URL, String.valueOf(channelId), plChannelLikesUpdateRequest.getParams(), POST_METHOD);
    }

    /**
     * <pre>
     * 频道获取点赞数和历史观看人数
     * </pre>
     *
     * @param plChannelLikesGetRequest 获取频道点赞数和历史观看人数请求的参数对象。
     */
    public PLChannelLikesGetResult getLikes(PLChannelLikesGetRequest plChannelLikesGetRequest) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_LIKES_GET_URL,
                plChannelLikesGetRequest.getParams(), GET_METHOD);
        PLChannelLikesGetResult result = new PLChannelLikesGetResult();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getData());
            result.setChannelLikes(JSONObject.parseArray(json, ChannelLikes.class));
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 获取频道某段时间的直播统计数据
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelDailySummaryRequest 获取频道某段时间的直播统计数据请求的参数对象。
     */
    public PLChannelDailySummaryResult getChannelDailySummary(int channelId, PLChannelDailySummaryRequest plChannelDailySummaryRequest) {
        String url = PolyvLiveConstants.getRealUrl(PolyvLiveConstants.CHANNEL_DAILY_SUMMARY_URL, String.valueOf(channelId));
        WrappedResponseV1 response = requestV1(url, plChannelDailySummaryRequest.getParams(), GET_METHOD);
        PLChannelDailySummaryResult result = new PLChannelDailySummaryResult();
        if (response.isRequestOk()) {
            String json = JSON.toJSONString(response.getResult());
            result.setChannelDailySummary(JSONObject.parseArray(json, ChannelDailySummary.class));
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     * 获取简单的频道列表
     * </pre>
     *
     * @param plChannelManagementListRequest 获取频道列表请求的参数对象。
     */
    public PLChannelManagementListResult getSimpleChannelList(PLChannelManagementListRequest plChannelManagementListRequest) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_LIST_URL, plChannelManagementListRequest.getParams(), GET_METHOD);
        PLChannelManagementListResult result = new PLChannelManagementListResult();
        if (response.isRequestOk()) {
            JSONObject jsonObject = (JSONObject) response.getData();
            result = JSONArray.toJavaObject(jsonObject, PLChannelManagementListResult.class);
            if (null != jsonObject) {
                String json = JSON.toJSONString(jsonObject.get(CONTENTS_TAG));
                result.setSimpleChannels(JSONObject.parseArray(json, SimpleChannel.class));
            }
        }
        return getResult(response, result);
    }

}
