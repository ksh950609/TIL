package ch04_control_if_for.sec06;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		// break ��

		int withdrawal, balance = 100000;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ܾ� : " + balance);
		
		while (true) {
			System.out.print("����� �Է� : ");
			withdrawal = sc.nextInt();

			if (balance - withdrawal < 0)
				break;
			
			balance -= withdrawal;
		}
		
		System.out.println("�ܾ׺���. ���� �ܾ� : " + balance);

		sc.close();
	}

}
