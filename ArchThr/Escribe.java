package ArchThr;

import java.io.*;

public class Escribe{
    String msj;
    public String getMsj(){
        return msj;
    }
    public boolean setMsj(String msj){
        if(!msj.isEmpty()){
            this.msj = msj;
            return true;
        }
        else{
            return false;
        }
    }
    public void es() throws IOException{
        String m = getMsj();
        String path = "C:\\Users\\Work\\Desktop\\FOS\\returns.txt";
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte b[] = m.getBytes();
        bos.write(b);
        bos.flush();
        fos.close();
    }
}
