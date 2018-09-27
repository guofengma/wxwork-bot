package com.kyledong.wxwork;

import com.google.gson.Gson;

public class WxworkResponse {
    private static final Gson gson = new Gson();

    private int errcode;
    private String errmsg;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
