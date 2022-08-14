package ch04_control_if_for.sec02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score;

		System.out.print("점수 입력 (0~100) : ");
		score = sc.nextInt();

		switch (score / 10) {  // 정수 나누기 정수의 결과는 정수 (타입 변환 필요 없음)
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}//

		sc.close();

	}

}
