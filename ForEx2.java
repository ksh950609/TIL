package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// ����
		 Scanner sc = new Scanner(System.in);
        int dan;

        // �Է�       
        System.out.print("�� �� �Է� : ");
        dan = sc.nextInt();

        //���
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }

        sc.close();

	}

}
