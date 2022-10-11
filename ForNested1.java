package ch04_control_if_for.sec03;

public class ForNested1 {

	public static void main(String[] args) {
		// 중첩 for 문
		for (int i = 1; i <= 3; i++) { // 3번 반복

			// 각 반복할 때마다 for문 수행
			for (int j = 1; j <= 5; j++)
				System.out.print(j + " "); // 5번 반복

			System.out.println(); // 단순 줄바꿈
		}

		System.out.println("------------------");

		// 반복 횟수 출력
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		int count = 0;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				count++;
				System.out.print(count + "\t");
			}
			System.out.println();
		}

	}

}







