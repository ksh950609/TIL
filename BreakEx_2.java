package ch04_control_if_for.sec06;

import java.util.Scanner;

public class BreakEx_2 {

	public static void main(String[] args) {
		// ����
		int balance = 100000, withdrawal;
		Scanner sc = new Scanner(System.in);

		// �Է�
		System.out.println("���� �ܾ� : " + balance);
		
		do {

			System.out.print("����� �Է� : ");
			withdrawal = sc.nextInt();

			if (balance - withdrawal < 0)
				break;
			else
				balance -= withdrawal;

		} while (true);

		// ���
		System.out.println("�ܾ׺���. ���� �ܾ� : " + balance);

		sc.close();

	}

}
