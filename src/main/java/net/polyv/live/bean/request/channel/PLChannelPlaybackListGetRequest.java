package net.polyv.live.bean.request.channel;

import net.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV频道回放视频列表请求对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelPlaybackListGetRequest extends PLBaseRequest {

    /**
     * <pre>
     * 字段名：第几页
     * 变量名：page
     * 是否必填：否
     * 类型：Int(11)
     * 示例值：1   --  第一页
     * 描述：分页查询的页数
     * </pre>
     */
    protected Integer page;

    /**
     * <pre>
     * 字段名：每页查询数量
     * 变量名：pageSize
     * 是否必填：是
     * 类型：Int(11)
     * 示例值：10  --  每页查询10条数据
     * 描述：分页查询的每页数据量
     * </pre>
     */
    protected Integer pageSize;

    /**
     * <pre>
     * 字段名：回放类型
     * 变量名：listType
     * 是否必填：是
     * 类型：string
     * 示例值：vod  --  点播列表
     * 描述：playback-回放列表，vod-点播列表; 默认普通直播场景为vod，三分屏为playback
     * </pre>
     */
    protected String listType;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PLChannelPlaybackListGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    @Override
    public String toString() {
        return "PLChannelPlaybackListGetRequest{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", listType='" + listType + '\'' +
                '}';
    }
}
