package org.example.domain;

public class Elemento {
    private int id;
    private int level;
    private String incognita;
    private Categoria categoria;

    public Elemento(int id, int level, String incognita, Categoria categoria) {
        this.id = id;
        this.level = level;
        this.incognita = incognita;
        this.categoria = categoria;
    }
}
