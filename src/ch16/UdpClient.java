package ch16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    public static void main(String[] args) {
        try{
            new UdpClient().start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void start() throws Exception{
        //데이터를 송수신 할시는 DatagramSocket
        DatagramSocket datagramSocket = new DatagramSocket();
        //InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
        InetAddress serverAddress = InetAddress.getByName("192.168.0.18");
        //127.0.0.1는 자기 호스트를 나타내므로 자시 호스트의 ip어드레스를 알아냄
        //실제는 127.0.0.1는 서버의 주소를 작성 (192.168.0.18)
        //데이터가 저장될 공간으로 byte 배열을 생성한다.
        byte[] msg = new byte[100];
        DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,7777);
        DatagramPacket inPacket = new DatagramPacket(msg,msg.length);

        datagramSocket.send(outPacket); // 보내기
        datagramSocket.receive(inPacket); //받기

        System.out.println("current server time : "+ new String (inPacket.getData()));

        datagramSocket.close();
    }
}
