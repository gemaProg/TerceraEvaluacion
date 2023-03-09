package org.example;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GestionFicheros {
    public static void writeFileFromConsole() {
        Scanner lector = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(new FileWriter("Fichero"))) //Si no existe, PW no lo crea, de ahí el FW, y por si queréis hacer append
        {
            for (int i = 0; i < 2; i++) {
                System.out.println("Introduce ciudad");
                String ciudad = lector.nextLine();
                pw.println(ciudad);
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            PrintWriter pw2 = new PrintWriter("Fichero");
            for (int i = 0; i < 2; i++) {
                System.out.println("Introduce ciudad");
                String ciudad = lector.nextLine();
                pw2.println(ciudad);
            }
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            //  throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void copy(String arg, String arg1) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(arg));
            PrintWriter pw = new PrintWriter(new FileWriter(arg1));
            while (scanner.hasNextLine()){
                pw.println(scanner.nextLine());
            }
            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        read (arg1);
    }
    public static void read(String file){
        Scanner scanner = null;
        ArrayList<String> auxiliar = new ArrayList();
        try {
            scanner = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()){
            String ciudad = scanner.nextLine();
            System.out.println(ciudad);
            auxiliar.add(ciudad);
        }
        Collections.sort(auxiliar);
        System.out.println(auxiliar);
    }
}
