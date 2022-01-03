package com.example.sms1.db.tables;

import java.util.HashSet;

public class Attivita {

    private int id;
    private int punteggio;
    private Puzzle puzzle;
    private HashSet<Quiz> quizs;

    public Attivita(int id, int punteggio, Puzzle puzzle) {
        this.id = id;
        this.punteggio = punteggio;
        this.puzzle = puzzle;
        this.quizs = null;
    }

    public Attivita(int id, int punteggio, HashSet<Quiz> quizs) {
        this.id = id;
        this.punteggio = punteggio;
        this.quizs = quizs;
        this.puzzle = null;
    }

    public int getId() {
        return id;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public Puzzle getPuzzle() { return puzzle; }

    public HashSet<Quiz> getQuizs() { return quizs; }

}