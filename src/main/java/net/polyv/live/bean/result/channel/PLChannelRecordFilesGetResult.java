package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  频道录制文件信息请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordFilesGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：录制文件列表
     * 变量名：channelId
     * 类型：List
     * </pre>
     */
    protected List<RecordFile> recordFiles;

    public List<RecordFile> getRecordFiles() {
        return recordFiles;
    }

    public void setRecordFiles(List<RecordFile> recordFiles) {
        this.recordFiles = recordFiles;
    }

    @Override
    public String toString() {
        return "PLChannelRecordFilesGetResult{" +
                "code=" + code +
                ", recordFiles=" + recordFiles +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
