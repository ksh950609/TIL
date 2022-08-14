package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 
		// 양의 개수 저장할 변수, 음의 개수 저장할 변수, 0의 개수 저장할 변수
		Scanner sc = new Scanner(System.in);
		int num, pos=0, neg=0, zero=0;
		// pos : 양수의 개수 값을 저장할 변수 
		
		
		// 10번 입력 : 반복문 (for 문)
		// 입력 받은 숫자 각각에 대해 양수인지, 음수인지, 0안자 판별하고 해당 변수 증가 : if 문
		for(int i =1; i<=10; i++) {  // 10번 반복
			System.out.print("숫자"+ i +" 입력 : ");
			num = sc.nextInt(); // 예: 3, -5, 0
			
			if(num > 0) 
				pos++;  // ++ : 값을 1 증가
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

/*
숫자1 입력 : 1  : pos++  : 1
숫자2 입력 : 2  : pos++  : 2
숫자3 입력 : 3  : pos++  : 3
숫자4 입력 : 0 : zero++ : 1
숫자5 입력 : 0
숫자6 입력 : 0
숫자7 입력 : 0
숫자8 입력 : -9
숫자9 입력 : -5
숫자10 입력 : -7
양의 개수  : 3
음의 개수 : 3
0의 개수 : 4


*/
















