package edu.kevin.reto6.ui;

import edu.kevin.reto6.process.Ortografia;

import java.util.Scanner;
public class CLI {
    /**@Author Kevin Lopez
    A comparacion del programa anteriror ahora en el CLI
    podemos observar las excepciones al momento de introducir
    numeros en vez de palabras y se añade otra excepcion cuando
    el usuario introduce otro numero diferente al del menu.*/
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean jugar = true;

        //Menu donde el usuario introduce el nivel que
        //desea jugar.
        while (jugar) {
            try {
                System.out.println("Elige un nivel para jugar:");
                System.out.println("1. Facil");
                System.out.println("2. Intermedio");
                System.out.println("3. Avanzado");
                System.out.println("0. Salir del juego");

                int nivel = scanner.nextInt();
                if (nivel == 0) {
                    jugar = false;
                    continue;
                } else if (nivel < 1 || nivel > 3) {
                    System.out.println("Error: Ingresa un número válido de nivel (1, 2, 3) o 0 para salir.");
                    continue;
                }

                String palabraBase = Ortografia.obtenerPalabraBase(nivel);
                String palabraAdivinada = "X".repeat(palabraBase.length());
                int intentos = 0;

                System.out.println("¡Comencemos a jugar! La palabra a adivinar tiene " + palabraBase.length() + " letras.");
                while (!palabraAdivinada.equals(palabraBase)) {
                    System.out.println("Palabra actual: " + palabraAdivinada);
                    System.out.println("Introduce una letra: ");

                    // Manejo de excepciones para asegurar que se ingrese solo una letra.
                    try {
                        char letra = scanner.next().charAt(0);

                        if (!Character.isLetter(letra)) {
                            System.out.println("Error: Ingresa solo letras.");
                            continue;
                        }

                        // Mensaje que salta a la pantalla cuando el usuario
                        // se equivoca de letra.
                        if (palabraBase.contains(String.valueOf(letra))) {
                            palabraAdivinada = Ortografia.reemplazarLetra(palabraBase, palabraAdivinada, letra);
                        } else {
                            System.out.println("Intenta de nuevo !!");
                            intentos++;
                        }

                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Error: Ingresa una letra válida.");
                        scanner.nextLine(); // Limpiar el buffer del scanner
                    }
                }

                System.out.println("¡Felicidades! Has adivinado la palabra en " + intentos + " intentos.");

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        // Mensaje que salta a la pantalla antes de cerrar el programa
        // si el usuario selecciona "0", automáticamente salta el
        // mensaje.
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();
        }
    }