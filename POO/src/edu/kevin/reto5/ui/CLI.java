package edu.kevin.reto5.ui;

import edu.kevin.reto5.process.Ortografia;

import java.util.Scanner;
public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean jugar = true;

        //Menu donde el usuario introduce el nivel que
        //desea jugar.
        while (jugar) {
            System.out.println("Elige un nivel para jugar:");
            System.out.println("1. Facil");
            System.out.println("2. Intermedio");
            System.out.println("3. Avanzado");
            System.out.println("0. Salir del juego");

            int nivel = scanner.nextInt();
            if (nivel == 0) {
                jugar = false;
                continue;
            }

            String palabraBase = Ortografia.obtenerPalabraBase(nivel);
            String palabraAdivinada = "X".repeat(palabraBase.length());
            int intentos = 0;

            System.out.println("¡Comencemos a jugar! La palabra a adivinar tiene " + palabraBase.length() + " letras.");
            while (!palabraAdivinada.equals(palabraBase)) {
                System.out.println("Palabra actual: " + palabraAdivinada);
                System.out.println("Introduce una letra: ");
                char letra = scanner.next().charAt(0);

                //Mensaje que salta a la pantalla cuando el usuario
                //se equivoca de letra.
                if (palabraBase.contains(String.valueOf(letra))) {
                    palabraAdivinada = Ortografia.reemplazarLetra(palabraBase, palabraAdivinada, letra);
                } else {
                    System.out.println("Intenta de nuevo !!");
                    intentos++;
                }
            }
            System.out.println("¡Felicidades! Has adivinado la palabra en " + intentos + " intentos.");
        }
        //Mensaje que salta a la pantalla antes de cerrar el programa
        //si el usuario selecciona "0", automaticamente salta el
        //mensaje.
        System.out.println("Gracias por jugar. ¡Hasta la proxima!");
        scanner.close();
    }
}
