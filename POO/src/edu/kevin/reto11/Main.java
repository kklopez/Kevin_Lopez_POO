package edu.kevin.reto11;

import edu.kevin.reto11.iu.Español;
import edu.kevin.reto11.iu.Idioma;
import edu.kevin.reto11.iu.Ingles;
import edu.kevin.reto11.iu.Portugues;
import edu.kevin.reto11.process.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** @Author Kevin
         * Este programa es una calculadora de operaciones aritmeticas
         * como Suma, Resta, Multiplicacion, Division, etc; su principal
         * caracteristica es que hace uso del polimorfismo.
         * A comparacion del codigo anterior, en este se implementa un
         * menu donde el usuario podra elegir el idioma del programa
         * entre Español, Ingles y Portugues.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el idioma / Select the language / Selecione o idioma:");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Portugues");

        int opcionIdioma = scanner.nextInt();

        Idioma idioma;
        switch (opcionIdioma) {
            case 1:
                idioma = new Español();
                break;
            case 2:
                idioma = new Ingles();
                break;
            case 3:
                idioma = new Portugues();
                break;
            default:
                System.out.println("Opcion no valida / Invalid option / Opcao invalida");
                return;
        }
        //Aqui se realizan las operaciones
        OperacionesAritmeticas suma = new Suma();
        OperacionesAritmeticas resta = new Resta();
        OperacionesAritmeticas multiplicacion = new Multiplicacion();
        OperacionesAritmeticas division = new Division();
        OperacionesAritmeticas modulo = new Modulo();
        OperacionesAritmeticas potencia = new Potencia();
        OperacionesAritmeticas raiz = new Raiz();

        double num1 = 10;
        double num2 = 5;

        System.out.println(idioma.suma() + ": " + suma.operar(num1, num2));
        System.out.println(idioma.resta() + ": " + resta.operar(num1,num2));
        System.out.println(idioma.multiplicacion() + ": " + multiplicacion.operar(num1, num2));
        System.out.println(idioma.division() + ": " + division.operar(num1, num2));
        System.out.println(idioma.modulo() + ": " + modulo.operar(num1, num2));

        double base = 2;
        double exponente = 3;
        System.out.println(idioma.potencia() + ": " + potencia.operar(base, exponente));

        double radicando = 9;
        double indiceRaiz = 2;
        System.out.println(idioma.raiz() + ": " + raiz.operar(radicando, indiceRaiz));

        scanner.close();
    }
}