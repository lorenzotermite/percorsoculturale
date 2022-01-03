package com.example.sms1.db.dao;

import com.example.sms1.db.DBManager;
import com.example.sms1.db.tables.Quiz;

import java.io.IOException;
import java.text.SimpleDateFormat;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class QuizDAO extends DBManager{

    public QuizDAO(){

    }

    //TODO testare metodo perché potrebbe essere necessario renderlo asincrono
    public void insert(Quiz quiz){
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("domanda", quiz.getDomanda())
                .add("risposta_corretta", quiz.getRisposta_corretta())
                .add("risposta_errata1", quiz.getRisposta_errata1())
                .add("risposta_errata2", quiz.getRisposta_errata2())
                .add("risposta_errata3", quiz.getRisposta_errata3())
                .add("tempo", Integer.toString(quiz.getTempo()))
                .build();
        this.send("db_quiz_addRow.php", formBody);

    }
}