package ch04_control_if_for.sec03;

public class ForLoop {
	public static void main(String[] args) {
		// for ���� ����
		
		int count = 0;
		
		for(;;) {
			count++;
			System.out.println(count);
			
			if(count >=5) break; // �ݺ��� ���� ���� : ���ǿ� �ش�Ǹ� �ݺ��� ����
		}

	}

}
