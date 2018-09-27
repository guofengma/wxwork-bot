package com.kyledong.wxwork;

import java.io.IOException;
import java.util.UUID;

public class TestCases {

    public static void main(String[] args) throws IOException {

        String content = null;
        String key = null;

        if (args.length == 2) {
            key = args[0];
            content = args[1];
        } else {
            System.err.println("Usages: wechat_key message_content");
            System.exit(-1);
        }

        System.out.println(WxworkService.sendText(key, UUID.randomUUID().toString()));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.quote(content)));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.title(content, 2)));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.code(content)));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.colorGreen(content)));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.colorGray(content)));
        System.out.println(WxworkService.sendMarkdown(key, MarkdownUtil.colorOrange( content)));
    }
}