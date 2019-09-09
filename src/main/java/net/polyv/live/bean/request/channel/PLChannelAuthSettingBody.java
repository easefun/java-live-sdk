package net.polyv.live.bean.request.channel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 *  POLYV创建频道观看条件对象
 * </pre>
 *
 * @author moshunwei
 */
public class PLChannelAuthSettingBody {
    
    /**
     * <pre>
     * 字段名：观看条件
     * 变量名：rank
     * 是否必填：是
     * 类型：byte
     * 示例值：1
     * 描述：取值为1/2 表示主要/次要观看条件
     * </pre>
     */
    private Byte rank;
    
    /**
     * <pre>
     * 字段名：开启
     * 变量名：enabled
     * 是否必填：是
     * 类型：string
     * 示例值：Y
     * 描述：是否开启，Y为开启，N为关闭
     * </pre>
     */
    private String enabled;
    
    /**
     * <pre>
     * 字段名：观看条件
     * 变量名：authType
     * 是否必填：否
     * 类型：string
     * 示例值：pay
     * 描述：付费观看-pay，验证码观看-code，白名单观看-phone，登记观看-info，自定义授权观看-custom，外部授权-external
     * </pre>
     */
    private String authType;
    
    /**
     * <pre>
     * 字段名：付费观看提示信息
     * 变量名：payAuthTips
     * 是否必填：否
     * 类型：string
     * 示例值：pay
     * 描述：authType：pay是必填 付费观看提示信息
     * </pre>
     */
    private String payAuthTips;
    
    /**
     * <pre>
     * 字段名：验证码观看提示信息
     * 变量名：codeAuthTips
     * 是否必填：否
     * 类型：string
     * 示例值：请输入验证码
     * 描述：authType：code必填 验证码观看提示信息
     * </pre>
     */
    private String codeAuthTips;
    
    /**
     * <pre>
     * 字段名：登记观看提示信息
     * 变量名：infoAuthTips
     * 是否必填：否
     * 类型：string
     * 示例值：提示信息
     * 描述：authType：info 登记观看提示信息
     * </pre>
     */
    private String infoAuthTips;
    
    /**
     * <pre>
     * 字段名：验证码
     * 变量名：infoAuthTips
     * 是否必填：否
     * 类型：string
     * 示例值：提示信息
     * 描述：authType： code必填 验证码
     * </pre>
     */
    private String authCode;
    
    /**
     * <pre>
     * 字段名：提示文案
     * 变量名：qcodeTips
     * 是否必填：否
     * 类型：string
     * 示例值：提示
     * 描述：提示文案 authType： code
     * </pre>
     */
    private String qcodeTips;
    
    /**
     * <pre>
     * 字段名：公众号二维码地址
     * 变量名：qcodeImg
     * 是否必填：否
     * 类型：string
     * 示例值：提示
     * 描述：authType： code 公众号二维码地址必填
     * </pre>
     */
    private String qcodeImg;
    
    /**
     * <pre>
     * 字段名：付费观看必填字段
     * 变量名：price
     * 是否必填：否
     * 类型：double
     * 示例值：1.00
     * 描述：authType： pay 付费金额必填
     * </pre>
     */
    private BigDecimal price;
    
    /**
     * <pre>
     * 字段名：付费有效截止日期
     * 变量名：watchEndTime
     * 是否必填：否
     * 类型：string
     * 示例值：pay
     * 描述：authType: pay,付费有效截止日期，格式为yyyy-MM-dd HH:mm
     * </pre>
     */
    private Date watchEndTime;
    
    /**
     * <pre>
     * 字段名：费观看有效时长
     * 变量名：validTimePeriod
     * 是否必填：否
     * 类型：string
     * 示例值：1
     * 描述：authType: pay
     * </pre>
     */
    private Integer validTimePeriod;
    
    /**
     * <pre>
     * 字段名：SecretKey
     * 变量名：customKey
     * 是否必填：否
     * 类型：string
     * 示例值：pay
     * 描述：authType: custom 必填
     * </pre>
     */
    private String customKey;
    
    /**
     * <pre>
     * 字段名：自定义url
     * 变量名：customUri
     * 是否必填：否
     * 类型：string
     * 示例值：https://xxx.com/usl
     * 描述：authType: custom 必填
     * </pre>
     */
    private String customUri;
    
    /**
     * <pre>
     * 字段名：SecretKey
     * 变量名：externalKey
     * 是否必填：否
     * 类型：string
     * 示例值：sdfdsfs
     * 描述：authType： external 必填
     * </pre>
     */
    private String externalKey;
    
    /**
     * <pre>
     * 字段名：自定义url
     * 变量名：externalUri
     * 是否必填：否
     * 类型：string
     * 示例值：https://xxx.com/usl
     * 描述：authType： external 必填
     * </pre>
     */
    private String externalUri;
    
    /**
     * <pre>
     * 字段名：跳转地址
     * 变量名：externalRedirectUri
     * 是否必填：否
     * 类型：string
     * 示例值：https://xxx.com/usl
     * 描述：authType：external
     * </pre>
     */
    private String externalRedirectUri;
    
    public Byte getRank() {
        return rank;
    }
    
    public void setRank(Byte rank) {
        this.rank = rank;
    }
    
    public String getEnabled() {
        return enabled;
    }
    
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    
    public String getAuthType() {
        return authType;
    }
    
    public void setAuthType(String authType) {
        this.authType = authType;
    }
    
    public String getPayAuthTips() {
        return payAuthTips;
    }
    
    public void setPayAuthTips(String payAuthTips) {
        this.payAuthTips = payAuthTips;
    }
    
    public String getCodeAuthTips() {
        return codeAuthTips;
    }
    
    public void setCodeAuthTips(String codeAuthTips) {
        this.codeAuthTips = codeAuthTips;
    }
    
    public String getInfoAuthTips() {
        return infoAuthTips;
    }
    
    public void setInfoAuthTips(String infoAuthTips) {
        this.infoAuthTips = infoAuthTips;
    }
    
    public String getAuthCode() {
        return authCode;
    }
    
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
    
    public String getQcodeTips() {
        return qcodeTips;
    }
    
    public void setQcodeTips(String qcodeTips) {
        this.qcodeTips = qcodeTips;
    }
    
    public String getQcodeImg() {
        return qcodeImg;
    }
    
    public void setQcodeImg(String qcodeImg) {
        this.qcodeImg = qcodeImg;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public Date getWatchEndTime() {
        return watchEndTime;
    }
    
    public void setWatchEndTime(Date watchEndTime) {
        this.watchEndTime = watchEndTime;
    }
    
    public Integer getValidTimePeriod() {
        return validTimePeriod;
    }
    
    public void setValidTimePeriod(Integer validTimePeriod) {
        this.validTimePeriod = validTimePeriod;
    }
    
    public String getCustomKey() {
        return customKey;
    }
    
    public void setCustomKey(String customKey) {
        this.customKey = customKey;
    }
    
    public String getCustomUri() {
        return customUri;
    }
    
    public void setCustomUri(String customUri) {
        this.customUri = customUri;
    }
    
    public String getExternalKey() {
        return externalKey;
    }
    
    public void setExternalKey(String externalKey) {
        this.externalKey = externalKey;
    }
    
    public String getExternalUri() {
        return externalUri;
    }
    
    public void setExternalUri(String externalUri) {
        this.externalUri = externalUri;
    }
    
    public String getExternalRedirectUri() {
        return externalRedirectUri;
    }
    
    public void setExternalRedirectUri(String externalRedirectUri) {
        this.externalRedirectUri = externalRedirectUri;
    }
}
