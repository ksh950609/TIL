package ch04_control_if_for.sec07;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		// Random ��������
		
		Scanner sc = new Scanner(System.in);
		
		// �� ���� ���� ���� - ����
		Random r = new Random();
        int num = r.nextInt(10) + 1;
		
		// �˾� ����������  - ���
        System.out.println("------------------------------------------");
        System.out.println("� �����ϱ��? �˾� ����������^^ (1 ~ 10)");
		
		// �Է� 		
        System.out.print("���� �Է� : ");		
		int input = sc.nextInt();
		
		// �ƴմϴ�. �ٽ�   - �ݺ� (���ؼ� ��ġ���� ������ ��� �ݺ��ؼ� �Է�)
		while(input != num) {
			System.out.println("------------------------------------------");
			System.out.print("�ƴմϴ�. �ٽ� ���ĺ�����^^ �ٽ� �Է� : ");
			input = sc.nextInt();
		}
		
		// �������ϴ�
		System.out.println("===============================");
		System.out.println("���� �������ϴ�~ ���� ���ڴ� " +  num + " �Դϴ�!");
		
		sc.close();
	}

}
