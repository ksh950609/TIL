package ch04_control_if_for.sec05;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		//  do ~ while ��
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("���� �ȳ� ���α׷�");
		
		do {
			System.out.print("\n1~4 ��ȣ ���� : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1: System.out.println("Java ���α׷���"); break;
				case 2: System.out.println("�����ͺ��̽�"); break;
				case 3: System.out.println("������ �����ӿ�ũ"); break;
				case 4: System.out.println("AI"); break;
				default: System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
			
			System.out.print("\n��� �Է��Ͻðڽ��ϱ�? (y/n �Է�) : ");
			answer = sc.next();
			// y, n�� �Է� ����. ����� �Է��� ������ �ݺ�
			while(!(answer.equals("y") || answer.equals("n"))) {
						System.out.println("�߸� �Է��Ͽ����ϴ�.");
						System.out.print("(y/n �Է�) : ");
						answer = sc.next();
			}
			
		} while(answer.equals("y")); // y �Է��ϸ� �ݺ�, y�̿��� ���� �Է��ϸ� ����
		//while(!answer.equals("n")); // n�̿��� ���� �Է��ϸ� �ݺ�, n �Է��ϸ� ����
		
		System.out.println("�����մϴ�.");
		sc.close();

	}

}















