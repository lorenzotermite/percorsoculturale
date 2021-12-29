package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Valutazione;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class ValutazioneDAO extends DBManager {


    public void insert(Valutazione valutazione){
        RequestBody formBody = new FormBody.Builder()
                .add("percorso", Integer.toString(valutazione.getPercorso().getId()))
                .add("valutazione", Integer.toString(valutazione.getValutazione()))
                .add("commento", valutazione.getCommento())
                .add("utente", Integer.toString(valutazione.getUtente()))
                .build();
        this.send("db_valutazione_addRow.php", formBody);
    }
}
