package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num, score, total = 0;
		float average = 0;

		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.o3ut.print("학생" + i + "점수 입력 : ");
			score = sc.nextInt();

			total += score;
		} 
		
		average = total / (float) num;  // 실수 연산을 위해 float으로 타입 변환
		// 주의 : 정수/정수 = 정수   -> 소수점 이하 유지하기 위해 실수 연산해야 함
		
		System.out.println("평균 : " + average);

		sc.close();
	}

}




학생 수 입력하고 학생들의 성적의 합과 평균을 구하시오