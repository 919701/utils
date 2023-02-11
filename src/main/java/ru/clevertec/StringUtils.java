package ru.clevertec;

public class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("Utility class");
    }
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str)
                && Double.parseDouble(str) > 0;
    }
}
