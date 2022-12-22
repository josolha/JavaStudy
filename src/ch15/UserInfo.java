package ch15;

import java.io.Serializable;

public class UserInfo implements Serializable {
    //직렬화가 가능한 클래스는 Serializable를 구현해야 한다
    //직렬화 가능한 클래스의 인스턴스 멤버 변수만 직렬화 대상
    String name;
    String password;
    int age;

    public UserInfo() {
        this("Unknown", "1111",0); //this는 클래스의 다른 생성자 호출
    }
    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
    @Override
    public String toString(){
        return "(" +name + "," + password + "," + age + ")";
    }
}
