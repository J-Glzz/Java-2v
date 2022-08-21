package Archivos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream1{
    public static void main(String[] args) {
        try{
            FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Work\\Desktop\\FOS\\uno.txt");
            String msj = "Primer archivo creado desde Java v18";
            byte b1[] = msj.getBytes();
            fos1.write(b1);
            fos1.close();
            System.out.println("Creado exitosamente test 1");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
class Test2{
    public static void main(String[] args) {
        try {
            FileOutputStream fos2 = new FileOutputStream("C:\\Users\\Work\\Desktop\\FOS\\dos.txt");
            String msj = "Segundo archivo creado desde Java v18";
            byte b2[] = msj.getBytes();
            fos2.write(b2);
            fos2.close();
            System.out.println("Creado exitosamente test 2");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

