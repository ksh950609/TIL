package ch04_control_if_for.sec03;

public class ForLoop {
	public static void main(String[] args) {
		// for 무한 루프
		
		int count = 0;
		
		for(;;) {
			count++;
			System.out.println(count);
			
			if(count >=5) break; // 반복문 종료 조건 : 조건에 해당되면 반복문 종료
		}

	}

}
