package ch04_control_if_for.sec07;

import java.util.Random;
// Ctrl + Shift + O

public class RaondomNum2 {

	public static void main(String[] args) {
		// Random Ŭ���� ����ؼ� ���� ���� ����
		Random r = new Random();
				
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10) + 1; //1~10 ������ �� �߿��� ���� ���� ����
			System.out.println(num);
		}
	
	}

}
