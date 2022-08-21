package Semana01;

public class Pruebas {
    public static void main(String[] args) {
        definirTeclado();
        definirRaton();
        definirCPU();
        definirMonitor();
    }
    public static void definirTeclado(){
        Teclado tecladoLogi = new Teclado(2499.99, "Gamer", "Negro", "Logitech");
        tecladoLogi.printState();

    }
    public static void definirRaton(){
        Raton ratonLogi = new Raton();
        ratonLogi.setDpi(3500);
        ratonLogi.setColor("Negro");
        ratonLogi.setMarca("Logitech");
        ratonLogi.setSensor("Optico");
        ratonLogi.setTipoRaton("Gamer");
        ratonLogi.setPeso(302.7);
        ratonLogi.setPrecio(459.99);
        ratonLogi.printState();
    }
    public static void definirCPU(){
        Gabinete gabineteTUF = new Gabinete();
        gabineteTUF.setMarca("TUF Gaming");
        gabineteTUF.setPrecio(2499.99);
        gabineteTUF.setNumDiscosSolidos(4);
        gabineteTUF.setTipoGabinete("ATX");
        gabineteTUF.setSocketPermitido("AM4");
        gabineteTUF.printState();
    }
    public static void definirMonitor(){
        Monitor monitorMakena = new Monitor("Makena", "LED", 24, 60, 120, 1459.99);
        monitorMakena.printState();
    }
}