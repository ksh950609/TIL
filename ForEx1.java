package ch04_control_if_for.sec03;

public class ForEx1 {

	public static void main(String[] args) {
		// �ݺ��� For ���� ����
		int sum = 0;
		
		for(int i = 1; i <= 10; i ++) {			
			
			if(i % 2 == 1) {
				System.out.println(i);
				sum += i;
			}
				
		}
		
		System.out.println("1���� 10���� Ȧ���� ���� " + sum + "�Դϴ�.");
		
		
		
		System.out.println("------------------------------------------------");	
		
		sum = 0;  // 0���� �ٽ� �ʱ�ȭ
		for(int i = 1; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("1~10 Ȧ���� �� : " + sum);
	}

}






