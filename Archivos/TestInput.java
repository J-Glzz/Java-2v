package Archivos;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInput {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Work\\Desktop\\FOS\\tres.txt");
            int i = 0;
            while ((i = fis.read())!=-1){
                System.out.print((char) i);
            }
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
