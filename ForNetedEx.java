package ch04_control_if_for.sec03;

public class ForNetedEx {

	public static void main(String[] args) {
		// 중첩 For 구문 연습문제
		for(int i = 1; i<=9 ; i++) {     	// 9행
			for(int dan = 2; dan <=9 ; dan++) {  // 열
				System.out.print(dan + "x" + i + "=" + (i*dan) + "\t");
			}
			System.out.println();	//단순 줄바꿈
		}
	}

}
