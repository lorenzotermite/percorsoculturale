package com.example.sms1.db.tables;

import java.io.File;
import java.util.HashSet;

public class Percorso {

    private int id;
    private String nome;
    private String descrizione;
    private File immagine;
    private HashSet<Attrazione> attrazioni;

    public Percorso(int id, String nome, String descrizione, File immagine, HashSet<Attrazione> attrazioni) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.attrazioni = attrazioni;
    }

    public Percorso(int id, String nome, String descrizione, HashSet<Attrazione> attrazioni) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = null;
        this.attrazioni = attrazioni;
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

    public File getImmagine() {
        return immagine;
    }

    public HashSet<Attrazione> getAttrazioni() {
        return attrazioni;
    }
}
