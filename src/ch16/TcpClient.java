package ch16;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;

public class TcpClient {

    public static void main(String[] args) {
        try{
            String serverIp = "192.168.0.18"; // 자기 pc(localhost)
            System.out.println("서버의 주소입니다. 서버 IP :" +  serverIp);
            // 소켓을 생성하여 ServerSocket에 연결을 요청한다.
            Socket socket = new Socket(serverIp,7777);

            //소켓의 입력스트립을 얻는다.
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            //소켓으로 부터 받은 데이터를 출력한다.
            System.out.println("서버로부터 받은 메시지 :" + dis.readUTF());
            System.out.println("연결을 종료합니다");
            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");
        }

        catch (Exception e){

        }

    }
}
