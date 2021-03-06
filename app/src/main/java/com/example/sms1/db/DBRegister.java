package com.example.sms1.db;

import android.os.AsyncTask;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DBRegister extends AsyncTask<String, Integer, Long> {


    public DBRegister(){
        //TODO Rimuovi commento

    }


    @Override
    protected Long doInBackground(String... params) {

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("nome", params[0])
                .add("cognome", params[1])
                .add("data_di_nascita", params[2])
                .add("email", params[3])
                .add("password", Integer.toString(params[4].hashCode()))
                .build();
        String url = "http://192.168.1.13/db_utente_addRow.php?";
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        }finally {
            return null;
        }

    }
}
