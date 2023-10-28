package edu.kevin.reto10.process;

class Potencia extends OperacionesAritmeticas {
    //Clase para la operacion potencia
    @Override
    double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}
