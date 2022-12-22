package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex15_20 {
    public static void main(String[] args) {

        try{
            String fileName = "UserInfo.ser"; // 객체의 직렬화 값을 출력할 파일
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("JavaMan","1234",30);
            UserInfo u2 = new UserInfo("pythonMan","5678",28);

            ArrayList<UserInfo> list = new ArrayList<>();
            //ArrayList도 Sericlaizable 인터페이스를 구현한 클래스
            list.add(u1); // list에 UserInfo 객체 추가
            list.add(u2);

            //객체를 직렬화한다. (ObjectOutputStream의 writeObject(객체)로 출력대상파일에 출력)
            out.writeObject(u1);
            out.writeObject(u2);

            out.writeObject(list);
            out.close();
            System.out.println("직렬화가 끝났습니다.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
