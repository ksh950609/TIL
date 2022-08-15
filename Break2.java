package ch04_control_if_for.sec06;

public class Break2 {

	public static void main(String[] args) {
		// 중첩된 반복문에서 break 사용
		// 대문자-소문자 
		for(char upper='A'; upper<='Z'; upper++) {  // 대문자 A~Z
			for(char lower='a'; lower<='z'; lower++) {// 소문자 a~z
				System.out.println(upper + "-" + lower);
				
				// 소문자 g이면 중단
				if(lower == 'g') break;				
				// break에서 가까운 소문자 출력 for문만 g까지 출력 후 중단되고
				// 바깥의 대문자 출력 for문은 계속 Z까지 수행
				// 즉, 가까운 for문 1개만 중단
			}			
			
		}
	
		System.out.println("프로그램 실행 종료");

	}
}

/*
A : 65
B : 66
C : 67
a : 97	
*/