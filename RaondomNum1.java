package ch04_control_if_for.sec07;

public class RaondomNum1 {

	public static void main(String[] args) {
		// Math.random() �޼ҵ� ����ؼ� ���� ���� ����

		for (int i = 1; i <= 10; i++) {
			int num = (int)(Math.random() * 10) + 1;
			System.out.println(num);
		}

	}

}

/*

���� ���� ���� ����
(1) 0 < �������� < 1 �������� �Ǽ� ������ ������ ���� ���� �߻�
(2) ���� �κ��� �� ���� : ���ϱ� 10
(3) ���� Ÿ������ ��ȯ : (int)
(4) 1 ~ 10 ������ ���� �߻� : ���� ���ڸ� ���� : + 1 (�⺻�� ���� : ������ ���� ��)

*/