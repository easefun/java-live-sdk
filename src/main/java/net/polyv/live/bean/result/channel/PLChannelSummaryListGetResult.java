package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  频道汇总统计的播放数据请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelSummaryListGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：频道汇总统计播放数据列表
     * 变量名：channelSummarys
     * 类型：List
     * </pre>
     */
    protected List<ChannelSummary> channelSummarys;

    public List<ChannelSummary> getChannelSummarys() {
        return channelSummarys;
    }

    public void setChannelSummarys(List<ChannelSummary> channelSummarys) {
        this.channelSummarys = channelSummarys;
    }

    @Override
    public String toString() {
        return "PLChannelSummaryListGetResult{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", channelSummarys=" + channelSummarys +
                ", message='" + message + '\'' +
                '}';
    }

}
