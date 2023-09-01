package edu.kevin.reto2.Boletos.process;

public class maquina {

    /** Este es un programa que nos sera util
     * para ayudar a vender boletos, en este
     * caso, un parque de diversiones **/

    public static double calcularPrecioBoleto(char opcion) {
        double precio = 0;

        switch (opcion) {
            case 'A':
                precio = 100;
                break;

            case 'N':
                precio = 70;
                break;

            case 'I':
                precio = 50;
                break;

            case 'B':
                precio = 70; /** Adulto mayor sin credencial cuesta lo mismo que de un niño **/
                break;
            default:
                System.out.println("Clave no valida. Introduce una clave valida");
        }
        return precio;
    }
}