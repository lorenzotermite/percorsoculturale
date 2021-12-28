package com.example.sms1.db.tables;

import java.sql.Date;

public class Utente_Percorso {

    private int idUtente;
    private Utente utente;
    private int idPercorso;
    private Percorso percorso;
    private Date data;
    private int punteggio;
    private Badge badge;

    public Utente_Percorso(int idUtente, int idPercorso, Date data, int punteggio, String badge) {
        this.idUtente = idUtente;
        this.idPercorso = idPercorso;
        this.data = data;
        this.punteggio = punteggio;
        this.badge = Badge.valueOf(badge);
    }

    public Utente_Percorso(int idUtente, Percorso percorso, Date data, int punteggio, String badge) {
        this.idUtente = idUtente;
        this.percorso = percorso;
        this.data = data;
        this.punteggio = punteggio;
        this.badge = Badge.valueOf(badge);
    }

    public Utente_Percorso(Utente utente, int idPercorso, Date data, int punteggio, String badge) {
        this.utente = utente;
        this.idPercorso = idPercorso;
        this.data = data;
        this.punteggio = punteggio;
        this.badge = Badge.valueOf(badge);
    }

    public Utente_Percorso(Utente utente, Percorso percorso, Date data, int punteggio, String badge) {
        this.utente = utente;
        this.percorso = percorso;
        this.data = data;
        this.punteggio = punteggio;
        this.badge = Badge.valueOf(badge);
    }

    public int getIdUtente() {
        return idUtente;
    }

    public Utente getUtente() {
        return utente;
    }

    public int getIdPercorso() {
        return idPercorso;
    }

    public Percorso getPercorso() {
        return percorso;
    }

    public Date getData() {
        return data;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPercorso(Percorso percorso) {
        this.percorso = percorso;
    }
}
