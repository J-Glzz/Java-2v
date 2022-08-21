package Threading;

public class Runrun {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Awebo si jala perros, hilo 1");
            }
        });
        t.start();
    }
}
