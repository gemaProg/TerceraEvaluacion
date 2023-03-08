package org.example.dao;

import org.example.domain.Categoria;
import org.example.domain.Elemento;

public class DaoElementosArrayImplementacion implements DaoElementosArray {
    protected final ElementosArray lista;

    public DaoElementosArrayImplementacion() {
        this.lista = new ElementosArray();
    }

    @Override
    public boolean addElemento(Elemento elemento) {
        return false;
    }

    @Override
    public Elemento[] consultaCategoria(Categoria categoria) {
        return new Elemento[0];
    }

    @Override
    public Elemento[] consultaNivel(int nivel) {
        return new Elemento[0];
    }

    @Override
    public Elemento[] consultaNivelDificultad(int nivel, Categoria categoria) {
        return new Elemento[0];
    }

    @Override
    public boolean actualizarElemento(int id) {
        return false;
    }

    @Override
    public Elemento[] consultaElementos(boolean ascendente) {
        return new Elemento[0];
    }

    @Override
    public Elemento[] getListaElemento(String categoria) {
        return new Elemento[0];
    }

    @Override
    public void removeElemento(Elemento elemento) {

    }

    @Override
    public boolean isEmptyElementosList() {
        return false;
    }
}