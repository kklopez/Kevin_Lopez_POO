package edu.kevin.reto11.process;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EscritorArchivo {
    //Clase para manejar la escritura en el archivo de texto
    private BufferedWriter writer;

    public EscritorArchivo(String resultadosFinales) {
        try {
            writer = new BufferedWriter(new FileWriter(resultadosFinales));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribir(String texto) {
        //Metodo para escribir en el archivo
        try {
            writer.write(texto);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        //Metodo para cerrar el archivo
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
