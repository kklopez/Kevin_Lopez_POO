package edu.kevin.retofinal.process;

/**
 * Clase para representar el tablero del juego Tres en Linea.
 */
public class Tablero {
    // Clase para representar el tablero del juego
    private char[][] tablero;
    private final int tamaño = 3;

    /**
     * Constructor de la clase Tablero.
     * Inicializa el tablero en blanco.
     */
    public Tablero() {
        //Inicializar el tablero en blanco.
        tablero = new char[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    /**
     * Obtiene el tamanio del tablero.
     *
     * @return El tamanio del tablero.
     */
    public int obtenerTamaño() {
        return tamaño;
    }

    /**
     * Muestra el estado actual del tablero en la consola.
     */
    public void mostrarTablero() {
        // Muestra el estado actual del tablero
        System.out.println("    0   1   2");
        System.out.println("  -------------");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < tamaño; j++) {
                System.out.print(" " + tablero[i][j] + " |");
            }
            System.out.println("\n  -------------");
        }
    }

    /**
     * Realiza un movimiento en el tablero.
     *
     * @param fila     La fila donde se realizara el movimiento.
     * @param columna  La columna donde se realizara el movimiento.
     * @param jugador  El simbolo del jugador que realiza el movimiento.
     * @return true si el movimiento es valido y se realiza con exito, false de lo contrario.
     */
    public boolean realizarMovimiento(int fila, int columna, char jugador) {
        // Realiza un movimiento en el tablero
        if (fila < 0 || fila >= tamaño || columna < 0 || columna >= tamaño || tablero[fila][columna] != ' ') {
            return false;
        }
        tablero[fila][columna] = jugador;
        return true;
    }

    /**
     * Deshace el ultimo movimiento realizado en el tablero.
     *
     * @param fila     La fila donde se deshara el movimiento.
     * @param columna  La columna donde se deshara el movimiento.
     */
    public void deshacerMovimiento(int fila, int columna) {
        tablero[fila][columna] = ' ';
    }

    /**
     * Verifica si hay un ganador en el tablero para un jugador especifico.
     *
     * @param jugador El simbolo del jugador a verificar.
     * @return true si hay un ganador, false de lo contrario.
     */
    public boolean hayGanador(char jugador) {
        // Verificar si hay un ganador en el tablero
        for (int i = 0; i < tamaño; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                    (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }
        return false;
    }

    /**
     * Verifica si el tablero esta lleno, lo que resulta en un empate.
     *
     * @return true si el tablero esta lleno, false de lo contrario.
     */
    public boolean tableroLleno() {
        // Verifica si el tablero esta lleno (Empate)
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}