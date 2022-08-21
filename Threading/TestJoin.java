package Threading;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 20; i+=2){
            try{
                String msj;
                msj = "Incremento de 2 en 2. Cuenta " + i;
                System.out.println(msj);
                Thread.sleep(1500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestJoin()),
                t2 = new Thread(new TestJoin()),
                t3 = new Thread(new TestJoin());

        ShowDetails(t1, t2, t3);

        try{
            t1.start();
            t1.join(1500);
            t1.setName("Super Hilo");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t2.start();
        t3.start();

    }
    public static void ShowDetails(Thread t1, Thread t2, Thread t3){
        String msjt1, msjt2, msjt3;
        msjt1 = "Informacion del hilo 1: " + t1.getName();
        msjt1 += "\nId: " + t1.getId();
        msjt1 += "\nEstado: " + t1.getState();
        msjt1 += "\nPrioridad " + t1.getPriority();
        msjt2 = "Informacion del hilo 2: " + t2.getName();
        msjt2 += "\nId: " + t2.getId();
        msjt2 += "\nEstado: " + t2.getState();
        msjt2 += "\nPrioridad " + t2.getPriority();
        msjt3 = "Informacion del hilo 3: " + t3.getName();
        msjt3 += "\nId: " + t3.getId();
        msjt3 += "\nEstado: " + t3.getState();
        msjt3 += "\nPrioridad " + t3.getPriority();
        System.out.println(msjt1);
        System.out.println(msjt2);
        System.out.println(msjt3);
    }
}
