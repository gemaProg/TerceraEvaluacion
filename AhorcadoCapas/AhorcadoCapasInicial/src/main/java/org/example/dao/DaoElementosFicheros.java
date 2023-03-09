package org.example.dao;
import org.example.domain.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaoElementosFicheros {
    public static final String FICHERO = "Fichero";
    public static final String FICHEROB = "FicheroBinario";
    public static void crearFicheros() throws IOException {
        File fichero1 = new File(FICHERO);
        File fichero2 = new File(FICHEROB);
        if (!fichero1.exists())
                fichero1.createNewFile();
        if (!fichero2.exists())
            fichero2.createNewFile();
    }
    public static List<Elemento> leerFichero() throws IOException {
        return leerFichero(DaoElementosFicheros.FICHERO);
    }
    public static List<Elemento> leerFichero(String fichero) throws IOException {
        crearFicheros();
        ArrayList<Elemento> auxiliar = null;
        try (Scanner sc = new Scanner(new File(fichero))) {
            auxiliar = new ArrayList<>();
            while (sc.hasNextLine()) {
                String cadena = sc.nextLine();
                String[] trozos = cadena.split(";");
                //crear elemento y añadirlo a auxiliar.

            };
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaoElementosFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);

        }

        return auxiliar;

    }

    /**
     * Ejemplo de lectura de fichero binario. Pensad cómo utilizarlo para guardar y recuperar partida, guardando el objeto juego
     * en vez del ArrayList
     * @return
     */
    public static List<Elemento> leerFicheroBinario() {
        List<Elemento> auxiliar = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FICHEROB))) {
            auxiliar = (List<Elemento>) is.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaoElementosFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);

        }
        return auxiliar;
    }


    public static boolean escribirFicheroBinario(List<Elemento> Elementos) {
        boolean escrito = false;
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FICHEROB))) {
            os.writeObject(Elementos);
            escrito = true;
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(DaoElementosFicheros.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        }
        return escrito;
    }
  }
