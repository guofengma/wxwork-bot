package com.kyledong.wxwork;


public class WxworkTextMessage extends WxworkMessage {
    private String msgtype;
    private Text text;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public WxworkTextMessage() {
    }

    public WxworkTextMessage(String content) {
        this.msgtype = "text";
        this.text = new Text(content);
    }

    public static class Text extends WxworkMessage {
        private String content;

        public Text() {
        }

        public Text(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
