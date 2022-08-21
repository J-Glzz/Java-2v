package Archivos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInput{
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Work\\Desktop\\FOS\\uno.txt";
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i;
        while ((i = bis.read())!=-1){
            System.out.print((char) i);
        }
        bis.close();
        fis.close();
    }
}
