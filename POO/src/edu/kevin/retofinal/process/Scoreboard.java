package edu.kevin.retofinal.process;

import edu.kevin.retofinal.iu.Idioma;

import java.io.*;
import java.util.*;

/**
 * Clase que representa el marcador (scoreboard) del juego.
 */
public class Scoreboard {
    private Map<String, Integer> scoreboard;
    private Idioma idioma;

    /**
     * Constructor que inicializa el marcador con un idioma especifico.
     *
     * @param idioma Objeto Idioma que determina el idioma del marcador.
     */
    public Scoreboard(Idioma idioma) {
        scoreboard = cargarScoreboardDesdeArchivo();
        this.idioma = idioma;
    }

    /**
     * Carga el marcador desde un archivo.
     *
     * @return Mapa que representa el marcador cargado desde un archivo.
     */
    private Map<String, Integer> cargarScoreboardDesdeArchivo() {
        // Logica para cargar el Scoreboard desde un archivo
        Map<String, Integer> scoreboard = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("scoreboard.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String nombre = parts[0];
                int puntos = Integer.parseInt(parts[1]);
                scoreboard.put(nombre, puntos);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(idioma.obtenerErrorCargarScoreboard());
        }

        return scoreboard;
    }

    /**
     * Guarda el marcador en un archivo.
     */
    private void guardarScoreboardEnArchivo() {
        // Guarda el Scoreboard en un archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("scoreboard.txt"))) {
            for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(idioma.obtenerErrorGuardarScoreboard());
        }
    }

    /**
     * Muestra el marcador en la consola.
     */
    public void mostrarScoreboard() {
        // Muestra el Scoreboard
        System.out.println("Scoreboard:");
        int position = 1;
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(scoreboard.entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(position + ": " + entry.getKey() + " - " + entry.getValue() + "pts");
            position++;
        }
    }

    /**
     * Actualiza el marcador con el nombre del ganador.
     *
     * @param nombreGanador Nombre del ganador que se actualizara en el marcador.
     */
    public void actualizarScoreboard(String nombreGanador) {
        // Actualiza el Scoreboard con el nombre del ganador
        scoreboard.put(nombreGanador, scoreboard.getOrDefault(nombreGanador, 0) + 1);
        guardarScoreboardEnArchivo();
    }
}