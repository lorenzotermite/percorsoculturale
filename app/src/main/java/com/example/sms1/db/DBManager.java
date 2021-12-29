package com.example.sms1.db;

import java.io.IOException;
import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DBManager {
    //TODO modificare URL con un url statico
    protected static final String URL = "http://192.168.1.13/";


    protected String send(String page, RequestBody formBody){
        OkHttpClient client = new OkHttpClient();

        String url = URL+page;
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        String risposta = "";
        try (Response response = client.newCall(request).execute()) {
            risposta = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return risposta;
    }
}
