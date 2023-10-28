package edu.kevin.reto10.process;

class Modulo extends OperacionesAritmeticas {
    //Clase para la operacion modulo
    @Override
    double calcular(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: No se puede realizar el modulo por cero.");
            return Double.NaN; //"Not a Number"
        }
    }
}
