package ArchThr;

import java.io.IOException;

public class Main extends Lee{
    public static void main(String[] args) {
        Escribe esc = new Escribe();
        esc.setMsj("Otro nuevo mensaje desde radiOvni!");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    esc.es();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    new Lee();
                    Lee.le();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        try{
            t2.start();
            t2.join(1500);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        descripcionThread(t1, t2);
    }
    public static void descripcionThread(Thread t1, Thread t2){
        String msjt1, msjt2;
        msjt1 = "Informacion del primer hilo";
        msjt1 += "\nNombre: " + t1.getName();
        msjt1 += "\nId: " + t1.getId();
        msjt1 += "\nPrioridad: " + t1.getPriority();
        msjt2 = "Informacion del segundo hilo";
        msjt2 += "\nNombre: " + t2.getName();
        msjt2 += "\nId: " + t2.getId();
        msjt2 += "\nPrioridad: " + t2.getPriority();
        System.out.println(msjt1);
        System.out.println(msjt2);
    }
}
