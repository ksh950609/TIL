package ch04_control_if_for.sec04;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		while (num != 7) {
			System.out.print("�ٽ� �Է� : ");
			num = sc.nextInt();
		}

		System.out.println(num + " �Է�. ����");

		sc.close();
	}

}
