package com.example.sms1.db.dao;
import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Attivita;
import com.example.sms1.db.tables.Puzzle;

import java.io.IOException;
import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class AttivitaDAO extends DBManager{

    public AttivitaDAO(){

    }

    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    public void insert(Attivita attivita){
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("punteggio", Integer.toString(attivita.getPunteggio()))
                .build();
        this.send("db_attivita_addRow.php", formBody);
    }



}
