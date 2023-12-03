package edu.kevin.retofinal.process;

import edu.kevin.retofinal.iu.Idioma;
import edu.kevin.retofinal.iu.Ingles;

import java.util.Scanner;

/**
 * Clase principal que representa el juego Tres en Linea
 */
public class JuegoTresEnLinea {
    private Tablero tablero;
    private Jugador jugador1, jugador2, jugadorActual;
    private Computadora computadora;
    private Scoreboard scoreboard;
    private Idioma idioma;

    /**
     * Constructor que inicializa el juego con un idioma especifico.
     *
     * @param idioma Objeto Idioma que determina el idioma del juego.
     */
    public JuegoTresEnLinea(Idioma idioma) {
        this.tablero = new Tablero();
        this.jugador1 = null;
        this.jugador2 = null;
        this.jugadorActual = null;
        this.computadora = new Computadora();
        this.scoreboard = new Scoreboard(idioma);
        this.idioma = idioma;
    }

    /**
     * Metodo para jugar contra un amigo.
     * <p>
     * Este metodo inicia el juego entre dos jugadores humanos.
     * </p>
     */
    public void jugarContraAmigo() {
        // Logica para el juego contra un amigo
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        // Preguntar el nombre del Jugador 1
        if (jugador1 == null) {
            System.out.print(idioma.obtenerNombreJugador() + " 1: ");
            String nombreJugador1 = scanner.nextLine();
            jugador1 = new Jugador(nombreJugador1, 'X');
        }

        // Preguntar el nombre del Jugador 2
        if (jugador2 == null) {
            System.out.print(idioma.obtenerNombreJugador() + " 2: ");
            String nombreJugador2 = scanner.nextLine();
            jugador2 = new Jugador(nombreJugador2, 'O');
        }

        jugadorActual = jugador1;

        while (juegoActivo) {
            tablero.mostrarTablero();

            System.out.println(idioma.obtenerSeleccionJugador() + " " + jugadorActual.obtenerNombre() + " (" + jugadorActual.obtenerSimbolo() + ")");
            System.out.print(idioma.obtenerFila());
            int fila = scanner.nextInt();
            System.out.print(idioma.obtenerColumna());
            int columna = scanner.nextInt();

            if (tablero.realizarMovimiento(fila, columna, jugadorActual.obtenerSimbolo())) {
                if (tablero.hayGanador(jugadorActual.obtenerSimbolo())) {
                    tablero.mostrarTablero();
                    System.out.println(idioma.obtenerGanador() + " " + jugadorActual.obtenerNombre() + "!");
                    scoreboard.actualizarScoreboard(jugadorActual.obtenerNombre());
                    juegoActivo = false;
                } else if (tablero.tableroLleno()) {
                    tablero.mostrarTablero();
                    System.out.println(idioma.obtenerEmpate());
                    juegoActivo = false;
                } else {
                    jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1; // Cambiar al otro jugador
                }
            } else {
                System.out.println(idioma.obtenerMovimientoInvalido());
            }
        }

        preguntarJugarOtraVez(scanner);
    }

    /**
     * Metodo para jugar contra la computadora.
     * <p>
     * Este metodo inicia el juego contra la inteligencia artificial de la computadora.
     * </p>
     */
    public void jugarContraComputadora() {
        // Logica para jugar contra la computadora
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        // Preguntar el nombre del Jugador 1 si aún no se ha ingresado
        if (jugador1 == null) {
            System.out.print(idioma.obtenerNombreJugador() + " 1: ");
            String nombreJugador1 = scanner.nextLine();
            jugador1 = new Jugador(nombreJugador1, 'X');
        }

        jugadorActual = jugador1;

        computadora.establecerJugadorHumano(jugador1);

        while (juegoActivo) {
            tablero.mostrarTablero();

            if (jugadorActual == jugador1) {
                System.out.println(idioma.obtenerSeleccionJugador() + " " + jugadorActual.obtenerNombre() + " (" + jugadorActual.obtenerSimbolo() + ")");
                System.out.print(idioma.obtenerFila());
                int fila = scanner.nextInt();
                System.out.print(idioma.obtenerColumna());
                int columna = scanner.nextInt();

                if (tablero.realizarMovimiento(fila, columna, jugadorActual.obtenerSimbolo())) {
                    if (tablero.hayGanador(jugadorActual.obtenerSimbolo())) {
                        tablero.mostrarTablero();
                        System.out.println(idioma.obtenerGanador() + " " + jugadorActual.obtenerNombre() + "!");
                        scoreboard.actualizarScoreboard(jugadorActual.obtenerNombre());
                        juegoActivo = false;
                    } else if (tablero.tableroLleno()) {
                        tablero.mostrarTablero();
                        System.out.println(idioma.obtenerEmpate());
                        juegoActivo = false;
                    } else {
                        jugadorActual = jugador2; // Cambiar al jugador 2
                    }
                } else {
                    System.out.println(idioma.obtenerMovimientoInvalido());
                }
            } else {
                System.out.println(idioma.obtenerTurnoComputadora() + " (" + computadora.obtenerSimbolo() + ")");
                computadora.realizarMovimiento(tablero);

                if (tablero.hayGanador(computadora.obtenerSimbolo())) {
                    tablero.mostrarTablero();
                    System.out.println(idioma.obtenerGanador() + " " + computadora.obtenerNombre() + "!");
                    scoreboard.actualizarScoreboard(computadora.obtenerNombre());
                    juegoActivo = false;
                } else if (tablero.tableroLleno()) {
                    tablero.mostrarTablero();
                    System.out.println(idioma.obtenerEmpate());
                    juegoActivo = false;
                } else {
                    jugadorActual = jugador1; // Cambiar al jugador 1
                }
            }
        }

        preguntarJugarOtraVez(scanner);
    }

    /**
     * Pregunta al jugador si desea jugar otra vez.
     * <p>
     * Si el jugador elige jugar otra vez, reinicia el juego; de lo contrario, muestra el marcador y termina el programa.
     * </p>
     *
     * @param scanner Scanner para leer la entrada del jugador.
     */
    private void preguntarJugarOtraVez(Scanner scanner) {
        // Pregunta al jugador si desea jugar otra vez
        System.out.print(idioma.obtenerDeseaJugarOtraVez());
        String respuesta = scanner.next().toLowerCase();

        if (idioma instanceof Ingles) {
            if (respuesta.equals("yes")) {
                reiniciarJuego();
            } else {
                scoreboard.mostrarScoreboard();
                System.out.println(idioma.obtenerGraciasPorJugar());
                System.exit(0);
            }
        } else {
            if (respuesta.equals("si") || respuesta.equals("sí")) {
                reiniciarJuego();
            } else {
                scoreboard.mostrarScoreboard();
                System.out.println(idioma.obtenerGraciasPorJugar());
                System.exit(0);
            }
        }
    }

    /**
     * Obtiene el Scoreboard actual.
     *
     * @return Scoreboard actual.
     */
public Scoreboard obtenerScoreboard() {
        // Obtiene el Scoreboard
        return scoreboard;
}

    /**
     * Reinicia el juego.
     * <p>
     * Crea un nuevo tablero y establece al jugador actual como el jugador 1.
     * </p>
     */
    private void reiniciarJuego() {
        // Reinicia el juego
        tablero = new Tablero();
        jugadorActual = jugador1;
    }
}