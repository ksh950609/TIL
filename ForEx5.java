package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num, score, total = 0;
		float average = 0;

		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.o3ut.print("�л�" + i + "���� �Է� : ");
			score = sc.nextInt();

			total += score;
		} 
		
		average = total / (float) num;  // �Ǽ� ������ ���� float���� Ÿ�� ��ȯ
		// ���� : ����/���� = ����   -> �Ҽ��� ���� �����ϱ� ���� �Ǽ� �����ؾ� ��
		
		System.out.println("��� : " + average);

		sc.close();
	}

}




�л� �� �Է��ϰ� �л����� ������ �հ� ����� ���Ͻÿ�