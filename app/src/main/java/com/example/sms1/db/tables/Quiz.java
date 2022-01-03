package com.example.sms1.db.tables;

public class Quiz {

    private int id;
    private String domanda;
    private String risposta_corretta;
    private String risposta_errata1;
    private String risposta_errata2;
    private String risposta_errata3;
    private int tempo;
    private int idAttivita;
    private Attivita attivita;


    public Quiz(int id, String domanda, String risposta_corretta, String risposta_errata1, String risposta_errata2, String risposta_errata3, int tempo, Attivita attivita) {
        this.id = id;
        this.domanda = domanda;
        this.risposta_corretta = risposta_corretta;
        this.risposta_errata1 = risposta_errata1;
        this.risposta_errata2 = risposta_errata2;
        this.risposta_errata3 = risposta_errata3;
        this.tempo = tempo;
        this.attivita = attivita;
    }

    public Quiz(int id, String domanda, String risposta_corretta, String risposta_errata1, String risposta_errata2, String risposta_errata3, int tempo, int idAttivita) {
        this.id = id;
        this.domanda = domanda;
        this.risposta_corretta = risposta_corretta;
        this.risposta_errata1 = risposta_errata1;
        this.risposta_errata2 = risposta_errata2;
        this.risposta_errata3 = risposta_errata3;
        this.tempo = tempo;
        this.idAttivita = idAttivita;
        this.attivita = null;
    }


    public int getId() {
        return id;
    }

    public String getDomanda() {
        return domanda;
    }

    public String getRisposta_corretta() {
        return risposta_corretta;
    }

    public String getRisposta_errata1() {
        return risposta_errata1;
    }

    public String getRisposta_errata2() {
        return risposta_errata3;
    }

    public String getRisposta_errata3() {
        return risposta_errata3;
    }

    public int getTempo() {
        return tempo;
    }

    public Attivita getAttivita() {
        return attivita;
    }

    public void setAttivita(Attivita attivita) { this.attivita = attivita; }
}
