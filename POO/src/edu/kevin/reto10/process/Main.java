package edu.kevin.reto10.process;

public class Main {
    public static void main(String[] args) {
        /** @Author Kevin
         *  Este codigo tiene como objetivo realizar operaciones aritmeticas
         *  como suma, resta, multiplicacion, division, etc; pero su
         *  principal caracteristica es que hace uso del "Polimorfismo"
         */

        //Instancias creadas de las clases de operaciones
        OperacionesAritmeticas suma = new Suma();
        OperacionesAritmeticas resta = new Resta();
        OperacionesAritmeticas multiplicacion = new Multiplicacion();
        OperacionesAritmeticas division = new Division();
        OperacionesAritmeticas modulo = new Modulo();
        OperacionesAritmeticas potencia = new Potencia();
        OperacionesAritmeticas raiz = new Raiz();

        double num1 = 10;
        double num2 = 5;

        //Operaciones utilizando polimorfismo
        System.out.println("Suma: " + suma.operar(num1, num2));
        System.out.println("Resta: " + resta.operar(num1, num2));
        System.out.println("Multiplicacion: " + multiplicacion.operar(num1, num2));
        System.out.println("Division: " + division.operar(num1, num2));
        System.out.println("Modulo: " + modulo.operar(num1, num2));

        double base = 2;
        double exponente = 3;
        System.out.println("Potencia: " + potencia.operar(base, exponente));

        double radicando = 9;
        double indiceRaiz = 2;
        System.out.println("Raiz: " + raiz.operar(radicando, indiceRaiz));
        System.out.println("Que tenga buen dia :)");
    }
}
