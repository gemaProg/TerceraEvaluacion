package org.example;

public class Main {
    public static void main(String[] args) {
        GestionFicheros.writeFileFromConsole();
        GestionFicheros.copy(args[0],args[1]);
    }
}