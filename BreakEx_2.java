package ch04_control_if_for.sec06;

import java.util.Scanner;

public class BreakEx_2 {

	public static void main(String[] args) {
		// 변수
		int balance = 100000, withdrawal;
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.println("현재 잔액 : " + balance);
		
		do {

			System.out.print("인출액 입력 : ");
			withdrawal = sc.nextInt();

			if (balance - withdrawal < 0)
				break;
			else
				balance -= withdrawal;

		} while (true);

		// 출력
		System.out.println("잔액부족. 현재 잔액 : " + balance);

		sc.close();

	}

}
