package Semana01;

public class PruebaBici {
    public static void main(String[] args) {
        definirMon();
    }
    public static void definirMon() {
        Bicicleta biciMon = new Bicicleta();
        biciMon.setColor("Rojo");
        biciMon.setPins(8);
        biciMon.setRodada(28);
        biciMon.setVelocidad(35.8);
        String msg = "Soy una bicicleta de montana con estas caracteristicas: ";
        msg += "\nColor: " + biciMon.getColor();
        msg += "\nVelocidad: " + biciMon.getVelocidad();
        msg += "\nPins: " + biciMon.getPins();
        msg += "\nRodada: " + biciMon.getRodada();
        System.out.print(msg);
    }
}
