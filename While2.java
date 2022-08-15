package ch04_control_if_for.sec04;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		while (num != 7) {
			System.out.print("다시 입력 : ");
			num = sc.nextInt();
		}

		System.out.println(num + " 입력. 종료");

		sc.close();
	}

}
