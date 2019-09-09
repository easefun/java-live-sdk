package net.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.polyv.live.bean.client.WrappedResponse;
import net.polyv.live.bean.request.record.PLChannelRecordGetRequest;
import net.polyv.live.bean.request.record.PLChannelRecordMergeMp4Request;
import net.polyv.live.bean.result.record.PLChannelRecordGetResult;
import net.polyv.live.bean.result.record.PLChannelRecordMergeMp4Result;
import net.polyv.live.constant.PolyvLiveConstants;
import net.polyv.live.service.PLAbstractService;
import net.polyv.live.service.PLChannelRecordService;

/**
 * <pre>
 *  直播录制文件请求接口请求接口实现类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordServiceImpl extends PLAbstractService implements PLChannelRecordService {

    /**
     * <pre>
     *  通过文件ID获取录制信息详情
     * </pre>
     *
     * @param request 文件ID获取录制信息请求对象。
     * @return 获取频道录制信息结果
     */
    public PLChannelRecordGetResult get(PLChannelRecordGetRequest request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_RECORD_GET_URL, request.getParams(), GET_METHOD);
        PLChannelRecordGetResult result = new PLChannelRecordGetResult();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelRecordGetResult.class);
        }
        return getResult(response, result);
    }

    /**
     * <pre>
     *  合并一段时间的频道录制的mp4文件接口
     * </pre>
     *
     * @param request 合并录制的mp4文件请求对象。
     * @return 获取频道合并mp4对象结果
     */
    public PLChannelRecordMergeMp4Result mergeMp4(PLChannelRecordMergeMp4Request request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_RECORD_MERGE_MP4_URL,
                request.getParams(), POST_METHOD);
        PLChannelRecordMergeMp4Result result = new PLChannelRecordMergeMp4Result();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelRecordMergeMp4Result.class);
        }
        return getResult(response, result);
    }
}
