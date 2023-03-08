package org.example.dao;

import org.example.domain.Elemento;
import org.example.domain.Juego;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionFicherosImplementacion implements GestionFicheros {


    @Override
    public void crearFicheros() throws IOException {

    }

    @Override
    public ArrayList<Elemento> leerFichero() throws IOException {
        return null;
    }

    @Override
    public ArrayList<Elemento> leerFichero(String fichero) throws IOException {
        return null;
    }

    @Override
    public boolean escribirFichero(List<Elemento> elementos) {
        return false;
    }

    @Override
    public boolean escribirFicheroBinario(Juego juego) {
        return false;
    }

    @Override
    public Juego leerFicheroBinario() {
        return null;
    }

}
