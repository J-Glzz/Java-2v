package Archivos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutput {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Work\\Desktop\\FOS\\tres.txt";
        FileOutputStream fos3 = new FileOutputStream(path);
        BufferedOutputStream bos1 = new BufferedOutputStream(fos3);
        String msj = "Tercer archivo creado desde Java v18, pero reservando un espacio en memoria";
        byte b3[] = msj.getBytes();
        bos1.write(b3);
        bos1.flush();
        fos3.close();
        System.out.println("Creado exitosamente test 3");
    }
}
