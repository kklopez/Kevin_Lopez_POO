package edu.kevin.reto11.process;

public class Modulo extends OperacionesAritmeticas {
    //Clase para las operaciones modulo
    @Override
    public double operar(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("ERROR: Division por cero no permitida");
            return 0;
        }

        while (num1 >= num2) {
            num1 = new Resta().operar(num1, num2);
        }
        return num1;
    }
}