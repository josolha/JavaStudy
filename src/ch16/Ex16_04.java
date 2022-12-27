package ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex16_04 {
    public static void main(String[] args) {

        URL url =null;
        BufferedReader input = null;
        String address = "https://ko.wikipedia.org/wiki/%ED%81%AC%EB%A6%AC%EC%8A%A4%EB%A7%88%EC%8A%A4";
        String line ="";

        try{
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));
            //URL클래스의 openStream()은 URL의 자원에 연결되는 InputStream 객체를 반환
            //openStream()은 url.openConnection()으로 HttpURLConnection 객체를 만들어
            //url.openConnection().getInputStream()으로 inputStream객체를 얻는다
            while((line=input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
