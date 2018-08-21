package com.polyv.live.bean.client;

import java.io.Serializable;

/**
 * <pre>
 *  设置请求代理的对象
 * </pre>
 *
 * @author HuangYF
 */
public class RequestHost implements Serializable {

    private static final long serialVersionUID = -8830459206563709681L;

    private String host;

    private int port;

    private String ip;

    private String proxyType;

    private String scheme;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getProxyType() {
        return proxyType;
    }

    public void setProxyType(String proxyType) {
        this.proxyType = proxyType;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public RequestHost(String host, int port, String ip, String scheme, String proxyType) {
        this.host = host;
        this.port = port;
        this.ip = ip;
        this.proxyType = proxyType;
        this.scheme = scheme;
    }

    public RequestHost(String host, int port, String scheme, String proxyType) {
        this.host = host;
        this.port = port;
        this.proxyType = proxyType;
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return "RequestHost{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", ip=" + ip +
                ", proxyType='" + proxyType + '\'' +
                '}';
    }
}
