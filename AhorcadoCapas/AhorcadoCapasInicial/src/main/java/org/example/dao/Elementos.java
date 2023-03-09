package org.example.dao;

import com.github.javafaker.Faker;
import org.example.domain.Categoria;
import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Elementos {
    private final ArrayList<Elemento> elementos;
    private static int autonumerico;
    public Elementos() {
        this.elementos = new ArrayList<>();

        elementos.add(new Elemento(autonumerico++, 1,"El mejor verano de mi vida", Categoria.comedia));
        elementos.add(new Elemento(autonumerico++,1, "Misión Imposible IV fallout", Categoria.accion));
        //librería generadora de elementos mediante categoria maven
        Faker faker = new Faker();
        String nombre = faker.gameOfThrones().character();
        for (int i = 0; i <10 ; i++) {
            elementos.add(new Elemento(autonumerico++,2,faker.pokemon().name(),Categoria.pokemon));
        }


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

