package net.polyv.live.enumeration;

/**
 * 代理方式
 */
public enum ProxyType {

    /**
     * 正向代理。
     */
    FORWARD("Forward", "正向代理"),

    /**
     * 反向代理。
     */
    REVERSE("Reverse", "反向代理");

    /**
     * 值。
     */
    private String value;

    /**
     * 中文描述。
     */
    private String text;

    /**
     * @return 当前枚举对象的值。
     */
    public String getValue() {
        return value;
    }

    /**
     * @return 当前状态的中文描述。
     */
    public String getText() {
        return text;
    }

    /**
     * @param value 值
     * @param text 中文描述
     */
    ProxyType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 根据值获取枚举对象。
     * @param value 值
     * @return 枚举对象
     */
    public static ProxyType getInstance(String value) {
        ProxyType[] allValues = ProxyType.values();
        for (ProxyType val : allValues) {
            if (val.getValue().equalsIgnoreCase(value)) {
                return val;
            }
        }
        throw new IllegalArgumentException("值非法，没有对应的枚举对象, value=" + value);
    }

}
