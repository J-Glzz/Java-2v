package Semana01;

public class Monitor {
    // Caracteristicas - Atributos - Campos
    String marca, panel;
    int tamanio, tasaDeRefresco, alimentacion;
    double precio;
    // Sobrecarga - Overload de constructor
    Monitor(){
    }
    Monitor(String marca){
        this.marca = marca;
    }
    Monitor(String marca, String panel, double precio){
        this.marca = marca;
        this.panel = panel;
        this.precio = precio;
    }
    Monitor(String marca, String panel, int tamanio, int tasaDeRefresco, int alimentacion, double precio){
        this.marca = marca;
        this.panel = panel;
        this.tamanio = tamanio;
        this.tasaDeRefresco = tasaDeRefresco;
        this.alimentacion = alimentacion;
        this.precio = precio;
    }
    // Metodos Getters
    public String getMarca(){
        return marca;
    }
    public String getPanel(){
        return panel;
    }
    public int getTamanio(){
        return tamanio;
    }
    public int getTasaDeRefresco(){
        return tasaDeRefresco;
    }
    public int getAlimentacion(){
        return alimentacion;
    }
    public double getPrecio(){
        return precio;
    }
    void printState(){
        String msg;
        msg = "Caracteristicas del monitor: ";
        msg += "\nMarca: " + getMarca();
        msg += "\nPanel: " + getPanel();
        msg += "\nTamanio: " + getTamanio();
        msg += "\nTasa de refresco: " + getTasaDeRefresco();
        msg += "\nAlimentacion: " + getAlimentacion();
        msg += "\nPrecio: " + getPrecio();
        System.out.println(msg);
    }
}
