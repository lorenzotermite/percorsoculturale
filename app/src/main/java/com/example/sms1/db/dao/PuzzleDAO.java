package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Puzzle;

import java.io.IOException;
import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class PuzzleDAO {

    public PuzzleDAO(){

    }

    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    public void insert(Puzzle puzzle){
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("directory", puzzle.getDirectory())
                .build();
        // String url = this.URL+"db_utente_addRow.php"; //TODO modificare db_xxx
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}