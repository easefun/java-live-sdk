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
     * 字段名：文件ID
     * 变量名：fileId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：XXXXXXXX
     * 描述：POLYV账号下的频道录制文件ID
     * </pre>
     */
    protected String fileId;

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
                "fileId='" + fileId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
