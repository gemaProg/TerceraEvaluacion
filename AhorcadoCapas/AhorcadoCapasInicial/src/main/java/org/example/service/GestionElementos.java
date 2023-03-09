package org.example.service;

import org.example.common.CategoriaException;
import org.example.common.Comprobacion;
import org.example.dao.DaoElementos;
import org.example.dao.DaoElementosFicheros;
import org.example.dao.DaoElementosImplementacion;
import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public class GestionElementos implements IGestionElementos{

    private final DaoElementos daoElementos;


    public GestionElementos() {
        this.daoElementos = new DaoElementosImplementacion();
    }
    public GestionElementos(DaoElementos daoElementos) {
        this.daoElementos = daoElementos;
    }

    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public List<Elemento> getListaElementos() {
        return null;
    }

    @Override
    public boolean addElemento(Elemento elemento) throws CategoriaException {
        Comprobacion.categoriaOk(elemento.getCategoria());
        return daoElementos.addElemento(elemento);
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
    public List<Elemento> elementosPorNivel(int nivel) {
        return null;
    }

    @Override
    public boolean actualizarCategoria(int id, Categoria categoria) throws CategoriaException {
        return false;
    }

    @Override
    public List<Elemento> consultaElementos(boolean ascendente) {
        return null;
    }

    @Override
    public List<Elemento> getListaElementosCategoria(String categoria) {
        return null;
    }

    @Override
    public void crearFicheros() throws IOException {
        DaoElementosFicheros.crearFicheros();
    }

    @Override
    public boolean cargarFichero() throws IOException {
        //ver si existe el fichero y si su tamaño refleja que tenga datos y cargar su contenido en RAM
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
