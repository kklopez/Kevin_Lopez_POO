package edu.kevin.retofinal;

import edu.kevin.retofinal.iu.CLI;

/**
 * @Author Kevin Lopez
 * Clase principal que contiene el metodo main para iniciar la aplicacion.
 */
public class Main {

    /**
     * Punto de entrada principal para la aplicacion.
     * Este metodo inicia la ejecucion del programa llamando al metodo showMenu de la clase CLI.
     *
     * @param args Argumentos de la linea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        CLI.showMenu();
    }
}