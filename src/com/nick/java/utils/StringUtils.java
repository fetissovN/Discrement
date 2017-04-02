package com.nick.java.utils;

public class StringUtils {
    public static final String A = "a";
    public static final String B = "b";
    public static final String C = "c";
    public static final String EMPTY_STRING = "";
    public StringUtils() {
    }
    public static boolean isEmpty(String str) {
        if (str != null) {
            return EMPTY_STRING.equals(str);
        }

        return true;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(String str) {
        if (isNotEmpty(str)) {
            return EMPTY_STRING.equals(str.trim());
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}
