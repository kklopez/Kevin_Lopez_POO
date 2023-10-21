package edu.reto9.kevin.Pelota.ui;

import edu.reto9.kevin.Pelota.process.Pelota;

import java.util.Scanner;
public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    public static Pelota crearPelota(){
        //Menu donde el usuario introduce las
        //caracteristicas de la pelota que desea
        //crear.
        System.out.println("¡CREA TU PROPIA PELOTA!:");

        System.out.println("Ingrese el color: ");
        String color = scanner.next();

        System.out.println("Ingresa la rapidez: ");
        int rapidez = scanner.nextInt();

        System.out.println("Ingresa el poder: ");
        int poder = scanner.nextInt();

        return new Pelota(color, rapidez, poder);
    }

    public static void mostrarInformacionPelota(Pelota pelota){
        //Una vez introducidos todos los datos, el programa
        //mostrara la informacion final de las caracteristicas
        //de la pelota creada.
        System.out.println("Informacion de tu pelota:");
        System.out.println("Color: "+ pelota.getColor());
        System.out.println("Rapidez: "+ pelota.getRapidez());
        System.out.println("Poder: "+ pelota.getPoder());
    }
}
