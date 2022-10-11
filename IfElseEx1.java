package ch04_control_if_for.sec01;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num %2 == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		sc.close();
	}

}


정수를 입력 받으면 홀수 인지 짝인지 나오는 프로그램을 만들어라