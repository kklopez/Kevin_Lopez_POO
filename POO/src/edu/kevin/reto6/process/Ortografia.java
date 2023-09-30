package edu.kevin.reto6.process;

public class Ortografia {
        /**@Author Kevin Lopez
        Este programa es un minijuego de palabras donde
        el usuario tiene que introducir letras para
        poder adivinar la palabra oculta.*/
        public static String obtenerPalabraBase(int nivel) {
            switch (nivel) {
                case 1:
                    return "tina";

                case 2:
                    return "elefante";

                case 3:
                    return "programacion";

                default:
                    return "";
            }
        }
        public static String reemplazarLetra(String palabraBase, String palabraAdivinada, char letra) {
            StringBuilder nuevaPalabra = new StringBuilder(palabraAdivinada);
            for (int i = 0; i < palabraBase.length(); i++) {
                if (palabraBase.charAt(i) == letra) {
                    nuevaPalabra.setCharAt(i, letra);
                }
            }
            return nuevaPalabra.toString();
        }
    }