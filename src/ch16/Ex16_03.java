package ch16;

import java.net.URL;
import java.net.URLConnection;

public class Ex16_03 {

    public static void main(String[] args) {
        String address = "http://www.codechobo.com/sample/hello.html";
        try{
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println("conn.toStrint():" +conn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
