package edu.kevin.reto2.Figura.ui;

import edu.kevin.reto2.Figura.process.piramide;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int altura = scanner.nextInt();

        piramide.Imprimirpiramide(altura);

        }
    }
