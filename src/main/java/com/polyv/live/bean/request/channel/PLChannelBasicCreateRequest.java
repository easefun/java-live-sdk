package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV创建频道请求接口对象
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicCreateRequest extends PLBaseRequest {
    
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
    protected PLChannelBasicCreateBody requestBody;
    
    public PLChannelBasicCreateRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }
    
    public PLChannelBasicCreateRequest(String appId, String appSecret, PLChannelBasicCreateBody requestBody) {
        super(appId, appSecret);
        this.requestBody = requestBody;
    }
    
    public PLChannelBasicCreateBody getRequestBody() {
        return requestBody;
    }
    
    public void setRequestBody(PLChannelBasicCreateBody requestBody) {
        this.requestBody = requestBody;
    }
}
