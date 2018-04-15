package me.pingcai.util;

import java.util.Map;
import java.util.UUID;

public class StringUtils {

    private StringUtils() {
    }

    /**
     * @param removeLine 去除UUID中的横线
     * @return
     */
    public static String uuid(boolean removeLine) {
        String uuid = UUID.randomUUID().toString();
        return removeLine ? uuid.replaceAll("-", "") : uuid;
    }


    public static String toHttpQuery(Map<String, Object> params) {
        if (params.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> en : params.entrySet()) {
            sb.append(en.getKey()).append("=").append(en.getValue()).append("&");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
