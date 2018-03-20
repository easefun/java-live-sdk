package com.polyv.live.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

/**
 * <pre>
 *  加密工具类。
 * </pre>
 *
 * @author HuangYF
 */
public class EncryptionUtils {

    /**
     * 对字符串做MD5加密，返回加密后的字符串。
     * @param text 待加密的字符串。
     * @return 加密后的字符串。
     */
    public static String md5Hex(String text) {
        return DigestUtils.md5Hex(text);
    }

    /**
     * 对字符串做SHA-HEX加密，返回加密后的字符串。
     * @param text 待加密的字符串。
     * @return 加密后的字符串。
     */
    public static String shaHex(String text) {
        return DigestUtils.sha1Hex(text);
    }

    /**
     * 对字符串做SHA-1加密，然后截取前面20个字符（遗留OVP系统的密码验证方式）。
     * @param text 待加密的字符串。
     * @return 加密后的前20个字符。
     */
    public static String getLittleSHA1(String text) {
        String encryptedStr = DigestUtils.sha1Hex(text).toUpperCase();
        return encryptedStr.substring(0, 20);
    }

    /**
     * 对字符串做SHA-1加密，返回加密后的字符串。
     * @param text 待加密的字符串。
     * @return 加密后的字符串。
     */
    public static String getSHA1(String text) {
        return encode(text, "SHA-1");
    }

    private static String encode(String str, String type) {
        try {
            MessageDigest alga = MessageDigest.getInstance(type);
            alga.update(str.getBytes("UTF-8"));
            byte[] digesta = alga.digest();
            return byte2hex(digesta);
        } catch (Exception e) {
            return "";
        }
    }

    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp;
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else hs = hs + stmp;
        }
        return hs.toUpperCase();
    }

}
