package com.jiyun.administrator.yuekao.http;

import android.content.Context;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/10/13.
 */

public class OkhttpUtils {
    private static OkhttpUtils utils;
    private OkHttpClient client;

    private OkhttpUtils(Context context) {
        client=new OkHttpClient();
    }

    public static synchronized OkhttpUtils getInstance(Context context){
        if (utils==null){
            utils=new OkhttpUtils(context);
        }
        return utils;
    }

    public Call getData(String url, Callback callback){
        Request request=new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
        return call;
    }
}
