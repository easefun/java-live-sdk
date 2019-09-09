package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  多频道的实时在线人数请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelViewersGetResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：频道在线人数列表
     * 变量名：channelId
     * 类型：List
     * </pre>
     */
    protected List<ChannelViewer> channelViewers;

    public List<ChannelViewer> getChannelViewers() {
        return channelViewers;
    }

    public void setChannelViewers(List<ChannelViewer> channelViewers) {
        this.channelViewers = channelViewers;
    }

    @Override
    public String toString() {
        return "PLChannelViewersGetResult{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", channelViewers=" + channelViewers +
                ", message='" + message + '\'' +
                '}';
    }
}
