package ch04_control_if_for.sec05;

public class DoWhile1 {

	public static void main(String[] args) {
		// do ~ while ��
		int i = 1;
		
		// ������ { } �� �� �����ϰ�
		// ���� Ȯ�� �� 
		// ������ true�� �ݺ�
		do {
			System.out.println(i);
			i++;
		} while(i<=10); // 10�����̸� �ݺ�
		
		System.out.println("���� : " + i);

	}

}
