package ch04_control_if_for.sec06;

public class Continue {

	public static void main(String[] args) {
		// Continue ��
		for(int i=1; i<=10; i++) {
			// Ȧ���� ��� ���� ��� ���� �ǳʶٰ� ���� �ݺ� ���
			if(i%2 != 0) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
