package com.polyv.live.bean.request.channel;

import com.polyv.live.bean.request.PLBaseRequest;

/**
 * <pre>
 *  POLYV分页获取频道观看日志
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelViewLogsGetRequest extends PLBaseRequest {

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
     * 字段名：查询的当天
     * 变量名：currentDay
     * 是否必填：是
     * 类型：String(32)
     * 示例值：格式为yyyy-MM-dd
     * 描述：需要查询数据的日期当天
     * </pre>
     */
    protected String currentDay;

    /**
     * <pre>
     * 字段名：查询param1参数-观看用户ID
     * 变量名：param1
     * 是否必填：否
     * 类型：String(32)
     * 示例值：
     * 描述：观看用户的ID，播放器传入的参数param1
     * </pre>
     */
    protected String param1;

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

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public PLChannelViewLogsGetRequest(String appId, String appSecret) {
        super(appId, appSecret);
    }

    @Override
    public String toString() {
        return "PLChannelViewLogsGetRequest{" +
                "page=" + page +
                ", appId='" + appId + '\'' +
                ", pageSize=" + pageSize +
                ", appSecret='" + appSecret + '\'' +
                ", currentDay='" + currentDay + '\'' +
                ", timestamp=" + timestamp +
                ", param1='" + param1 + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
