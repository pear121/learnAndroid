package com.example.he.coolweather2.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by he on 2017/1/17.
 */

public class HttpUtil {
    public  static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }





}
