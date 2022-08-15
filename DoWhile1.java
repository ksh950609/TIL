package ch04_control_if_for.sec05;

public class DoWhile1 {

	public static void main(String[] args) {
		// do ~ while 문
		int i = 1;
		
		// 무조건 { } 한 번 수행하고
		// 조건 확인 후 
		// 조건이 true면 반복
		do {
			System.out.println(i);
			i++;
		} while(i<=10); // 10이하이면 반복
		
		System.out.println("종료 : " + i);

	}

}
