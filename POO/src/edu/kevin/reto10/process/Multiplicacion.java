package edu.kevin.reto10.process;

class Multiplicacion extends OperacionesAritmeticas {
    //Clase para la operacion de multiplicacion
    public double operar(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = new Suma().operar(resultado, num1);
        }
        return resultado;
    }
}
