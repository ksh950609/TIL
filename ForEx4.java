package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// ���� ���� 
		// ���� ���� ������ ����, ���� ���� ������ ����, 0�� ���� ������ ����
		Scanner sc = new Scanner(System.in);
		int num, pos=0, neg=0, zero=0;
		
		
		// 10�� �Է� : �ݺ��� (for ��)
		// �Է� ���� ���� ������ ���� �������, ��������, 0���� �Ǻ��ϰ� �ش� ���� ���� : if ��
		for(int i =1; i<=10; i++) {
			System.out.print("����"+ i +" �Է� : ");
			num = sc.nextInt();
			
			if(num > 0) 
				pos++;
			else if(num < 0) 
				neg++;
			else  
				zero++;
		}
		
		// �� ������ �� ���
		System.out.println("���� ����  : " + pos);
		System.out.println("���� ���� : " + neg);
		System.out.println("0�� ���� : " + zero);
		
		sc.close();		
		
	}

}



������ ���� ���� 1~10�� ���ϰ� �� ���� ��� ���� 0�� ���� ���� �� �ִ� ���α׷��� ������
 
