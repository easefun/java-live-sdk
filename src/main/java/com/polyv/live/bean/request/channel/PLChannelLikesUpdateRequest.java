package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV设置频道点赞数和观看人数对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelLikesUpdateRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：点赞数
     * 变量名：likes
     * 是否必填：是
     * 类型：int
     * 示例值：10
     * 描述：频道展示点赞数
     * </pre>
     */
    protected Integer likes;

    /**
     * <pre>
     * 字段名：累计观看人数
     * 变量名：viewers
     * 是否必填：是
     * 类型：int
     * 示例值：100
     * 描述：频道展示观看人数
     * </pre>
     */
    protected Integer viewers;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    public PLChannelLikesUpdateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelLikesUpdateRequest{" +
                "likes=" + likes +
                ", viewers=" + viewers +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
