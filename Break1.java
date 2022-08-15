package ch04_control_if_for.sec06;

public class Break1 {

	public static void main(String[] args) {
		// break 문
		
		int i = 0;
		
		while(true) {
			i += 3;  // 3씩 증가 (3의 배수)
			
			if(i > 20) break; // 20보다 크면 반복문 종료
			
			System.out.println(i);			
		}

	}

}
