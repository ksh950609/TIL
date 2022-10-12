package ch04_control_if_for.sec07;

import java.util.Random;
// Ctrl + Shift + O

public class RaondomNum2 {

	public static void main(String[] args) {
		// Random 클래스 사용해서 랜덤 숫자 생성
		Random r = new Random();
				
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10) + 1; //1~10 범위의 수 중에서 랜덤 숫자 생성
			System.out.println(num);
		}
	
	}

}
