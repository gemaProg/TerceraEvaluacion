package org.example.dao;

import org.example.domain.Categoria;
import org.example.domain.Elemento;

public interface DaoElementosArray {
    public boolean addElemento(Elemento elemento) ;
    public Elemento[] consultaCategoria(Categoria categoria);
    public Elemento[] consultaNivel(int nivel);
    public Elemento[] consultaNivelDificultad(int nivel, Categoria categoria);
    public boolean actualizarElemento(int id) ;
    public Elemento[] consultaElementos(boolean ascendente);
    public Elemento[] getListaElemento(String categoria) ;
    public void removeElemento(Elemento elemento) ;
    public boolean isEmptyElementosList() ;

}
