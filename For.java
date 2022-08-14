package ch04_control_if_for.sec03;

public class For {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {  // 반복 횟수 지정 : 10회 반복
			// 반복 수행되는 문장
			System.out.println("안녕" + i);
		} // for 문 안에서 선언된 i는 for 문 안에서만 사용 가능
		// for 문 밖에서는 사용 불가
		
		
		System.out.println("----------------");
		int j;   // main()에 선언된 변수 : main() 내 모든 곳에서 사용 가능
		for(j = 1; j<=10; j++)  {
			System.out.println(j);
		} // j 사용 가능
		
		System.out.println("j : " + j);
		
		System.out.println("----------------");
		
		// 1 ~ 100 숫자의 합
		
		int i;
		int sum = 0;  // 더하기 연산에서 sum을 사용할 것이므로 반드시 초기화해야 함
		
		for(i=1;  i<=10; i++) {
			// 더하기
			//sum = sum + i; // +1, +2, +3, .... +10
			sum += i;
		}
		
		System.out.println("1 ~ " + (i - 1)  + " 합 : " + sum);
		// 최종 i 값이 11로 되어 있으므로 10이 나오게 하기 위해서 -1 수행

	}

}
















