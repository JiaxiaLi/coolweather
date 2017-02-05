package com.lijiaxia.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 描述：
 * 与服务器进行交互
 * 作者：LJX
 * 时间：2017/1/25:下午3:54
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
