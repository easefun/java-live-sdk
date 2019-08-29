package com.polyv.live.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.polyv.live.bean.client.WrappedResponse;
import com.polyv.live.bean.request.record.PLChannelRecordGetRequest;
import com.polyv.live.bean.request.record.PLChannelRecordMergeMp4Request;
import com.polyv.live.bean.result.record.PLChannelRecordGetResult;
import com.polyv.live.bean.result.record.PLChannelRecordMergeMp4Result;
import com.polyv.live.constant.PolyvLiveConstants;
import com.polyv.live.service.PLAbstractService;
import com.polyv.live.service.PLChannelRecordService;

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
     */
    public PLChannelRecordMergeMp4Result mergeMp4(PLChannelRecordMergeMp4Request request) {
        WrappedResponse response = request(PolyvLiveConstants.CHANNEL_RECORD_FILE_MERGE_URL,
                request.getParams(), POST_METHOD);
        PLChannelRecordMergeMp4Result result = new PLChannelRecordMergeMp4Result();
        if (response.isRequestOk()) {
            result = JSONArray.toJavaObject((JSONObject)response.getData(), PLChannelRecordMergeMp4Result.class);
        }
        return getResult(response, result);
    }
}
