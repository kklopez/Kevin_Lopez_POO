package edu.kevin.reto11.process.math;

public class Multiplicacion extends OperacionesAritmeticas {
    //Clase para la operacion multiplicacion
    @Override
    public double operar(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = new Suma().operar(resultado, num1);
        }
        return resultado;
    }
}