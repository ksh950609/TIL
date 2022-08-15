package ch04_control_if_for.sec06;

public class Continue {

	public static void main(String[] args) {
		// Continue 문
		for(int i=1; i<=10; i++) {
			// 홀수인 경우 다음 출력 문장 건너뛰고 다음 반복 계속
			if(i%2 != 0) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
