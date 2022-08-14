package ch04_control_if_for.sec01;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		// 중첩 if 문
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.print("번호 입력 (1.현금  2.카드) : ");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			// 번호를 제대로 입력한 경우
			System.out.print("지불액 입력 : ");
			pay = sc.nextInt();			
			
			// 현금이면 할인율 10%, 카드이면 5%
			if(num == 1) { // 현금인 경우
				System.out.println("할인율 : 10%");
				System.out.println("할인액 : " + (int)(pay * 0.1) + " 원");
			} else { // 카드인 경우
				System.out.println("할인율 : 5%");
				System.out.println("할인액 : " + (int)(pay * 0.05) + " 원");
			}
			
		} else { // 잘못 입력한 경우
			System.out.println("잘못 입력하였습니다. 종료합니다.");
		}
		
		sc.close();

	}

}
