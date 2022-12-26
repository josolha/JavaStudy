package ch16;

import java.net.InetAddress;
import java.util.Arrays;

public class Ex16_01 {

    public static void main(String[] args) {

        InetAddress ip = null; //ipAddress처리 클래스로 ipAddress 정보 및 처리 메서드를 제공
        InetAddress[] ipArr = null;

        try{
            ip = InetAddress.getByName("www.naver.com");
            //주 DNS 서버의 ipAddress 객체
            // InetAddress 객체는 스태틱 메서드 getByName("host")이용하여 처리
            // host에 대한 ipAddress 객체를 얻어냄
            System.out.println("getHostName() :"+ ip.getHostName());
            System.out.println("getHostAddress() :"+ ip.getHostAddress());
            //host에 대한 ip주소
            System.out.println("toString(): "+ ip.toString());
            //www.naver.com/224.130.195.200의 형태로 문자열화
            byte[] ipAddr = ip.getAddress(); //1바이트씩 구분된 IP어드레스를 배열로 처리
            System.out.println("getAddress() :" + Arrays.toString(ipAddr));
            //Arrays.toString(각데이터형배열)을 문자열화하는데 byte값 (127)보다 큰것은 -로 나옴
            String result = "";
            for (int i = 0; i <ipAddr.length; i++) {
                System.out.println(ipAddr.length);
                result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i])+ ".";
            }
            System.out.println("getAddress()+256 : "+result);
            System.out.println();

        }catch(Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        try{
            ip = InetAddress.getLocalHost(); // 내 pc의 ip address를 가진 객체
            System.out.println("getHostName() :"+ ip.getHostName());
            System.out.println("getHostAddress() :"+ ip.getHostAddress());
            System.out.println();

        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            ipArr = InetAddress.getAllByName("www.naver.com");
            for (int i = 0; i < ipArr.length; i++) {
                System.out.println("ipArr["+i+"]:" + ipArr[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
