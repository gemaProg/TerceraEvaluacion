package org.example.service;

import org.example.common.CategoriaException;
import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public class GestionElementos implements IGestionElementos{


    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public List<Elemento> getListaElementos() {
        return null;
    }

    @Override
    public boolean addElemento(Elemento Elemento) throws CategoriaException {
        return false;
    }

    @Override
    public List<Elemento> consulta(Categoria categoria) {
        return null;
    }

    @Override
    public List<Elemento> consulta(int nivel) {
        return null;
    }

    @Override
    public void removeElemento(Elemento Elemento) {

    }

    @Override
    public List<Elemento> ElementosPorNivel(int nivel) {
        return null;
    }

    @Override
    public boolean actualizarCategoria(int id, Categoria categoria) throws CategoriaException {
        return false;
    }

    @Override
    public List<Elemento> consultaHoteles(boolean ascendente) {
        return null;
    }

    @Override
    public List<Elemento> getListaElementosCategoria(String categoria) {
        return null;
    }

    @Override
    public void crearFicheros() throws IOException {

    }

    @Override
    public boolean cargarFichero() throws IOException {
        return false;
    }

    @Override
    public boolean escribirFichero() {
        return false;
    }

    @Override
    public boolean escribirFicheroBinario() {
        return false;
    }

    @Override
    public boolean cargarFicheroBinario() {
        return false;
    }
}
