package ch04_control_if_for.sec06;

public class Break1 {

	public static void main(String[] args) {
		// break ��
		
		int i = 0;
		
		while(true) {
			i += 3;  // 3�� ���� (3�� ���)
			
			if(i > 20) break; // 20���� ũ�� �ݺ��� ����
			
			System.out.println(i);			
		}

	}

}
