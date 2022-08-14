package ch04_control_if_for.sec03;

public class ForEx1 {

	public static void main(String[] args) {
		// 반복문 For 구문 예제
		int sum = 0;
		
		for(int i = 1; i <= 10; i ++) {			
			
			if(i % 2 == 1) {
				System.out.println(i);
				sum += i;
			}
				
		}
		
		System.out.println("1부터 10까지 홀수의 합은 " + sum + "입니다.");
		
		
		
		System.out.println("------------------------------------------------");	
		
		sum = 0;  // 0으로 다시 초기화
		for(int i = 1; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("1~10 홀수의 합 : " + sum);
	}

}






