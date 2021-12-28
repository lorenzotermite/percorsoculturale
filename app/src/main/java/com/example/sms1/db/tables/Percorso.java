package com.example.sms1.db.tables;

import android.media.Image;

public class Percorso {

    private int id;
    private String nome;
    private String descrizione;
    private Image immagine;

    public Percorso(int id, String nome, String descrizione, Image immagine) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
    }

    public Percorso(int id, String nome, String descrizione) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = null;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Image getImmagine() {
        return immagine;
    }
}
