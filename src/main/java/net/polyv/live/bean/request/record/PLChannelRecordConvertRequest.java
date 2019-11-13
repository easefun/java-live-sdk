package net.polyv.live.bean.request.record;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV异步转存频道录制文件请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordConvertRequest extends PLBaseRequest {

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
     * 字段名：转存后的视频的文件名
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
     * 字段名：点播的目录ID
     * 变量名：cataId
     * 是否必填：否
     * 类型：Long
     * 示例值：11111
     * 描述：转存到点播的目录ID, 默认为点播的根目录ID
     * </pre>
     */
    protected Long cataId;

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

    public Long getCataId() {
        return cataId;
    }

    public void setCataId(Long cataId) {
        this.cataId = cataId;
    }

    public PLChannelRecordConvertRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelRecordConvertRequest{" +
                "channelId=" + channelId +
                ", fileIds='" + fileIds + '\'' +
                ", fileName='" + fileName + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", cataId=" + cataId +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
