package ch04_control_if_for.sec02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score;

		System.out.print("���� �Է� (0~100) : ");
		score = sc.nextInt();

		switch (score / 10) {  // ���� ������ ������ ����� ���� (Ÿ�� ��ȯ �ʿ� ����)
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}//

		sc.close();

	}

}
