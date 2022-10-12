package ch04_control_if_for.sec07;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		// Random 연습문제
		
		Scanner sc = new Scanner(System.in);
		
		// 내 숫자 먼저 생성 - 랜덤
		Random r = new Random();
        int num = r.nextInt(10) + 1;
		
		// 알아 맞혀보세요  - 출력
        System.out.println("------------------------------------------");
        System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^ (1 ~ 10)");
		
		// 입력 		
        System.out.print("숫자 입력 : ");		
		int input = sc.nextInt();
		
		// 아닙니다. 다시   - 반복 (비교해서 일치하지 않으면 계속 반복해서 입력)
		while(input != num) {
			System.out.println("------------------------------------------");
			System.out.print("아닙니다. 다시 맞쳐보세요^^ 다시 입력 : ");
			input = sc.nextInt();
		}
		
		// 맞혔습니다
		System.out.println("===============================");
		System.out.println("드디어 맞혔습니다~ 나의 숫자는 " +  num + " 입니다!");
		
		sc.close();
	}

}
