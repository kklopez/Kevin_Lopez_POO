package edu.kevin.retofinal.process;

import java.util.Random;

/**
 * Clase que representa a la computadora como jugador en el juego Tres en Linea.
 * Extiende la clase Jugador.
 */
public class Computadora  extends Jugador {
    private Jugador jugadorHumano;

    /**
     * Constructor de la clase Computadora.
     * Inicializa la computadora con el nombre "Computadora" y el simbolo 'O'.
     */
    public Computadora() {
        super("Computadora", 'O');
    }

    /**
     * Establece el jugador humano para adaptar la estrategia de la computadora.
     *
     * @param jugador Jugador humano contra el cual la computadora jugara.
     */
    public void establecerJugadorHumano(Jugador jugador) {
        // Establece el jugador humano para adaptar la estrategia de la computadora
        this.jugadorHumano = jugador;
    }

    /**
     * Realiza un movimiento de la computadora en el tablero.
     *
     * @param tablero Tablero en el cual se realizara el movimiento.
     */
    public void realizarMovimiento(Tablero tablero) {
        // Realiza un movimiento de la computadora en el tablero
        for (int i = 0; i < tablero.obtenerTamaño(); i++) {
            for (int j = 0; j < tablero.obtenerTamaño(); j++) {
                if (tablero.realizarMovimiento(i, j, obtenerSimbolo())) {
                    if (tablero.hayGanador(obtenerSimbolo())) {
                        return;
                    }
                    tablero.deshacerMovimiento(i, j);
                }
            }
        }

        for (int i = 0; i < tablero.obtenerTamaño(); i++) {
            for (int j = 0; j < tablero.obtenerTamaño(); j++) {
                if (tablero.realizarMovimiento(i, j, jugadorHumano.obtenerSimbolo())) {
                    if (tablero.hayGanador(jugadorHumano.obtenerSimbolo())) {
                        tablero.deshacerMovimiento(i, j);
                        tablero.realizarMovimiento(i, j, obtenerSimbolo());
                        return;
                    }
                    tablero.deshacerMovimiento(i, j);
                }
            }
        }

        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(tablero.obtenerTamaño());
            columna = random.nextInt(tablero.obtenerTamaño());
        } while (!tablero.realizarMovimiento(fila, columna, obtenerSimbolo()));
    }
}