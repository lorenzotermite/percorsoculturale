package com.example.sms1.db.tables;

import java.sql.Date;

public class Attrazione {

    private int id;
    private String nome;
    private String descrizione;
    private String immagine;
    private Attivita attivita;

    public Attrazione(int id, String nome, String descrizione, String immagine, Attivita attivita) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.attivita = attivita;
    }

    public Attrazione(String nome, String descrizione, String immagine, Attivita attivita) {
        this.id = 0;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.attivita = attivita;
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

    public String getImmagine() {
        return immagine;
    }

    public Attivita getAttivita() {
        return attivita;
    }
}