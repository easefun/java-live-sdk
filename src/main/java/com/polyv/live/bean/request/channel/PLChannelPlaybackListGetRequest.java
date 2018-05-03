package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

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

    @Override
    public String toString() {
        return "PLChannelPlaybackListGetRequest{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
