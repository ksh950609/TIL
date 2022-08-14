package ch04_control_if_for.sec01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfNestedEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, qty, price, amount, discount, total;
		String prdName;
		
		System.out.println("******** ��ǰ ���� ********");
		System.out.println("1 ��Ʈ�� : 1,200,000��");
		System.out.println("2 ������ ī�޶� : 400,000��");
		System.out.println("*************************");
		
		System.out.print("��ǰ��ȣ �Է� : ");
		num = sc.nextInt();
		
		// 1�� �ƴϰ� 2�� �ƴ� ���
		if(num != 1 && num != 2) { // �߸� �Է��� ���
			System.out.println("�߸� �Է��Ͽ����ϴ�.\n�����մϴ�.");
		}else { // ����� �Է��� ���
			//�ֹ����� �Է� 
			System.out.print("�ֹ����� �Է� : ");
			qty = sc.nextInt();
			
			// �Է��� ��ȣ�� ���� ��ǰ��� ���� ����
			if(num == 1) {
				prdName = "��Ʈ��";
				price = 1200000;
			}else {
				prdName = "������ī�޶�";
				price = 400000;
			}
			
			// ���
			//1. �ֹ���
			amount = price * qty;
			
			//2. ���ξ�
			if(amount >= 1000000)
				discount = (int)(amount * 0.1);
			else if(amount >= 500000)
				discount = (int)(amount * 0.05);
			else
				discount = 0;
			
			// discount ���� �� 0���� �ʱ�ȭ�ϸ� ������ else �� ��� ��
			
			//3. �����Ҿ� 
			total = amount - discount;
			
			DecimalFormat df = new DecimalFormat("#,###");
			
			// ��ü �ֹ� ���� ��� 
			System.out.println("******** �ֹ� ���� ********");
			System.out.println("��ǰ�� : " + prdName);
			System.out.println("���� : " + df.format(price) + " ��");
			System.out.println("�ֹ����� : " + qty + " ��");
			System.out.println("�ֹ��� : " + df.format(amount) + " ��");
			System.out.println("���ξ� : " + df.format(discount) + " ��");
			System.out.println("�����Ҿ� : " + df.format(total) + " ��");
		}

		sc.close();
	}

}
