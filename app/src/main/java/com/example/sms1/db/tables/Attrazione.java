package com.example.sms1.db.tables;

import android.media.Image;

import java.sql.Date;

public class Attrazione {

    private int id;
    private String nome;
    private String descrizione;
    private Image immagine;
    private int idAttivita;
    private Attivita attivita;

    public Attrazione(int id, String nome, String descrizione, Image immagine, Attivita attivita) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.attivita = attivita;
    }

    public Attrazione(int id, String nome, String descrizione, Image immagine, int idAttivita) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.idAttivita = idAttivita;
        this.attivita = null;
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

    public Attivita getAttivita() {
        return attivita;
    }

    public void setAttivita(Attivita attivita) { this.attivita = attivita; }
}