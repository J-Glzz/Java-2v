package Semana01;

public class Bicicleta {
    // Constructor por omision se crea automaticamente
    // pero si definimos las caracteristicas se hace mas
    // facil que agregar los setters and getters
    Bicicleta(){
    }
    // Características - Campos
    public int pins, rodada;
    public double velocidad;
    public String color;

    // Metodos  Getters
    public double getVelocidad(){
        return velocidad;
    }
    public int getPins(){
        return pins;
    }
    public int getRodada(){
        return rodada;
    }
    public String getColor(){ return color; }

    // Metodos Setters
    public boolean setPins(int pins){
        if (pins > 0){
            this.pins = pins;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setRodada(int rodada){
        if (rodada > 0){
            this.rodada = rodada;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setVelocidad(double velocidad){
        if (velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
            return true;
        }
        else{
            return false;
        }
    }
    public String printState(){
        return "pins : " + pins + "\n" +
                "rodada: " + rodada + "\n" +
                "velocidad: " + velocidad + "kps" + "\n" +
                "color: " + color;
    }

}
