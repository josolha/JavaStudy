package ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Ex16_05 {
    public static void main(String[] args) {
        //URL을 대상 소스로 하여 write
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://www.w3schools.com/bootstrap4/default.asp";
        int ch = 0;
        try{
            url = new URL(address);
            in = url.openStream(); // address의 url객체와 연결되는 InputStream
            out = new FileOutputStream("javabasic_src.txt");
            while((ch=in.read())!=-1){
                out.write(ch);
            }
            in.close();
            out.close();

        }
        catch(Exception e ){
            e.printStackTrace();
        }

    }
}
