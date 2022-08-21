package Threading;

public class Hilos2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
                String msj;
                msj = "Este es el numero " + i + " creado por un hilo desde Runnable";
                System.out.println(msj);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            if (i == 10) {
                System.out.println("Proceso terminado del hilo Runnable");
            }
        }
    }
}
class Hilo extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--){
            String msj;
            msj = "Este es el numero " + i + " creado por un hilo";
            try {
                sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(msj);
            if (i == 0) {
                System.out.println("Proceso terminado del hilo");
            }
        }
    }
}
class PruebaHilos{
    public static void main(String[] args) {
        Thread t2 = new Thread(new Hilos2());
        t2.start();
        Hilo h2 = new Hilo();
        h2.start();
    }
}
