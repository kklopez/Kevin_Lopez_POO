package edu.kevin.reto3.process;

public class conversiones {
    public static String decimalAlbinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalAOctal(int decimal){
        return Integer.toHexString(decimal);
    }

    public static String decimalAHexadecimal(int decimal){
        return Integer.toHexString(decimal);
    }

    public static int binarioADecimal(String binario){
        return Integer.parseInt( binario, 2);
    }

    public static int octalADecimal(String octal){
        return Integer.parseInt(octal, 8);
    }

    public static int hexadecimalAlDecimal(String hexadecimal){
        return Integer.parseInt(hexadecimal, 16);
    }
}
