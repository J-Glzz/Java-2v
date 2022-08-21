package POO;

public class Intro {
    public static void main(String[] args) {
        MascotaPerro valky = new MascotaPerro();
        valky.setColor("negro");
        valky.setEdad(2);
        valky.setNombre("Valky");
        valky.printState();
    }
}

// La clase perro se hará con base a la abstracción de datos, con métodos setters y getters
class MascotaPerro extends NecesidadesPerro{
    // Atributos - Características - Campos
    String nombre, color;
    int edad;
    // Métodos
    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public int getEdad(){
        return edad;
    }
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }
        else
            return false;
    }
    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
            return true;
        }
        else
            return false;
    }
    public boolean setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
            return true;
        }
        else
            return false;
    }
    public void printState(){
        String msj;
        msj = "Tu mascota perro tiene las siguientes caracteristicas";
        msj += "\nNombre: " + getNombre();
        msj += "\nColor: " + getColor();
        msj += "\nEdad: " + getEdad();
        System.out.println(msj);
    }
}
// La clase de necesidades del perro se hará con base a la abstracción de datos
class NecesidadesPerro extends RazasPerros{
    NecesidadesPerro(){
        super();
        String msj = "El perro tambien tiene necesidades, estas son las siguientes";
        popo();
        come();
        ejercicio();
        dormir();
    }
    // Métodos
    void popo(){
        String msj = "El perro hace popo";
        System.out.println(msj);
    }
    void come(){
        String msj = "El perro también necesita comer";
        System.out.println(msj);
    }
    void ejercicio(){
        String msj = "El perro se debe ejercitar";
        System.out.println(msj);
    }
    void dormir(){
        String msj = "El perro necesita dormir";
        System.out.println(msj);
    }
}
class RazasPerros extends Perro{
    RazasPerros(){
        super();
        String msj;
        msj = "Existen muchas razas de perros, pero estas son las mas comunes";
        System.out.println(msj);
        chihuahua();
        schnauzer();
        dalmata();
        pitbull();
        borderCollie();
    }
    public static void chihuahua(){
        String msj;
        msj = "El chihuahua o chihuahueño es una raza de perro originaria de México. " +
                "\nEs una de las razas de perros más antiguas del continente americano, además de ser el perro más pequeño del mundo. " +
                "\nEl perro chihuahua es originario del estado de Chihuahua.";
        System.out.println(msj);
    }
    public static void schnauzer(){
        String msj;
        msj = "El Schnauzer es una raza canina que se originó en Alemania durante los siglos XV y XVI. " +
                "\nSu nombre deriva del alemán Schnauze hocico, relacionado con Schnauzbart y Schnurrbart bigote, dada su muy característica barba que comienza en la parte superior del hocico en esta raza";
        System.out.println(msj);
    }
    public static void dalmata(){
        String msj;
        msj = "El dálmata es una raza canina que debe su nombre a la histórica región de Dalmacia. " +
                "\nSu característica principal es su singular pelaje moteado de color negro, hígado o limón. " +
                "\nAl nacer, las crías carecen de manchas, las cuales van apareciendo por todo su cuerpo durante el primer año de vida.";
        System.out.println(msj);
    }
    public static void borderCollie(){
        String msj;
        msj = "El Border Collie es una raza de perro de trabajo incluido dentro de la denominación Collie. " +
                "\nLa raza surgió en la frontera entre Escocia e Inglaterra como perro pastor, sobre todo para trabajar con rebaños de ovejas";
        System.out.println(msj);
    }
    public static void pitbull(){
        String msj;
        msj = "El pit bull terrier americano es una raza de perro, originaria de Estados Unidos, que surgió a partir de la raza de los bull-and-terriers, importados desde el Reino Unido en el siglo XIX." +
                "\nSu esperanza de vida es de 12 a 17 años.";
        System.out.println(msj);

    }
}
class Perro extends Animal{
    Perro(){
        super();
        descripcion();
    }
    void descripcion(){
        String msj;
        msj = "El perro, llamado perro doméstico o can, y en algunos lugares coloquialmente llamado chucho, tuso, choco, entre otros; " +
                "\nes un mamífero carnívoro de la familia de los cánidos, que constituye una especie del género Canis";
        System.out.println(msj);
    }
}
class Animal{
    Animal(){
        String msj = "Existen muchos animales";
        System.out.println(msj);
    }
}
