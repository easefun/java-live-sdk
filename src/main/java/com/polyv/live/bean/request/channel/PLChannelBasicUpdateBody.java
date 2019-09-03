package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseBody;

/**
 * <pre>
 *  POLYV更新频道body对象
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelBasicUpdateBody extends PLBaseBody {
    
    /**
     * <pre>
     * 字段名：频道设置
     * 变量名：basicSettingBody
     * 是否必填：是
     * 类型：PLChannelBasicSettingUpdateBody
     * 示例值：
     * 描述：文档（http://dev.polyv.net/2019/uncategorized/update-channel-detail-setting/）
     * </pre>
     */
    private PLChannelBasicSettingUpdateBody basicSetting;
    
    /**
     * <pre>
     * 字段名：观看条件
     * 变量名：authSettingBody
     * 是否必填：否
     * 类型：PLChannelAuthSettingBody
     * 示例值：
     * 描述：文档（http://dev.polyv.net/2018/liveproduct/l-api/szgkygg/ymgktj/channel-auth-update/）
     * </pre>
     */
    private PLChannelAuthSettingBody authSettings;
    
    public PLChannelBasicSettingUpdateBody getBasicSetting() {
        return basicSetting;
    }
    
    public void setBasicSetting(PLChannelBasicSettingUpdateBody basicSetting) {
        this.basicSetting = basicSetting;
    }
    
    public PLChannelAuthSettingBody getAuthSettings() {
        return authSettings;
    }
    
    public void setAuthSettings(PLChannelAuthSettingBody authSettings) {
        this.authSettings = authSettings;
    }
}
