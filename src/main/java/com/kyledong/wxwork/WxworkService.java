package com.kyledong.wxwork;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class WxworkService {

    private static final CloseableHttpClient httpClient = HttpClients.createSystem();
    private static final Gson gson = new Gson();
    private static String wechatWebBaseUrl = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=";

    public static void setWechatWebBaseUrl(String wechatWebBaseUrl) {
        WxworkService.wechatWebBaseUrl = wechatWebBaseUrl;
    }

    public static WxworkResponse sendText(String key, String content) throws IOException {
        return sendWechatMessageInternal(key, new WxworkTextMessage(content));
    }

    public static WxworkResponse sendMarkdown(String key, String content) throws IOException {
        return sendWechatMessageInternal(key, new WxworkMarkdownMessage(content));
    }


    private static WxworkResponse sendWechatMessageInternal(String key, WxworkMessage message) throws IOException {
        String serviceUrl = wechatWebBaseUrl + key;
        HttpPost httpPost = new HttpPost(serviceUrl);
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");

        httpPost.setEntity(new StringEntity(message.toString(), "UTF-8"));

        CloseableHttpResponse response = httpClient.execute(httpPost);
        String responseString = EntityUtils.toString(response.getEntity());

        return gson.fromJson(responseString, WxworkResponse.class);
    }


    @Override
    protected void finalize() throws Throwable {
        httpClient.close();
        super.finalize();
    }
}
