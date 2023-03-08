package org.example.dao;

import org.example.domain.Elemento;
import org.example.domain.Juego;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface GestionFicheros {
    public void crearFicheros() throws IOException ;
    public ArrayList<Elemento> leerFichero() throws IOException ;
    public ArrayList<Elemento> leerFichero(String fichero) throws IOException;
    /**
     *
     * @param elementos a guardar
     * @return devuelve true si se ha podido guardar correctamente
     */
    public boolean escribirFichero(List<Elemento> elementos) ;
    /**
     * Guardar el estado del juego o partida
     * @return devuelve true si se ha podido guardar correctamente
     */
    public boolean escribirFicheroBinario(Juego juego) ;

    /**
     * Recupera el estado del juego o partida guardado anteriormente
     * @return la instancia del Juego recuperado.
     */
    public Juego leerFicheroBinario();

}


