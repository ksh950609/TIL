package ch04_control_if_for.sec08_ex;

public class Ex3 {

	public static void main(String[] args) {
		// for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ�

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("3�� ����� ���� : " + sum);
	}

}
