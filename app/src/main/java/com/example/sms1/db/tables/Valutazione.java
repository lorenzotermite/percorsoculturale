package com.example.sms1.db.tables;

public class Valutazione {

    private int id;
    private int idPercorso;
    private Percorso percorso;
    private int valutazione;
    private String commento;
    private int Utente;

    public Valutazione(int id, int idPercorso, int valutazione, String commento, int utente) {
        this.id = id;
        this.idPercorso = idPercorso;
        this.valutazione = valutazione;
        this.commento = commento;
        Utente = utente;
    }

    public Valutazione(int id, Percorso percorso, int valutazione, String commento, int utente) {
        this.id = id;
        this.percorso = percorso;
        this.valutazione = valutazione;
        this.commento = commento;
        Utente = utente;
    }

    public int getId() {
        return id;
    }

    public int getIdPercorso() {
        return idPercorso;
    }

    public Percorso getPercorso() {
        return percorso;
    }

    public int getValutazione() {
        return valutazione;
    }

    public String getCommento() {
        return commento;
    }

    public int getUtente() {
        return Utente;
    }

    public void setPercorso(Percorso percorso) {
        this.percorso = percorso;
    }
}
