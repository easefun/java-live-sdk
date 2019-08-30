package com.polyv.live.service;

import com.polyv.live.bean.request.record.PLChannelRecordGetRequest;
import com.polyv.live.bean.request.record.PLChannelRecordMergeMp4Request;
import com.polyv.live.bean.result.record.PLChannelRecordGetResult;
import com.polyv.live.bean.result.record.PLChannelRecordMergeMp4Result;

/**
 * <pre>
 *  直播频道录制文件相关接口
 * </pre>
 *
 * @author HuangYF
 */
public interface PLChannelRecordService extends PLBaseService {

    /**
     * <pre>
     * 通过文件ID获取录制信息详情(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/lzhf/get-record-file/)
     * 该接口提供查下录制文件信息接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要录制文件ID获取视频地址，大小等信息；
     * 接口地址：http://api.polyv.net/live/v3/channel/record/get
     * </pre>
     *
     * @param request 文件ID获取录制信息请求对象。
     */
    PLChannelRecordGetResult get(PLChannelRecordGetRequest request);

    /**
     * <pre>
     * 合并一段时间的频道录制的mp4文件接口(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/lzhf/merge-record-mp4/)
     * 该接口提供用户合并MP4录制文件视频的接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要合并MP4录制文件并设置一些回调通知等；
     * 接口地址：http://api.polyv.net/live/v3/channel/record/merge-mp4
     * </pre>
     *
     * @param request 合并录制的mp4文件请求对象。
     */
    PLChannelRecordMergeMp4Result mergeMp4(PLChannelRecordMergeMp4Request request);

}
