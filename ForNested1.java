package ch04_control_if_for.sec03;

public class ForNested1 {

	public static void main(String[] args) {
		// ��ø for ��
		for (int i = 1; i <= 3; i++) { // 3�� �ݺ�

			// �� �ݺ��� ������ for�� ����
			for (int j = 1; j <= 5; j++)
				System.out.print(j + " "); // 5�� �ݺ�

			System.out.println(); // �ܼ� �ٹٲ�
		}

		System.out.println("------------------");

		// �ݺ� Ƚ�� ���
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		int count = 0;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				count++;
				System.out.print(count + "\t");
			}
			System.out.println();
		}

	}

}







