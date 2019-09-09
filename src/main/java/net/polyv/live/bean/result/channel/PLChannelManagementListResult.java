package net.polyv.live.bean.result.channel;

import net.polyv.live.bean.result.PLBaseResult;

import java.util.List;

/**
 * <pre>
 *  获取简单频道列表请求响应对象类
 * </pre>
 *
 * @author HuangYF
 */
public class PLChannelManagementListResult extends PLBaseResult {

    /**
     * <pre>
     * 字段名：当前的页数
     * 变量名：pageNumber
     * 类型：Int
     * </pre>
     */
    protected Integer pageNumber;

    /**
     * 字段名：总的条数
     * 变量名：totalItems
     * 类型：Int
     */
    protected Integer totalItems;

    /**
     * 字段名：频道列表信息对象
     * 变量名：simpleChannels
     * 类型：List
     */
    protected List<SimpleChannel> simpleChannels;

    /**
     * 字段名：当前查询最后一条记录在查询中的位置
     * 变量名：endRow
     * 类型：Int
     */
    protected Integer endRow;

    /**
     * 字段名：当前查询第一条记录在查询中的位置
     * 变量名：startRow
     * 类型：Int
     */
    protected Integer startRow;

    /**
     * 字段名：是否为第一页，值为：true/false
     * 变量名：firstPage
     * 类型：boolean
     */
    protected boolean firstPage;

    /**
     * 字段名：是否为最后一页，值为：true/false
     * 变量名：lastPage
     * 类型：boolean
     */
    protected boolean lastPage;

    /**
     * 字段名：上一页为第几页
     * 变量名：nextPageNumber
     * 类型：Int
     */
    protected Integer nextPageNumber;

    /**
     * 字段名：下一页为第几页
     * 变量名：prePageNumber
     * 类型：Int
     */
    protected Integer prePageNumber;

    /**
     * 字段名：总页数
     * 变量名：totalPages
     * 类型：List
     */
    protected Integer totalPages;

    /**
     * 字段名：当前页数量
     * 变量名：limit
     * 类型：Int
     */
    protected Integer limit;

    /**
     * 字段名：从第几个记录开始
     * 变量名：offset
     * 类型：Int
     */
    protected Integer offset;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<SimpleChannel> getSimpleChannels() {
        return simpleChannels;
    }

    public void setSimpleChannels(List<SimpleChannel> simpleChannels) {
        this.simpleChannels = simpleChannels;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public boolean isFirstPage() {
        return firstPage;
    }

    public void setFirstPage(boolean firstPage) {
        this.firstPage = firstPage;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public Integer getNextPageNumber() {
        return nextPageNumber;
    }

    public void setNextPageNumber(Integer nextPageNumber) {
        this.nextPageNumber = nextPageNumber;
    }

    public Integer getPrePageNumber() {
        return prePageNumber;
    }

    public void setPrePageNumber(Integer prePageNumber) {
        this.prePageNumber = prePageNumber;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "PLChannelManagementListResult{" +
                "pageNumber=" + pageNumber +
                ", totalItems=" + totalItems +
                ", simpleChannels=" + simpleChannels +
                ", endRow=" + endRow +
                ", startRow=" + startRow +
                ", firstPage=" + firstPage +
                ", lastPage=" + lastPage +
                ", nextPageNumber=" + nextPageNumber +
                ", prePageNumber=" + prePageNumber +
                ", totalPages=" + totalPages +
                ", limit=" + limit +
                ", offset=" + offset +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
