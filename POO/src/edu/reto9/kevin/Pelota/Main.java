package edu.reto9.kevin.Pelota;

import edu.reto9.kevin.Pelota.process.Pelota;
import edu.reto9.kevin.Pelota.ui.CLI;
public class Main {
    public static void main (String[] args){
        Pelota pelota = CLI.crearPelota();
        CLI.mostrarInformacionPelota(pelota);
    }
}
