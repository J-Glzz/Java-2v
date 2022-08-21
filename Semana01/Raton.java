package Semana01;

public class Raton {
    // Caracteristicas - Atributos
    int dpi;
    double peso, precio;
    String color, marca, tipoRaton, sensor;

    // Metodos - Campos Getters
    public int getDpi(){
        return dpi;
    }
    public double getPeso(){
        return peso;
    }
    public double getPrecio(){
        return precio;
    }
    public String getColor(){
        return color;
    }
    public String getMarca(){
        return marca;
    }
    public String getTipoRaton(){
        return tipoRaton;
    }
    public String getSensor(){
        return sensor;
    }
    // Metodos - Camps Setters
    public boolean setDpi(int dpi){
        if (dpi > 0){
            this.dpi = dpi;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setPeso(double peso){
        if (peso > 0){
            this.peso = peso;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setMarca(String marca){
        if(!marca.isEmpty()){
            this.marca = marca;
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
        else {
            return false;
        }
    }
    public boolean setSensor(String sensor){
        if (!sensor.isEmpty()){
            this.sensor = sensor;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setTipoRaton(String tipoRaton){
        if (!tipoRaton.isEmpty()){
            this.tipoRaton = tipoRaton;
            return true;
        }
        else {
            return false;
        }
    }
    public void printState(){
        String msg;
        msg = "Caracteristicas del Raton:";
        msg += "\nMarca: " + getMarca();
        msg += "\nTipo de raton: " + getTipoRaton();
        msg += "\nDpi: " + getDpi();
        msg += "\nTipo de sensor: " + getSensor();
        msg += "\nColor: " + getColor();
        msg += "\nPrecio: " + getPrecio();
        System.out.println(msg);
    }
}
