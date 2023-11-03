package edu.kevin.reto11.iu;

public class Ingles extends Idioma{
    //Clase para el idioma Ingles
    @Override
    public String suma() {
        return "Sum";
    }

    @Override
    public String resta() {
        return "Subtract";
    }

    @Override
    public String multiplicacion() {
        return "Multiply";
    }

    @Override
    public String division() {
        return "Divide";
    }

    @Override
    public String modulo() {
        return "Modulus";
    }

    @Override
    public String potencia() {
        return "Power";
    }

    @Override
    public String raiz() {
        return "Square Root";
    }
}