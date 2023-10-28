package edu.kevin.reto10.process;

class Division extends OperacionesAritmeticas {
    //Clase para la operacion de division
    @Override
    double calcular(double a, double b){
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; //"Not a Number"
        }
    }
}
