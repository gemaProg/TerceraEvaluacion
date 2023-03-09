package org.example.common;

import org.example.domain.Categoria;

public class Comprobacion {

    public static void categoriaOk(Categoria categoria) throws CategoriaException {
        if (categoria != Categoria.accion && categoria != Categoria.comedia
                && categoria != Categoria.miedo && categoria != Categoria.pokemon)
            throw new CategoriaException();
    }
}



