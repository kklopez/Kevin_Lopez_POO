package edu.kevin.reto3.ui;

import edu.kevin.reto3.process.conversiones;

import java.util.Scanner;
public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu de conversiones:");
            System.out.println("1. Convertir de decimal a binario.");
            System.out.println("2. Convertir de decimal a octal.");
            System.out.println("3. Convertir de decimal a hexadecimal.");
            System.out.println("4. Convertir de binario a decimal.");
            System.out.println("5. Convertir de octal a decimal.");
            System.out.println("6. Convertir de hexadecimal a decimal.");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrse un numero decimal: ");
                    int decimal1 = scanner.nextInt();
                    String binario1 = conversiones.decimalAlbinario(decimal1);
                    System.out.println("El resultado en binario es: " + binario1);
                    break;

                case 2:
                    System.out.print("Ingrese un numero decimal: ");
                    int decimal2 = scanner.nextInt();
                    String octal = conversiones.decimalAOctal(decimal2);
                    System.out.println("El resultado en octal es: " + octal);
                    break;

                case 3:
                    System.out.print("Ingrese un numero decimal: ");
                    int decimal3 = scanner.nextInt();
                    String hexadecimal = conversiones.decimalAHexadecimal(decimal3);
                    System.out.println("El resultado en hexdecimal es: " + hexadecimal);
                    break;

                case 4:
                    System.out.print("Ingrese un numero binario: ");
                    String binario2 = scanner.next();
                    int decimal4 = conversiones.binarioADecimal(binario2);
                    System.out.println("El resultado en decimal es: " + decimal4);
                    break;

                case 5:
                    System.out.print("Ingrese un numero octal: ");
                    String octal2 = scanner.next();
                    int decimal5 = conversiones.octalADecimal(octal2);
                    System.out.println("El resultado en decimal es: " + decimal5);
                    break;

                case 6:
                    System.out.print("Ingresa un numero hexadecimal (Sin el prefijo 'ox'): ");
                    String hexadecimal2 = scanner.next();
                    int decimal6 = conversiones.hexadecimalAlDecimal(hexadecimal2);
                    System.out.println("El resultado en decimal es: " + decimal6);
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }

            System.out.println("¿Desea realizar otra conversion? (Si/No): ");
            String continuar = scanner.next();

            if(!continuar.equalsIgnoreCase("Si")){
                System.out.println("¡Hasta luego!");
                break;
            }
        } while (true);

        scanner.close();
    }
}
