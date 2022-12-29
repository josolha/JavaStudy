package ch16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {

    public static void main(String[] args){
        try{
            new UdpServer().start();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void start() throws IOException {
        DatagramSocket socket = new DatagramSocket(7777); //udp 서버용 소켓
        //udp에서 데이터 처리하는 클래스
        DatagramPacket inPacket, outPacket; // 데이터를 패킷 단위로 처리(여러바이트를 그룹으로 처리)

        byte[] inMsg = new byte[10];
        byte[] outMsg;

        while (true) {
            //데이터를 수신하기 위한 패킷을 생성한다.
            inPacket = new DatagramPacket(inMsg, inMsg.length);
            socket.receive(inPacket); // 패킷을 통해 데이터를 수신(receive)한다.

            // 수신한 패킷으로 부터 client의 IP주소롸 Port를 얻는다
            InetAddress address = inPacket.getAddress();
            int port = inPacket.getPort();

            //현재시간을 정해진 포맷의 문자열로 변환
            SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
            String time = sdf.format(new Date());
            outMsg = time.getBytes(); // time을 byte배열로 반환한다.
            //byte[] java.lang.String.getBytes()는 문자열 객체를 바이트 배열로 반환
            //패킷을 생성해서 client에게 전송(send)한다.
            outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
            socket.send(outPacket);
        }
    }
}
