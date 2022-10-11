package ch04_control_if_for.sec03;

public class ForNested2 {

	public static void main(String[] args) {
		// 중첩 for 문
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan + "단");
			
			for(int n=1; n<=9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan*n));
			}
			
			System.out.println();
		}

	}

}



구구단을 만들어보자