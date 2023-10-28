package edu.kevin.reto10.process;

class Raiz extends OperacionesAritmeticas{
    //Clase para la operacion raiz
    @Override
    double calcular(double a, double b) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Error: No se puede calcular la raiz de un numero negativo.");
            return Double.NaN; //"Not a Number"
        }
    }
}
