package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 변수
		 Scanner sc = new Scanner(System.in);
        int dan;

        // 입력       
        System.out.print("단 수 입력 : ");
        dan = sc.nextInt();

        //출력
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }

        sc.close();

	}

}
