package ch04_control_if_for.sec02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// switch 문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 입력 : ");
		int year = sc.nextInt();
		
		switch(year) {
			case 1: System.out.println("1학년"); break;
			case 2: System.out.println("2학년"); break;
			case 3: System.out.println("3학년"); break;
			case 4: System.out.println("4학년"); break;
			default: System.out.println("잘못 입력하였습니다."); 
		// default 문 수행 후 switch문을 종료하므로 break문 필요 없음
		}
		
		sc.close();
	}

}

// 라인 정렬 단축키 : Ctrl + Shift + F
