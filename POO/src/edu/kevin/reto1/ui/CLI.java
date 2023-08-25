package edu.kevin.reto1.ui;

import edu.kevin.reto1.process.Calculator;

import java.util.Scanner;

public class CLI{
    /**
     * En esta parte tenemos el menu para que el
     * usuario puede ingresar el tipo de operacion
     * que desea hacer para despues introducir los
     * valores con los que se realizara la operacion.
     */
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Salir");
        int opcionMenu = scanner.nextInt();

        System.out.println("Introduce dato 1");
        int num1= scanner.nextInt();
        System.out.println("Introduce dato 2");
        int num2= scanner.nextInt();

        switch(opcionMenu){
            /**
             * En este apartado se encuentran los case
             * en ellos se encuentra las funciones que
             * realizara una vez que el usuario seleccione
             * la opcion
             */
            case 1:
                System.out.println(num1 + "+" + num2 + "+" + Calculator.sumaEnteros(num1,num2));
                break;

            case 2:
                System.out.println(num1 + "+" + num2 + "+" + Calculator.restaEnteros(num1,num2));
                break;

            case 3:
                System.out.println(num1 + "+" + num2 + "+" + Calculator.multiplicaEnteros(num1,num2));
                break;
            case 4:
                System.out.println(num1 + "+" + num2 + "+" + Calculator.divideEnteros(num1,num2));
                break;

            case 5:
                System.out.println(num1 + "+" + num2 + "+" + Calculator.moduloEnteros(num1,num2));
                break;
            case 6:
                break;
            default:
                System.out.println("Esa opcion no existe");
        }
    }
}
