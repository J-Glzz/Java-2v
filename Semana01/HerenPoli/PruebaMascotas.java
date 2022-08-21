package Semana01.HerenPoli;

public class PruebaMascotas {
    public static void main(String[] args) {
        //CrearGato();
        crearPerro();
    }
    public static void CrearGato(){
        Animal rex = new Gato();
        rex.setOjos(2);
        rex.setPatas(4);
        rex.setTipoDeAlimentacion("Omnivoro");
        rex.setPelaje("Peludo");
        rex.tipoAnimal();
        Gato poncho = new Gato();
        poncho.setRaza("Atigrado");
        poncho.setColor("Verde y blanco");
        poncho.Caracteristicas();
    }
    public static void crearPerro(){
        Animal valky = new Perro("Valky", "Chihuahua", "Golondrina", 2);
        valky.setPelaje("Poco peludo");
        valky.setPatas(4);
        valky.setOjos(2);
        valky.setTipoDeAlimentacion("Omnivoro");
        valky.tipoAnimal();
    }

}
