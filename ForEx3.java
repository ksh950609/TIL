package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// �ݺ��� For ���� ��������3
		Scanner sc = new Scanner(System.in);
		int start, end, sum = 0;
		
		System.out.print("start �Է� : ");
		start = sc.nextInt();
		
		System.out.print("end �Է� : ");
		end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.println(start + " ~ " + end + "�� �� : " + sum);

		
		sc.close();
	}

}
