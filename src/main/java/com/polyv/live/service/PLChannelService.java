package com.polyv.live.service;

import com.polyv.live.bean.request.channel.*;
import com.polyv.live.bean.result.channel.*;

/**
 * <pre>
 *  POLYV直播频道相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelService extends PLBaseService {

    /**
     * <pre>
     * 创建频道(详见http://dev.polyv.net/2017/liveproduct/l-api/zbglgn/create-channel/)
     * 该接口提供用户创建新的账号下的频道。
     * 需要调用该接口的情况：
     * ◆ 业务需要创建新的频道进行直播；
     * 接口地址：http://api.polyv.net/live/v2/channels/
     * </pre>
     *
     * @param plChannelCreateRequest 创建频道需要的参数对象。
     */
    PLChannelCreateResult createChannel(PLChannelCreateRequest plChannelCreateRequest);


    /**
     * <pre>
     * 设置频道最大在线人数(详见http://dev.polyv.net/2018/liveproduct/l-api/szgkygg/setmaxviewerv2/)
     * 该接口提供设置直播频道的最大在线观看人数。
     * 需要调用该接口的情况：
     * ◆ 业务需要限制观看直播频道的最大在线人数；
     * 接口地址：http://api.polyv.net/live/v2/channelRestrict/{channelId}/set-max-viewer
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelMaxViewerSetRequest 设置频道最大在线人数的请求对象
     */
    PLChannelCommonResult setChannelMaxViewer(int channelId, PLChannelMaxViewerSetRequest plChannelMaxViewerSetRequest);


    /**
     * <pre>
     * 修改频道名称(详见http://dev.polyv.net/2016/liveproduct/l-api/szgkygg/updatechannelname/)
     * 该接口提供用户修改直播频道的名称。
     * 需要调用该接口的情况：
     * ◆ 业务需要进行新的直播，有需要修改频道名称；
     * 接口地址：http://api.polyv.net/live/v2/channels/{channelId}/update
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelNameSetRequest 修改频道频道名称需要的参数对象。
     */
    PLChannelCommonResult setChannelName(int channelId, PLChannelNameSetRequest plChannelNameSetRequest);


    /**
     * <pre>
     * 修改主持人姓名(详见http://dev.polyv.net/2017/liveproduct/l-api/szgkygg/setpublisher/)
     * 该接口提供用户修改直播频道的主持人名称。
     * 需要调用该接口的情况：
     * ◆ 业务需要更换直播频道主持人；
     * 接口地址：http://api.polyv.net/live/v2/channelSetting/{userId}/setPublisher
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPublisherSetRequest 修改频道频道主持人需要的参数对象。
     */
    PLChannelCommonResult setChannelPublisher(String userId, PLChannelPublisherSetRequest plChannelPublisherSetRequest);


    /**
     * <pre>
     * 删除频道(详见http://dev.polyv.net/2018/liveproduct/l-api/zbglgn/deletechannel/)
     * 该接口提供用户删除直播频道。
     * 需要调用该接口的情况：
     * ◆ 业务需要删除无用的直播频道；
     * 接口地址：http://api.polyv.net/live/v2/channels/{channelId}/delete
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelDeleteRequest 删除频道的参数对象。
     */
    PLChannelCommonResult deleteChannel(int channelId, PLChannelDeleteRequest plChannelDeleteRequest);


    /**
     * <pre>
     * 设置频道密码(详见http://dev.polyv.net/2017/liveproduct/l-api/zbglgn/updatepasswd/)
     * 该接口提供用户设置频道密码。
     * 需要调用该接口的情况：
     * ◆ 业务安全需要重新设置频道的密码；
     * 接口地址：http://api.polyv.net/live/v2/channels/{userId}/passwdSetting
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPasswordSetRequest 设置频道密码参数对象。
     */
    PLChannelCommonResult setChannelPassword(String userId, PLChannelPasswordSetRequest plChannelPasswordSetRequest);


    /**
     * <pre>
     * 设置频道回放开关(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/setplaybackenabled/)
     * 该接口提供用户设置频道的回放开关。
     * 需要调用该接口的情况：
     * ◆ 业务需要频道是否开启回放开关的设置；
     * 接口地址：http://api.polyv.net/live/v2/channelSetting/{userId}/setPlayBackEnabled
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelPlaybackSetRequest 设置频道回放开关参数对象。
     */
    PLChannelCommonResult setChannelPlayback(String userId, PLChannelPlaybackSetRequest plChannelPlaybackSetRequest);


    /**
     * <pre>
     * 获取频道汇总统计的播放数据(详见http://dev.polyv.net/2018/liveproduct/l-api/hqzbxx/channel_play_summary/)
     * 该接口提供用户获取一段时间里的频道数据汇总统计。
     * 需要调用该接口的情况：
     * ◆ 业务需要对一段时间内的频道进行数据统计；
     * 接口地址：http://api.polyv.net/live/v2/statistics/{userId}/channel_summary
     * </pre>
     *
     * @param userId 用户ID
     * @param plChannelSummaryListGetRequest 获取频道汇总统计的播放数据的参数对象。
     */
    PLChannelSummaryListGetResult getChannelSummaryList(String userId, PLChannelSummaryListGetRequest plChannelSummaryListGetRequest);


    /**
     * <pre>
     * 获取频道直播状态(详见http://dev.polyv.net/2016/liveproduct/l-api/hqzbxx/live_status/)
     * 该接口提供用户获取当前频道的直播状态。
     * 需要调用该接口的情况：
     * ◆ 业务需要判断当前直播频道的直播状态以便进行业务操作；
     * 接口地址：http://api.polyv.net/live_status/query
     * 注：
     * ◆ 如果正在直播，返回live，否则返回end
     * </pre>
     *
     * @param stream 流名（可调用获取频道信息接口，获取stream字段的值）
     */
    String getChannelLiveStatus(String stream);


    /**
     * <pre>
     * 获取多个频道的实时在线人数(详见http://dev.polyv.net/2018/liveproduct/l-api/hqzbxx/get-realtime-viewers/)
     * 该接口提供用户获取频道的实时在线人数。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道的在线人数数据用于对比分析和展示；
     * 接口地址：http://api.polyv.net/live/v2/statistics/get-realtime-viewers
     * </pre>
     *
     * @param plChannelViewersGetRequest 获取多个频道实时在线人数的参数对象。
     */
    PLChannelViewersGetResult getChannelViewers(PLChannelViewersGetRequest plChannelViewersGetRequest);


    /**
     * <pre>
     * 查询某个频道观看分页日志信息(详见http://dev.polyv.net/2018/liveproduct/l-api/hqzbxx/viewlog-page/)
     * 该接口提供用户获取频道观看分页日志信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取；
     * 接口地址：http://api.polyv.net/live/v2/statistics/{channelId}/viewlog
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelViewLogsGetRequest 获取用户获取频道观看分页日志信息的参数对象。
     */
    PLChannelViewLogsGetResult getChannelViewLogs(int channelId, PLChannelViewLogsGetRequest plChannelViewLogsGetRequest);

    /**
     * <pre>
     * 获取频道信息(详见http://dev.polyv.net/2017/liveproduct/l-api/hqzbxx/getchannelid-2/)
     * 该接口提供用户查询频道信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道信息；
     * 接口地址：http://api.polyv.net/live/v2/channels/{channelId}/get
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelGetRequest 获取频道信息的参数对象。
     */
    PLChannelGetResult getChannel(int channelId, PLChannelGetRequest plChannelGetRequest);

    /**
     * <pre>
     * 查询频道录制文件信息(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/recordfilesinfo/)
     * 该接口提供用户获取频道录制文件信息。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道录制文件信息进行播放；
     * 接口地址：http://api.polyv.net/live/v2/channels/{channelId}/recordFiles
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFilesGetRequest 获取用户获取频道录制文件请求的参数对象。
     */
    PLChannelRecordFilesGetResult getChannelRecordFiles(int channelId, PLChannelRecordFilesGetRequest plChannelRecordFilesGetRequest);

    /**
     * <pre>
     * 直播录制文件转存点播(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/livetovod/)
     * 该接口提供用户将直播文件转存点播。
     * 需要调用该接口的情况：
     * ◆ 业务需要想录制文件转存到点播并使用点播播放器播放；
     * 接口地址：http://api.polyv.net/live/v2/channel/recordFile/{channelId}/convert
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFileConvertRequest 录制文件转存请求的参数对象。
     */
    PLChannelCommonResult convertChannelRecords(int channelId, PLChannelRecordFileConvertRequest plChannelRecordFileConvertRequest);

    /**
     * <pre>
     * 获取频道回放列表(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/getplaybacklist/)
     * 该接口提供用户获取频道回放列表。
     * 需要调用该接口的情况：
     * ◆ 业务需要对回放列表进行操作，需要先获取回放列表；
     * ◆ 业务需要用于展示；
     * 接口地址：http://api.polyv.net/live/v2/channel/recordFile/{channelId}/playback/list
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackListGetRequest 回放列表请求的参数对象。
     */
    PLChannelPlaybackListGetResult getChannelPlaybacks(int channelId, PLChannelPlaybackListGetRequest plChannelPlaybackListGetRequest);

    /**
     * <pre>
     * 设置频道回放列表的默认回放视频(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/setdefault/)
     * 该接口提供用户可以设置自己频道的默认回放视频。
     * 需要调用该接口的情况：
     * ◆ 业务需要设置默认的回放用于频道回放需要；
     * 接口地址：http://api.polyv.net/live/v2/channel/recordFile/{channelId}/playback/set-Default
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackSetDefaultRequest 设置默认回放视频的请求的参数对象。
     */
    PLChannelCommonResult setPlaybackListDefault(int channelId, PLChannelPlaybackSetDefaultRequest plChannelPlaybackSetDefaultRequest);

    /**
     * <pre>
     * 删除回放视频(详见http://dev.polyv.net/2017/liveproduct/l-api/hfgn/deleteplaybackvideo/)
     * 该接口提供用户删除回放视频。
     * 需要调用该接口的情况：
     * ◆ 业务需要想删除回放列表中的视频；
     * 接口地址：http://api.polyv.net/live/v2/channel/recordFile/{channelId}/playback/delete
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelPlaybackDeleteRequest 删除回放视频请求的参数对象。
     */
    PLChannelCommonResult deletePlaybackVideo(int channelId, PLChannelPlaybackDeleteRequest plChannelPlaybackDeleteRequest);

    /**
     * <pre>
     * 直播录制文件合并(详见http://dev.polyv.net/2018/liveproduct/l-api/hfgn/recordfile-merge/)
     * 该接口提供用户将频道的几个录制文件合并。
     * 需要调用该接口的情况：
     * ◆ 业务需要将两个录制文件合并；
     * 接口地址：https://api.polyv.net/live/v2/channel/recordFile/{channelId}/merge
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelRecordFileMergeRequest 录制文件合并请求的参数对象。
     */
    PLChannelCommonResult mergeChannelRecords(int channelId, PLChannelRecordFileMergeRequest plChannelRecordFileMergeRequest);

    /**
     * <pre>
     * 频道设置点赞数和观看人数(详见http://dev.polyv.net/2018/liveproduct/l-api/szgkygg/update-likes/)
     * 该接口提供用户设置频道的点赞数和观看人数。
     * 需要调用该接口的情况：
     * ◆ 业务需要在观看页展示自己要展示的点赞数和观看人数；
     * 接口地址：http://api.polyv.net/live/v2/channels/{channelId}/update-likes
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelLikesUpdateRequest 设置点赞数和观看人数请求的参数对象。
     */
    PLChannelCommonResult updateLikes(int channelId, PLChannelLikesUpdateRequest plChannelLikesUpdateRequest);

    /**
     * <pre>
     * 频道获取点赞数和历史观看人数(详见http://dev.polyv.net/2017/liveproduct/l-api/szgkygg/ymxxsz/live-likes/)
     * 该接口提供用户设置频道的点赞数和观看人数。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道的点赞数和观看人数用于统计；
     * ◆ 业务需要获取频道的点赞数和观看人数用于展示；
     * 接口地址：http://api.polyv.net/live/v2/channels/live-likes
     * </pre>
     *
     * @param plChannelLikesGetRequest 获取频道点赞数和历史观看人数请求的参数对象。
     */
    PLChannelLikesGetResult getLikes(PLChannelLikesGetRequest plChannelLikesGetRequest);

    /**
     * <pre>
     * 获取频道某段时间的直播统计数据(详见http://dev.polyv.net/2017/liveproduct/l-api/hqzbxx/summary/)
     * 该接口提供用户获取频道某段时间的直播统计数据。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道某段时间的直播统计数据；
     * 接口地址：http://api.polyv.net/live/v2/statistics/{channelId}/summary
     * </pre>
     *
     * @param channelId 频道ID
     * @param plChannelDailySummaryRequest 获取频道某段时间的直播统计数据请求的参数对象。
     */
    PLChannelDailySummaryResult getChannelDailySummary(int channelId, PLChannelDailySummaryRequest plChannelDailySummaryRequest);

    /**
     * <pre>
     * 获取简单的频道列表(详见http://dev.polyv.net/2018/liveproduct/l-api/hqzbxx/get-simple-channel-list/)
     * 该接口提供用户获取简单的频道列表。
     * 需要调用该接口的情况：
     * ◆ 业务需要获取频道列表并且想分页获取；
     * 接口地址：http://api.polyv.net/live/v3/channel/management/list
     * </pre>
     *
     * @param plChannelManagementListRequest 获取频道列表请求的参数对象。
     */
    PLChannelManagementListResult getSimpleChannelList(PLChannelManagementListRequest plChannelManagementListRequest);

}
