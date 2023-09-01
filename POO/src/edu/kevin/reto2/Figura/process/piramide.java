package edu.kevin.reto2.Figura.process;

public class piramide {
    public static void Imprimirpiramide(int altura){
        for(int i = 1; i <= altura; i++){
            for(int j = 1; j <= altura - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
