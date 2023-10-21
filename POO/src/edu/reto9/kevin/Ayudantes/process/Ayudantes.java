package edu.reto9.kevin.Ayudantes.process;

import java.util.Random;
public class Ayudantes {
    private int cantidadOjos;
    private String colorPiel;
    private String altura;
    private int nivelCreacion;
    private int nivelReparacion;
    private int nivelDestructivo;

    //Constructor
    public Ayudantes(){
        Random random = new Random();

        //Asignar valores aleatorios a las caracteristicas
        cantidadOjos = random.nextInt(2) + 1; // 1 o 2 ojos
        colorPiel = (random.nextBoolean()) ? "Blanco" : "Negro";
        altura = (random.nextBoolean()) ? "Alto" : "Bajo";
        nivelCreacion = random.nextInt(5) + 1; //Nivel 1 al 5
        nivelReparacion = random.nextInt(5) + 1; //Nivel 1 al 5
        nivelDestructivo = random.nextInt(5) + 1; //Nivel 1 al 5
    }

    //Metodos getter para obtener las caracteristicas

    public int getCantidadOjos() {
        return cantidadOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public int getNivelCreacion() {
        return nivelCreacion;
    }

    public int getNivelReparacion() {
        return nivelReparacion;
    }

    public int getNivelDestructivo() {
        return nivelDestructivo;
    }
}
