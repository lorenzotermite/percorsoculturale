package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Attrazione;
import java.io.File;


import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;


public class AttrazioneDAO extends DBManager {

    public AttrazioneDAO(){

    }
/*
    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    public void insert(Attrazione attrazione){
        //TODO tipo file immagine dinamico
        final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new MultipartBody.Builder()
                .addFormDataPart("nome", attrazione.getNome())
                .addFormDataPart("descrizione", attrazione.getDescrizione())
                .addFormDataPart("immagine", attrazione.getImmagine().getName(), RequestBody.create(attrazione.getImmagine(), MEDIA_TYPE_PNG))
                .build();
        this.send("db_attrazione_addRow.php", formBody);
    }*/

    public void select(){

    }
}