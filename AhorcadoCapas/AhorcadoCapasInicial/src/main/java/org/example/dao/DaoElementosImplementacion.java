package org.example.dao;

import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.util.List;

public class DaoElementosImplementacion implements DaoElementos {
    protected final Elementos lista;

    public DaoElementosImplementacion() {
        this.lista = new Elementos();
    }
    @Override
    public boolean addElemento(Elemento elemento) {
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
    public boolean actualizarElemento(int id) {
        return false;
    }

    @Override
    public List<Elemento> consultaElementos(boolean ascendente) {
        return null;
    }

    @Override
    public List<Elemento> getListaElemento(String categoria) {
        return null;
    }

    @Override
    public void removeElemento(Elemento elemento) {

    }

    @Override
    public boolean isEmptyElementosList() {
        return false;
    }
}
