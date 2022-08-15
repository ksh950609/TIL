package ch04_control_if_for.sec05;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		//  do ~ while 문
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		
		do {
			System.out.print("\n1~4 번호 선택 : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1: System.out.println("Java 프로그래밍"); break;
				case 2: System.out.println("데이터베이스"); break;
				case 3: System.out.println("스프링 프레임워크"); break;
				case 4: System.out.println("AI"); break;
				default: System.out.println("잘못 입력하였습니다.");
			}
			
			System.out.print("\n계속 입력하시겠습니까? (y/n 입력) : ");
			answer = sc.next();
			// y, n만 입력 가능. 제대로 입력할 때까지 반복
			while(!(answer.equals("y") || answer.equals("n"))) {
						System.out.println("잘못 입력하였습니다.");
						System.out.print("(y/n 입력) : ");
						answer = sc.next();
			}
			
		} while(answer.equals("y")); // y 입력하면 반복, y이외의 문자 입력하면 종료
		//while(!answer.equals("n")); // n이외의 문자 입력하면 반복, n 입력하면 종료
		
		System.out.println("종료합니다.");
		sc.close();

	}

}















