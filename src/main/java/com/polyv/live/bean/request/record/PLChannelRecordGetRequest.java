package com.polyv.live.bean.request.record;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV通过ID获取频道录制文件信息请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：频道号
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：文件ID
     * 变量名：fileId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：XXXXXXXX
     * 描述：POLYV账号下的频道录制文件ID
     * </pre>
     */
    protected String fileId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public PLChannelRecordGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelRecordGetRequest{" +
                "channelId=" + channelId +
                ", fileId='" + fileId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
