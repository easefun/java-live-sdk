package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道录制文件合并请求类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordFileMergeRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：视频地址
     * 变量名：urls
     * 是否必填：是
     * 类型：String(64)
     * 示例值：http://xxx.xx/a.mp4,http://xxx.xx/b.mp4
     * 描述：要合并的录制文件URL，通过逗号隔开
     * </pre>
     */
    protected String urls;

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public PLChannelRecordFileMergeRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelRecordFileMergeRequest{" +
                "urls='" + urls + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
