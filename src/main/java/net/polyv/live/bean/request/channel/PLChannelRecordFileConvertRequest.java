package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道直播录制文件转存点播请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelRecordFileConvertRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 是否必填：是
     * 类型：String(64)
     * 示例值：XXXXXXXX
     * 描述：POLYV账号下的用户ID
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：文件Url
     * 变量名：fileUrl
     * 是否必填：是
     * 类型：String(64)
     * 示例值：http://rflive.videocc.net/6dd9ef824d20170425162041072/recordf.6dd9ef824d20170425162041072_20170510105906.flv
     * 描述：转存到录制文件地址（flv地址）
     * </pre>
     */
    protected String fileUrl;

    /**
     * <pre>
     * 字段名：文件名
     * 变量名：fileName
     * 是否必填：是
     * 类型：String(64)
     * 示例值：xxx
     * 描述：转存后的点播视频名称
     * </pre>
     */
    protected String fileName;

    /**
     * <pre>
     * 字段名：目录id
     * 变量名：cataid
     * 是否必填：是
     * 类型：String(64)
     * 示例值：-1
     * 描述：保存在点播的目录ID
     * </pre>
     */
    protected String cataid;

    /**
     * <pre>
     * 字段名：目录名称，
     * 变量名：cataname
     * 是否必填：是
     * 类型：String(64)
     * 示例值：xxx分类
     * 描述：默认为默认分类，设置为-1时会新建一个名称为cataname的目录，并将视频放到该目录下
     * </pre>
     */
    protected String cataname;

    /**
     * <pre>
     * 字段名：是否存放到回放列表
     * 变量名：sessionId
     * 是否必填：否
     * 类型：String(64)
     * 示例值：2ii9kkkjjd
     * 描述：默认为N ：不存放 Y：存放到回放列表
     * </pre>
     */
    protected String toPlayList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCataid() {
        return cataid;
    }

    public void setCataid(String cataid) {
        this.cataid = cataid;
    }

    public String getCataname() {
        return cataname;
    }

    public void setCataname(String cataname) {
        this.cataname = cataname;
    }

    public String getToPlayList() {
        return toPlayList;
    }

    public void setToPlayList(String toPlayList) {
        this.toPlayList = toPlayList;
    }

    public PLChannelRecordFileConvertRequest(String appId, String appSecret, String userId, String fileUrl, String fileName, String cataid, String cataname) {
        super(appId, appSecret);
        this.userId = userId;
        this.fileUrl = fileUrl;
        this.fileName = fileName;
        this.cataid = cataid;
        this.cataname = cataname;
    }

    @Override
    public String toString() {
        return "PLChannelRecordFileConvertRequest{" +
                "userId='" + userId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", timestamp=" + timestamp +
                ", fileName='" + fileName + '\'' +
                ", sign='" + sign + '\'' +
                ", cataid='" + cataid + '\'' +
                ", cataname='" + cataname + '\'' +
                ", toPlayList='" + toPlayList + '\'' +
                '}';
    }
}
