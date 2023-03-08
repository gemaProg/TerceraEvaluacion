package org.example.dao;

import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Elementos {
    private final ArrayList<Elemento> elementos;

    public Elementos() {
        this.elementos = new ArrayList<>();
        //String nombre, String provincia, double precio, ArrayList<Integer> valoraciones,boolean piscina
        elementos.add(new Elemento(1, 1,"El mejor verano de mi vida", Categoria.comedia));
        elementos.add(new Elemento(2,1, "Misión Imposible IV fallout", Categoria.accion));
        //librería generadora de elementos mediante categoria maven
        /*Faker faker = new Faker();
        String nombre = faker.gameOfThrones().character();*/



    }

    public Elementos (ArrayList<Elemento> elementos){
        this.elementos = elementos;
    }

    public List<Elemento> getListaelementos() {
        return elementos;
    }


    public void setListaelementos(List<Elemento> elementos) {
        this.elementos.clear();
        this.elementos.addAll(elementos);
    }
}

