package edu.kevin.reto11.process.lang;

import edu.kevin.reto11.process.lang.Idioma;

public class Español extends Idioma {
    //Clase para el idioma Español
    @Override
    public String suma() {
        return "Suma";
    }

    @Override
    public String resta() {
        return "Resta";
    }

    @Override
    public String multiplicacion() {
        return "Multiplicacion";
    }

    @Override
    public String division() {
        return "Division";
    }

    @Override
    public String modulo() {
        return "Modulo";
    }

    @Override
    public String potencia() {
        return "Potencia";
    }

    @Override
    public String raiz() {
        return "Raiz Cuadrada";
    }
}