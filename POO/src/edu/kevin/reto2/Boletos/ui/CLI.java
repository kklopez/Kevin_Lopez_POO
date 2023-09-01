package edu.kevin.reto2.Boletos.ui;

import edu.kevin.reto2.Boletos.process.maquina;

import java.util.Scanner;
public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        char respuesta;

        do {
            System.out.println("ITRODUCE EL TIPO DE BOLETO SEGUN SU CLAVE:");
            System.out.println("Boleto de adulto: A");
            System.out.println("Boleto de niño: N");
            System.out.println("Boleto del INAPAM: I");
            System.out.println("Boleto de adulto mayor sin credencial: B");

            char opcion = scanner.next().charAt(0);
            double precio = maquina.calcularPrecioBoleto(opcion);

            if (precio > 0){
                System.out.println("El precio del boleto es: $" + precio);
                System.out.println("¿Hay otro cliente que solicite un boleto? (S/N");
                respuesta = scanner.next().charAt(0);
            } else{
                respuesta = 'S';
            }
        } while (respuesta == 'S' || respuesta == 's');

        System.out.println("Gracias por tu compra. ¡Hasta luego!");
        scanner.close();
    }
}
