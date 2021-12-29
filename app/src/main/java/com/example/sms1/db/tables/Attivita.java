package com.example.sms1.db.tables;

public class Attivita {

    private int id;
    private int punteggio;

    public Attivita(int id, int punteggio) {
        this.id = id;
        this.punteggio = punteggio;
    }

    public Attivita(int punteggio) {
        this.id = 0;
        this.punteggio = punteggio;
    }

    public int getId() {
        return id;
    }

    public int getPunteggio() {
        return punteggio;
    }
}