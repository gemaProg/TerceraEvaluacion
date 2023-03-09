package org.example;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String nombre = faker.gameOfThrones().character();
        System.out.println(nombre);
        String animal = faker.animal().name();
        System.out.println(animal);
        String fecha = faker.date().birthday(10,15).toString();
        System.out.println(fecha);
    }
}