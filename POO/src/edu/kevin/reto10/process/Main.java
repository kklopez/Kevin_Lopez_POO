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

        //Operaciones utilizando polimorfismo
        System.out.println("Suma: " + ejecutarOperacion(suma, 5, 3));
        System.out.println("Resta: " + ejecutarOperacion(resta, 5, 3));
        System.out.println("Multiplicacion: " + ejecutarOperacion(multiplicacion, 5, 3));
        System.out.println("Division: " + ejecutarOperacion(division, 5, 3));
        System.out.println("Modulo: " + ejecutarOperacion(modulo, 5, 3));
        System.out.println("Potencia: " + ejecutarOperacion(potencia, 2, 3));
        System.out.println("Raiz: " + ejecutarOperacion(raiz,16, 0));
        System.out.println("Que tenga buen dia :)");
    }

    //Metodo para ejecutar la operacion aritmetica
    private static double ejecutarOperacion(OperacionesAritmeticas operaciones, double a, double b) {
        return operaciones.calcular(a, b);
    }
}
