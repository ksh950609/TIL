package ch04_control_if_for.sec02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// switch ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г� �Է� : ");
		int year = sc.nextInt();
		
		switch(year) {
			case 1: System.out.println("1�г�"); break;
			case 2: System.out.println("2�г�"); break;
			case 3: System.out.println("3�г�"); break;
			case 4: System.out.println("4�г�"); break;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�."); 
		// default �� ���� �� switch���� �����ϹǷ� break�� �ʿ� ����
		}
		
		sc.close();
	}

}

// ���� ���� ����Ű : Ctrl + Shift + F
