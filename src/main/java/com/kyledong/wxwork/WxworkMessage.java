package com.kyledong.wxwork;

import com.google.gson.Gson;

public abstract class WxworkMessage {
    private static final Gson gson = new Gson();

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
