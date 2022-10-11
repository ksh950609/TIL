package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// 변수 선언 
		// 양의 개수 저장할 변수, 음의 개수 저장할 변수, 0의 개수 저장할 변수
		Scanner sc = new Scanner(System.in);
		int num, pos=0, neg=0, zero=0;
		
		
		// 10번 입력 : 반복문 (for 문)
		// 입력 받은 숫자 각각에 대해 양수인지, 음수인지, 0안자 판별하고 해당 변수 증가 : if 문
		for(int i =1; i<=10; i++) {
			System.out.print("숫자"+ i +" 입력 : ");
			num = sc.nextInt();
			
			if(num > 0) 
				pos++;
			else if(num < 0) 
				neg++;
			else  
				zero++;
		}
		
		// 각 변수의 값 출력
		System.out.println("양의 개수  : " + pos);
		System.out.println("음의 개수 : " + neg);
		System.out.println("0의 개수 : " + zero);
		
		sc.close();		
		
	}

}



질문을 돌려 수를 1~10번 구하고 이 수의 양수 음수 0의 수를 구할 수 있는 프로그램을 만들어보자
 
