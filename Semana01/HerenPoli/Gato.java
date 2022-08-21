package Semana01.HerenPoli;

public class Gato extends Animal{
    // Atributos - Campos - Caracteristicas
    String color, raza;
    // Constructor por omision
    Gato(){
        super();
        String msj;
        msj = "Se creo un Gato";
        System.out.println(msj);
    }
    // Metodos
    public String getColor(){
        return color;
    }
    public String getRaza(){
        return raza;
    }
    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setRaza(String raza){
        if (!raza.isEmpty()){
            this.raza = raza;
            return true;
        }
        else {
            return false;
        }
    }
    public void Caracteristicas(){
        String msj;
        msj = "Soy un Gato color " + getColor() + ", de raza " + getRaza();
        System.out.println(msj);
    }
    public void come(){
        String msj;
        msj = "El gato come atun";
        System.out.println(msj);
    }
    public void camina(){
        String msj;
        msj = "El gato camina chido";
        System.out.println(msj);
    }
    public void salta(){
        String msj;
        msj = "El gato salta bien cabron";
        System.out.println(msj);
    }
}
