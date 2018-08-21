package com.polyv.live.service;

/**
 * <pre>
 *  POLYV核心公用的接口定义
 * </pre>
 *
 * @author HuangYF
 */
public interface PLBaseService {

    /**
     * <pre>
     *  设置正向代理
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param scheme    http/https
     */
    void initForwardProxy(String host, int port, String scheme);

    /**
     * <pre>
     *  设置反向代理(带IP地址)
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param ipAddress 代理IP地址
     * @param scheme    http/https
     */
    void initReverseProxy(String host, int port, String ipAddress, String scheme);

    /**
     * <pre>
     *  设置反向代理
     * </pre>
     *
     * @param host      代理host
     * @param port      代理端口
     * @param scheme    http/https
     */
    void initReverseProxy(String host, int port, String scheme);

    /**
     * <pre>
     *  销毁代理
     * </pre>
     */
    void destroyProxy();

}
