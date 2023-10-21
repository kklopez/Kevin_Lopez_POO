package edu.reto9.kevin.Ayudantes.ui;

import edu.reto9.kevin.Ayudantes.process.Ayudantes;

public class CLI {
    public void start(){
        //Crear cinco ayudantes
        Ayudantes[] ayudantes = new Ayudantes[5];
        for (int i = 0; i < 5; i++) {
            ayudantes[i] = new Ayudantes();
        }

        //Imprimir caracteristicas de cada ayudante
        for (int i = 0; i < 5; i++){
            System.out.println("Ayudante "+ (i + 5) + ":");
            System.out.println("Cantidad de ojos: " + ayudantes[i].getCantidadOjos());
            System.out.println("Color de piel: " + ayudantes[i].getColorPiel());
            System.out.println("Alrura: " + ayudantes[i].getAltura());
            System.out.println("Nivel para crear objetos: " + ayudantes[i].getNivelCreacion());
            System.out.println("Nivel para arreglar cosas: " + ayudantes[i].getNivelReparacion());
            System.out.println("Nivel destructivo: " + ayudantes[i].getNivelDestructivo());
            System.out.println();

        }
    }
}
