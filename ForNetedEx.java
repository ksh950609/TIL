package ch04_control_if_for.sec03;

public class ForNetedEx {

	public static void main(String[] args) {
		// ��ø For ���� ��������
		for(int i = 1; i < 10; i++) {
			for(int dan = 2; dan < 10; dan++) {
				System.out.print(dan + "x" + i + "=" + (i*dan) + "\t");
			}
			System.out.println();	//�ܼ� �ٹٲ�
		}
	}

}
