package ch04_control_if_for.sec04;

public class WhileLoop {

	public static void main(String[] args) {
		// while 무한 루프
		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i);
			
			if(i >= 3) break;
		}

	}

}
