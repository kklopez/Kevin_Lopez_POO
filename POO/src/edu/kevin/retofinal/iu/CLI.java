package edu.kevin.retofinal.iu;

import edu.kevin.retofinal.process.JuegoTresEnLinea;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase CLI (Interfaz de Linea de Comandos) que muestra el menu y gestiona la interaccion con el usuario.
 */
public class CLI {

    /**
     * Muestra el menu principal y gestiona la interaccion con el usuario.
     */
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        Idioma idioma = null;

        while (idioma == null) {
            try {
                System.out.println("Seleccione su idioma / Select your language:\n***Escribe 1 para español, escribe 2 para ingles / Write 1 for spanish, write 2 for english***\n1. Español\n2. Inglés");
                int opcionIdioma = scanner.nextInt();

                if (opcionIdioma == 1) {
                    idioma = new Español();
                } else if (opcionIdioma == 2) {
                    idioma = new Ingles();
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida. Por favor, seleccione una opcion valida. / Invalid option. Please select a valid option.");
            } finally {
                scanner.nextLine();
            }
        }

        System.out.println(idioma.obtenerBienvenida());

        JuegoTresEnLinea juego = new JuegoTresEnLinea(idioma);

        while (true) {
            try {
                System.out.println(idioma.obtenerMenu());
                int opcion = scanner.nextInt();

                if (opcion < 1 || opcion > 4) {
                    throw new InputMismatchException();
                }

                if (opcion == 1) {
                    juego.jugarContraAmigo();
                } else if (opcion == 2) {
                    juego.jugarContraComputadora();
                } else if (opcion == 3) {
                    juego.obtenerScoreboard().mostrarScoreboard();
                } else {
                    System.out.println(idioma.obtenerGraciasPorJugar());
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println(idioma.obtenerOpcionInvalida());
            } finally {
                scanner.nextLine();
            }
        }
    }
}