package com.polyv.live.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.*;

/**
 * <pre>
 *  map操作工具类
 * </pre>
 *
 * @author HuangYF
 */
public class MapUtil {

	/**
	 * Map key排序
	 * @param map map
	 * @return map
	 */
	public static Map<String,String> order(Map<String, String> map){
		HashMap<String, String> tempMap = new LinkedHashMap<String, String>();
		List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(map.entrySet());

		Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
				return (o1.getKey()).toString().compareTo(o2.getKey());
			}
		});

		for (int i = 0; i < infoIds.size(); i++) {
			Map.Entry<String, String> item = infoIds.get(i);
			tempMap.put(item.getKey(), item.getValue());
		}
		return tempMap;
	}


	/**
	 * 转换对象为map
	 * @param obj object
	 * @return map
	 */
	public static Map<String, String> objectToMap(Object obj){
		Map<String, String> reMap = new HashMap<String, String>();
		if (null == obj)
			return null;
		try {
			Class<?> objClass = obj.getClass();
			while(objClass != null){
				Field[] fields = objClass.getDeclaredFields();
				for(int i = 0; i < fields.length; i++){
					try {
						Field f = objClass.getDeclaredField(fields[i].getName());
						f.setAccessible(true);
						Object o = f.get(obj);
						reMap.put(fields[i].getName(), (null == o) ? null : o.toString());
					} catch (NoSuchFieldException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
				objClass = objClass.getSuperclass();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return reMap;
	}


	/**
	 * 获取所有Fields,包含父类field
	 * @param clazz clazz
	 * @return list
	 */
	private static List<Field> getAllFields (Class<?> clazz) {
		if(!clazz.equals(Object.class)){
			return null;
		}
		List<Field> fields = new ArrayList<Field>(Arrays.asList(clazz.getDeclaredFields()));
		List<Field> fields2 = getAllFields(clazz.getSuperclass());
		if(fields2 != null){
			fields.addAll(fields2);
		}
		return fields;
	}

	/**
	 * url 参数串连
	 * @param map map
	 * @param keyLower keyLower
	 * @param valueUrlEncode valueUrlEncode
	 * @return string
	 */
	public static String mapJoin (Map<String, String> map, boolean keyLower, boolean valueUrlEncode) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String key : map.keySet()) {
			if(map.get(key) == null || "".equals(map.get(key))){
				continue;
			}

			try {
				String temp = (key.endsWith("_") && key.length() > 1) ? key.substring(0, key.length() - 1) : key;
				stringBuilder.append(keyLower ? temp.toLowerCase() : temp)
						.append("=")
						.append(valueUrlEncode ? URLEncoder.encode(map.get(key), "utf-8").replace("+", "%20") : map.get(key))
						.append("&");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		if (stringBuilder.length() > 0) {
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		}
		return stringBuilder.toString();
	}

	/**
	 * url 参数串连但是不进行参数Encode
	 * @param map map
	 * @return string
	 */
	public static String mapJoinNotEncode (Map<String, String> map) {
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		for (String key : map.keySet()) {
			if(map.get(key) == null || "".equals(map.get(key)))
				continue;
			if (0 != i)
				stringBuilder.append("&");
			stringBuilder.append(key).append("=").append(map.get(key));
			i++;

		}
		return stringBuilder.toString();
	}
}
