package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Utente;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UtenteDAO extends DBManager {

    public UtenteDAO(){

    }

    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    public void insert(Utente utente, String password){
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("nome", utente.getNome())
                .add("cognome", utente.getCognome())
                .add("data_di_nascita", utente.getData_di_nascita().getTime().toString())
                .add("email", utente.getEmail())
                .add("password", password)
                .build();
        String url = this.URL+"db_utente_addRow.php";
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