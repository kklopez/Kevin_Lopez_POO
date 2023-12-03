package edu.kevin.retofinal.process;

/**
 * Clase que representa a un jugador en el juego.
 */
public class Jugador {
    String nombre;
    char simbolo;

    /**
     * Constructor de la clase Jugador.
     *
     * @param nombre  Nombre del jugador.
     * @param simbolo Símbolo que representa al jugador en el juego.
     */
    public Jugador(String nombre, char simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene el simbolo que representa al jugador en el juego.
     *
     * @return El simbolo del jugador.
     */
    public char obtenerSimbolo() {
        return simbolo;
    }
}