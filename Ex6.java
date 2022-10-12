package ch04_control_if_for.sec08_ex;

public class Ex6 {

	public static void main(String[] args) {
		// for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
