package com.kyledong.wxwork;

public class MarkdownUtil {

    public static String quote(String content) {
        return "> " + content;
    }

    public static String title(String content, int level) {
        if (level <= 0 || level > 6) {
            throw new RuntimeException("Title level can only be 1 ~ 6");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append("#");
        }

        builder.append(" ").append(content);
        return builder.toString();
    }

    public static String code(String content) {
        return "`" + content + "`";
    }

    public static String colorGreen(String content) {
        return "<font color=\"info\">" + content + "</font>";
    }

    public static String colorGray(String content) {
        return "<font color=\"comment\">" + content + "</font>";
    }

    public static String colorOrange(String content) {
        return "<font color=\"warning\">" + content + "</font>";
    }
}
