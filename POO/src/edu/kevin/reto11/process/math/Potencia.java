package edu.kevin.reto11.process.math;

public class Potencia extends OperacionesAritmeticas {
    //Clase para la operacion potencia
    @Override
    public double operar(double base, double exponente) {
        if (exponente < 0) {
            System.out.println("ERROR: Exponente negativo no permitido");
            return 0;
        }

        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = new Multiplicacion().operar(resultado, base);
        }
        return resultado;
    }
}