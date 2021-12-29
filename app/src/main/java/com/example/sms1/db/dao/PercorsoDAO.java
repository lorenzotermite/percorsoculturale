package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Percorso;


import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class PercorsoDAO extends DBManager {

    public void insert(Percorso percorso){
        //TODO vedere come caricare le immagini
        /*
        RequestBody formBody = new FormBody.Builder()
                .add("nome", percorso.getNome())
                .add("descrizione", percorso.getDescrizione())
                .add("immagine", percorso.getImmagine())
                .build();
        this.send("db_utente_addRow.php", formBody);
        */
    }
}
