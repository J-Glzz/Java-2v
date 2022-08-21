package Threading;

public class Runn{
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hilo creado con el constructor de Runnable");
            }
        };
        new Thread(run).start();
    }
}
