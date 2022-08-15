package ch04_control_if_for.sec06;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		// break 문

		int withdrawal, balance = 100000;
		Scanner sc = new Scanner(System.in);

		System.out.println("현재 잔액 : " + balance);
		
		while (true) {
			System.out.print("인출액 입력 : ");
			withdrawal = sc.nextInt();

			if (balance - withdrawal < 0)
				break;
			
			balance -= withdrawal;
		}
		
		System.out.println("잔액부족. 현재 잔액 : " + balance);

		sc.close();
	}

}
