package net.polyv.live.bean.request.record;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV异步合并频道录制文件请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordMergeRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：频道ID
     * 变量名：channelId
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10001
     * 描述：POLYV账号下的直播频道ID
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     * 字段名：录制视频文件ID
     * 变量名：fileIds
     * 是否必填：是
     * 类型：String
     * 示例值：xxx,xxx
     * 描述：要合并的录制视频文件ID，多个id用英文逗号, 分隔
     * </pre>
     */
    protected String fileIds;

    /**
     * <pre>
     * 字段名：合并后的视频的文件名
     * 变量名：fileName
     * 是否必填：否
     * 类型：String
     * 示例值：文件1
     * 描述：生成文件的文件名
     * </pre>
     */
    protected String fileName;

    /**
     * <pre>
     * 字段名：回调地址
     * 变量名：callbackUrl
     * 是否必填：否
     * 类型：String
     * 示例值：http://www.polyv.net/callbackUrl
     * 描述：合并成功后的回调地址
     * </pre>
     */
    protected String callbackUrl;

    /**
     * <pre>
     * 字段名：是否自动转存点播
     * 变量名：autoConvert
     * 是否必填：否
     * 类型：String
     * 示例值：Y/N
     * 描述：传入Y，自动转存到对应点播分类下(直播回放-频道号-场次)
     * </pre>
     */
    protected String autoConvert;

    /**
     * <pre>
     * 字段名：是否合并录制MP4
     * 变量名：mergeMp4
     * 是否必填：否
     * 类型：String
     * 示例值：Y/N
     * 描述：传入Y：合并mp4文件，不传或者N：合并m3u8文件
     * </pre>
     */
    protected String mergeMp4;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getFileIds() {
        return fileIds;
    }

    public void setFileIds(String fileIds) {
        this.fileIds = fileIds;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getAutoConvert() {
        return autoConvert;
    }

    public void setAutoConvert(String autoConvert) {
        this.autoConvert = autoConvert;
    }

    public String getMergeMp4() {
        return mergeMp4;
    }

    public void setMergeMp4(String mergeMp4) {
        this.mergeMp4 = mergeMp4;
    }

    public PLChannelRecordMergeRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelRecordMergeRequest{" +
                "channelId=" + channelId +
                ", fileIds='" + fileIds + '\'' +
                ", fileName='" + fileName + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", autoConvert='" + autoConvert + '\'' +
                ", mergeMp4='" + mergeMp4 + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
