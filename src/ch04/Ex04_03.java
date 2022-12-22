package ch04;

import java.util.Scanner;

public class Ex04_03 {

    public static void main(String[] args) {
        System.out.println("���ڸ� �ϳ� �Է��ϼ��� .>");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        // if ~else�� ���� ����
        if (input == 0) {
            System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
        } else {
            System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
        }
    }

}
