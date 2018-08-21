package com.polyv.live.bean.result.channel;

import java.util.Date;

/**
 * <pre>
 *  简单的频道信息
 * </pre>
 *
 * @author HuangYF
 */
public class SimpleChannel {

    /**
     * <pre>
     *  字段名：频道ID
     *  变量名：channelId
     *  类型：int
     * </pre>
     */
    protected Integer channelId;

    /**
     * <pre>
     *  字段名：频道名称
     *  变量名：name
     *  类型：String
     * </pre>
     */
    protected String name;

    /**
     * <pre>
     *  字段名：频道密码
     *  变量名：channelPasswd
     *  类型：String
     * </pre>
     */
    protected String channelPasswd;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannelPasswd() {
        return channelPasswd;
    }

    public void setChannelPasswd(String channelPasswd) {
        this.channelPasswd = channelPasswd;
    }

    @Override
    public String toString() {
        return "SimpleChannel{" +
                "channelId=" + channelId +
                ", name='" + name + '\'' +
                ", channelPasswd='" + channelPasswd + '\'' +
                '}';
    }
}
