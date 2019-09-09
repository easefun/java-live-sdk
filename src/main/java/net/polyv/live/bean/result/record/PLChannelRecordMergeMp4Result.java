package net.polyv.live.bean.result.record;

import net.polyv.live.bean.result.PLBaseResult;

/**
 * <pre>
 *  获取频道录制文件信息请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordMergeMp4Result extends PLBaseResult {

    /**
     * <pre>
     * 字段名：文件ID
     * 变量名：fileId
     * 类型：String
     * </pre>
     */
    protected String fileId;

    /**
     * <pre>
     * 字段名：文件地址
     * 变量名：fileUrl
     * 类型：String
     * </pre>
     */
    protected String fileUrl;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "PLChannelRecordMergeMp4Result{" +
                "fileId='" + fileId + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
