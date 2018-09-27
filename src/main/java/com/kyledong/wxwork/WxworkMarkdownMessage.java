package com.kyledong.wxwork;


public class WxworkMarkdownMessage extends WxworkMessage {

    private String msgtype;
    private Markdown markdown;

    public WxworkMarkdownMessage() {
    }

    public WxworkMarkdownMessage(String content) {
        this.msgtype = "markdown";
        this.markdown = new Markdown(content);
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Markdown getMarkdown() {
        return markdown;
    }

    public void setMarkdown(Markdown markdown) {
        this.markdown = markdown;
    }

    public static class Markdown extends WxworkMessage {
        private String content;

        public Markdown(String content) {
            this.content = content;
        }
    }
}
