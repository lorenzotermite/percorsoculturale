package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Utente;

import java.io.IOException;
import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UtenteDAO extends DBManager {

    public UtenteDAO(){

    }

    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    //La password deve essere passata già hashata
    public void insert(Utente utente, String password){

        RequestBody formBody = new FormBody.Builder()
                .add("nome", utente.getNome())
                .add("cognome", utente.getCognome())
                .add("data_di_nascita", new SimpleDateFormat("yyyy-mm-dd").format(utente.getData_di_nascita()))
                .add("email", utente.getEmail())
                .add("password", password)
                .build();
        this.send("db_utente_addRow.php", formBody);

    }


}
