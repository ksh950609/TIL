package ch04_control_if_for.sec01;

import java.util.Scanner;

public class MultopleIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수 입력(0~100) : ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("학점은 A입니다.");
			System.out.println("축하드립니다.");
		}else if(score >= 80) {
			System.out.println("학점은 B입니다.");
		}else if(score >= 70) {
			System.out.println("학점은 C입니다.");
		}else if(score >= 60) {
			System.out.println("학점은 D입니다.");
		}else {
			System.out.println("학점은 F입니다.");
			System.out.println("재수강 바랍니다.");
		}
		
		sc.close();
	}

}


/*
 * if(score >= 90) {
	System.out.println("학점은 A입니다.");
	System.out.println("축하드립니다.");
}else if((score < 90) && (score >= 80)) {
	System.out.println("학점은 B입니다.");
}else if((score < 80) && (score >= 70)) {
	System.out.println("학점은 C입니다.");
}else if((score < 70) && (score >= 60)) {
	System.out.println("학점은 D입니다.");
}else {
	System.out.println("학점은 F입니다.");
	System.out.println("재수강 바랍니다.");
}
*/

