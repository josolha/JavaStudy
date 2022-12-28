package ch16;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServer {
    public static void main(String[] args) {

        ServerSocket serverSoket = null;

        try {
            serverSoket = new ServerSocket(7777);
            //port 7777을 사용 서버소켓 생성
            //클라이언트에서 서버소켓의 이 포트로 연결 요청
            System.out.println(getTime() + "서버가 준비되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            try{
                System.out.println(getTime()+"연결요청을 기다립니다");
                // 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
                Socket socket = serverSoket.accept();
                // 연결 요청을 기다리다가 요청이 오면 scoket 객체를 반환
                // 이 소켓은 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
                System.out.println(getTime()+socket.getInetAddress()+ "로 부터 연결요청이 들어왔습니다.");
                //소켓의 출력 스트림을 얻는다.
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);
                dos.writeUTF("[Notice] Test Message1 from Server.");
                //TCP에서는 socket에 write 하면 전송
                System.out.println(getTime()+"데이터를 전송했습니다.");
                dos.close();
                socket.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //현재시간을 문자열로 반환하는 함수
    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
