package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� 
		// ���� ���� ������ ����, ���� ���� ������ ����, 0�� ���� ������ ����
		Scanner sc = new Scanner(System.in);
		int num, pos=0, neg=0, zero=0;
		// pos : ����� ���� ���� ������ ���� 
		
		
		// 10�� �Է� : �ݺ��� (for ��)
		// �Է� ���� ���� ������ ���� �������, ��������, 0���� �Ǻ��ϰ� �ش� ���� ���� : if ��
		for(int i =1; i<=10; i++) {  // 10�� �ݺ�
			System.out.print("����"+ i +" �Է� : ");
			num = sc.nextInt(); // ��: 3, -5, 0
			
			if(num > 0) 
				pos++;  // ++ : ���� 1 ����
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

/*
����1 �Է� : 1  : pos++  : 1
����2 �Է� : 2  : pos++  : 2
����3 �Է� : 3  : pos++  : 3
����4 �Է� : 0 : zero++ : 1
����5 �Է� : 0
����6 �Է� : 0
����7 �Է� : 0
����8 �Է� : -9
����9 �Է� : -5
����10 �Է� : -7
���� ����  : 3
���� ���� : 3
0�� ���� : 4


*/
















