package kevin.edu.reto4.ui;

import kevin.edu.reto4.process.analisis;

import java.util.Scanner;
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
        int[][] ventas = new int[][]{
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308},
        };

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ver trimestre más productivo por sabor");
            System.out.println("2. Ver trimestre más productivo en general");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    getSaborMasProductivo(ventas, sabores);
                    break;
                case 2:
                    calcularVentasPorTrimestre(ventas);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void calcularVentasPorTrimestre(int[][] ventas) {
        int[] trimestreTotal = new int[ventas[0].length];

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                trimestreTotal[j] += ventas[i][j];
            }
        }

        for (int i = 0; i < trimestreTotal.length; i++) {
            System.out.println("Total de ventas en el trimestre " + (i + 1) + ": " + trimestreTotal[i]);
        }
    }

    public static void getSaborMasProductivo(int[][] ventas, String[] sabores) {
        for (int i = 0; i < sabores.length; i++) {
            int saborMasVendido = Integer.MIN_VALUE;
            int trimestreMasProductivo = -1;

            for (int j = 0; j < ventas.length; j++) {
                if (ventas[j][i] > saborMasVendido) {
                    saborMasVendido = ventas[j][i];
                    trimestreMasProductivo = j + 1;
                }
            }

            System.out.println("Sabor de café frío: " + sabores[i]);
            System.out.println("Trimestre más productivo: Trimestre " + trimestreMasProductivo);
        }
    }
}