package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// 반복문 For 구문 연습문제3
		Scanner sc = new Scanner(System.in);
		int start, end, sum = 0;
		
		System.out.print("start 입력 : ");
		start = sc.nextInt();
		
		System.out.print("end 입력 : ");
		end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.println(start + " ~ " + end + "의 합 : " + sum);

		
		sc.close();
	}

}
