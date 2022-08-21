package Threading;

public class Hilos extends Thread{
    @Override
    public void run() {
        System.out.println("Mi primer hilo creado");
    }

    public static void main(String[] args) {
        Hilos h1 = new Hilos();
        h1.start();
        HilosR hr1 = new HilosR();
        Thread t1 = new Thread(hr1);
        t1.start();
    }
}
class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("Mi segundo hilo creado desde el Runnable");
    }
}