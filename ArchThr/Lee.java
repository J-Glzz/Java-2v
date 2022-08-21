package ArchThr;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Lee extends Escribe{
    public static void le() throws IOException{
        String path = "C:\\Users\\Work\\Desktop\\FOS\\returns.txt";
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i;
        while ((i = bis.read())!=-1){
            System.out.print((char) i);
        }
    }
}
