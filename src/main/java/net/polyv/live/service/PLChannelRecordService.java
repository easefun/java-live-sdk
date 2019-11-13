package net.polyv.live.service;

import net.polyv.live.bean.request.record.PLChannelRecordConvertRequest;
import net.polyv.live.bean.request.record.PLChannelRecordGetRequest;
import net.polyv.live.bean.request.record.PLChannelRecordMergeMp4Request;
import net.polyv.live.bean.request.record.PLChannelRecordMergeRequest;
import net.polyv.live.bean.result.PLCommonResult;
import net.polyv.live.bean.result.record.PLChannelRecordGetResult;
import net.polyv.live.bean.result.record.PLChannelRecordMergeMp4Result;

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
     * @return 获取频道录制信息结果
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
     * @return 获取频道合并mp4对象结果
     */
    PLChannelRecordMergeMp4Result mergeMp4(PLChannelRecordMergeMp4Request request);

    /**
     * <pre>
     * 异步合并录制文件接口(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/lzhf/async-merge/)
     * 该接口提供用户异步合并录制文件的接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要通过接口合并录制文件而且合并录制文件过程异步处理；
     * ◆ 通过接收http回调的方式得到录制结果
     * 接口地址：http://api.polyv.net/live/v3/channel/record/merge
     * </pre>
     *
     * @param request 异步合并录制文件请求对象。
     * @return 获取异步合并请求对象结果
     */
    PLCommonResult merge(PLChannelRecordMergeRequest request);

    /**
     * <pre>
     * 异步转存录制文件接口(详见http://dev.polyv.net/2019/liveproduct/l-api/zbglgn/lzhf/async-convert/)
     * 该接口提供用户异步转存录制文件的接口。
     * 需要调用该接口的情况：
     * ◆ 业务需要通过接口转存录制文件而且转存录制文件过程异步处理；
     * ◆ 通过接收http回调的方式得到转存结果
     * 接口地址：http://api.polyv.net/live/v3/channel/record/convert
     * </pre>
     *
     * @param request 异步转存录制文件请求对象。
     * @return 获取转存合并请求对象结果
     */
    PLCommonResult convert(PLChannelRecordConvertRequest request);

}
