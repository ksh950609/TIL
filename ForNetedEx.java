package ch04_control_if_for.sec03;

public class ForNetedEx {

	public static void main(String[] args) {
		// ��ø For ���� ��������
		for(int i = 1; i<=9 ; i++) {     	// 9��
			for(int dan = 2; dan <=9 ; dan++) {  // ��
				System.out.print(dan + "x" + i + "=" + (i*dan) + "\t");
			}
			System.out.println();	//�ܼ� �ٹٲ�
		}
	}

}
