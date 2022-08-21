package Semana01.HerenPoli;

public class Perro extends Animal{
    // Caracteristicas - Atributos - Campos
    String nombre, raza, color;
    int edad;
    // Sobrecarga (Overload) de constructor
    Perro(){
        super();
        String msj;
        msj = "Se ha creado un perro";
        System.out.println(msj);
    }
    Perro(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
        }
    }
    Perro(String nombre, String raza){
        if (!nombre.isEmpty() || !raza.isEmpty()){
            this.nombre = nombre;
            this.raza = raza;
        }
    }
    Perro(String nombre, String raza, String color){
        if (!nombre.isEmpty() || !raza.isEmpty() || !color.isEmpty()){
            this.nombre = nombre;
            this.raza = raza;
            this.color = color;
        }
    }
    Perro(String nombre, String raza, String color, int edad){
        if (!nombre.isEmpty() || !raza.isEmpty() || !color.isEmpty() || edad > 0){
            this.nombre = nombre;
            this.raza = raza;
            this.color = color;
            this.edad = edad;
        }
    }
    // Metodos getters
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public String getColor(){
        return color;
    }
    public int getEdad() {
        return edad;
    }
    void caracteristicasPerro(){
        String msj;
        msj = "Caracteristicas del perro:";
        msj += "\nNombre: " + getNombre();
        msj += "\nRaza: " + getRaza();
        msj += "\nColor: " + getColor();
        msj += "\nEdad: " + getEdad() + " anios";
        System.out.println(msj);
    }
}
