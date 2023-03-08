package org.example.service;

import org.example.common.CategoriaException;
import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public interface IGestionElementos {
    public boolean isEmptyElementosList();
    public List<Elemento> getListaElementos();
    public boolean addElemento(Elemento Elemento)throws CategoriaException;
    public List<Elemento> consulta(Categoria categoria);
    public List<Elemento> consulta(int nivel);
    public void removeElemento(Elemento Elemento);
    public List<Elemento> ElementosPorNivel(int nivel);
    public boolean actualizarCategoria(int id, Categoria categoria) throws CategoriaException;
    public List<Elemento> consultaHoteles(boolean ascendente);
    public List<Elemento> getListaElementosCategoria(String categoria);
    public void crearFicheros()throws IOException;
    public boolean cargarFichero() throws IOException;
    public boolean escribirFichero();
    public boolean escribirFicheroBinario();
    public boolean cargarFicheroBinario();

}
