package com.example.sms1.db.tables;

public class Puzzle {


    private int id;
    private String directory;
    private Attivita attivita;


    public Puzzle(int id, String directory, Attivita attivita) {
        this.id = id;
        this.directory = directory;
        this.attivita = attivita;
    }

    public Puzzle(String directory, Attivita attivita) {
        this.id = 0;
        this.directory = directory;
        this.attivita = attivita;
    }

    public int getId() {
        return id;
    }

    public String getDirectory() {
        return directory;
    }

    public Attivita getAttivita() {
        return attivita;
    }
}
