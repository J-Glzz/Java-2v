package Semana01;

public class Teclado {
    double precio;
    String tipoTeclado, color, marca;

    Teclado(double precio, String tipoTeclado, String color, String marca){
        this.precio = precio;
        this.tipoTeclado = tipoTeclado;
        this.marca = marca;
        this.color = color;
    }
    public double getPrecio(){
        return precio;
    }
    public String getTipoTeclado(){
        return tipoTeclado;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public void printState(){
        String msg = "Caracteristicas de teclado:";
        msg += "\nMarca: " + getMarca();
        msg += "\nTipo de teclado: " + getTipoTeclado();
        msg += "\nColor: " + getColor();
        msg += "\nPrecio: " + getPrecio();
        System.out.println(msg);
    }

}
