package ch04_control_if_for.sec05;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// do ~ while ��

		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;

		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0); // 0�� �ƴϸ� �ݺ�

		System.out.println(num + "�Է�. �ݺ��� ����");
		System.out.println("�Է��� ���� ���� : " + sum);
		
		sc.close();

	}

}
