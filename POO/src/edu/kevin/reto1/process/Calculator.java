package edu.kevin.reto1.process;

/**
 * @author kevin
 * Esta clase contiene las logicas aritmetricas, suma,
 * resta, multiplicacion, division, modulos.
 */
public class Calculator {
    /**
     *
     * @param num1 primer operando de la suma
     * @param num2 segundo operando de la suma
     * @return la suma de num1 y num2
     *
     * Este metodo sirve para sumar 2 numeros enteros
     */
    public static int sumaEnteros(int num1, int num2){
        return num1 + num2;
    }
    public static int restaEnteros(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicaEnteros(int num1, int num2) {
        return num1 * num2;
    }
    public static int divideEnteros(int num1, int num2) {
        return num1 / num2;
    }
    public static int moduloEnteros(int num1, int num2) {
        return num1 % num2;
    }
}
