package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

public class PLChannelBasicUpdateRequest extends PLBaseRequest {
    
    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * 类型：Integer
     * 示例值：100010
     * 描述：频道号
     * </pre>
     */
    protected Integer channelId;
    
    /**
     * <pre>
     * 字段名：创建频道默认值请求体
     * 变量名：requestBody
     * 是否必填：是
     * 类型：PLChannelBasicCreateBody
     * 示例值：
     * 描述：创建频道默认值请对象
     * </pre>
     */
    protected PLChannelBasicUpdateBody requestBody;

    public PLChannelBasicUpdateRequest(String appId, String appSecret, Integer channelId, PLChannelBasicUpdateBody requestBody) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.requestBody = requestBody;
    }
    
    public Integer getChannelId() {
        return channelId;
    }
    
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
    
    public PLChannelBasicUpdateBody getRequestBody() {
        return requestBody;
    }
    
    public void setRequestBody(PLChannelBasicUpdateBody requestBody) {
        this.requestBody = requestBody;
    }
}
