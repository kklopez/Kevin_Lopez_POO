package edu.reto9.kevin.Pelota.process;

public class Pelota {
    /**@Autor Kevin Lopez
     *Este programa tiene como objetivo crear
     * una pelota con base a su color, rapidez y
     * poder; estos datos son proporcionados por
     * el usuario para despues mostrar la
     * informacion de la pelota que deseo crear
     */
    //Atributos
    private String color;
    private int rapidez;
    private int poder;

    //Constructores
    public Pelota(String color, int rapidez, int poder){
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    //Metodos
    public void disminuirRapidez(){
        rapidez--;
    }

    public void aumentarPoder(){
        poder++;
    }

    //Getters y Setters
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getRapidez(){
        return rapidez;
    }

    public void setRapidez(int rapidez){
        this.rapidez = rapidez;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder){
        this.poder = poder;
    }
}