package ch04_control_if_for.sec01;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		// ��ø if ��
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.print("��ȣ �Է� (1.����  2.ī��) : ");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			// ��ȣ�� ����� �Է��� ���
			System.out.print("���Ҿ� �Է� : ");
			pay = sc.nextInt();			
			
			// �����̸� ������ 10%, ī���̸� 5%
			if(num == 1) { // ������ ���
				System.out.println("������ : 10%");
				System.out.println("���ξ� : " + (int)(pay * 0.1) + " ��");
			} else { // ī���� ���
				System.out.println("������ : 5%");
				System.out.println("���ξ� : " + (int)(pay * 0.05) + " ��");
			}
			
		} else { // �߸� �Է��� ���
			System.out.println("�߸� �Է��Ͽ����ϴ�. �����մϴ�.");
		}
		
		sc.close();

	}

}
