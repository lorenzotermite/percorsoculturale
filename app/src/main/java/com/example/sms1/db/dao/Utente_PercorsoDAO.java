package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Utente_Percorso;

import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class Utente_PercorsoDAO extends DBManager {

    public void insert(Utente_Percorso utentePercorso){
        RequestBody formBody = new FormBody.Builder()
                .add("utente", Integer.toString(utentePercorso.getIdUtente()))
                .add("percorso", Integer.toString(utentePercorso.getIdPercorso()))
                .add("data", new SimpleDateFormat("yyyy-mm-dd").format(utentePercorso.getData()))
                .add("punteggio", Integer.toString(utentePercorso.getPunteggio()))
                .add("badge", utentePercorso.getBadge().toString())
                .build();
        this.send("db_utente_percorso_addRow.php", formBody);
    }
}
