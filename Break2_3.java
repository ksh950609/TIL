package ch04_control_if_for.sec06;

public class Break2_3 {

	public static void main(String[] args) {
		// 중첩된 반복문에서 break 사용
		// 대문자-소문자 
		// 소문자 g이면 안의 for문 중단, 대문자 K이면 바깥 for문 중단
		Outter: for(char upper='A'; upper<='Z'; upper++) {  // 대문자 A~Z
			for(char lower='a'; lower<='z'; lower++) {// 소문자 a~z
				System.out.println(upper + "-" + lower);
				
				// 소문자 g이면 안의 for문 중단
				if(lower == 'g') 	break;		
				
				// 대문자 K이면 바깥 for문 중단
				if(upper == 'K') break Outter;				
				
			}			
			
		}
	
		System.out.println("프로그램 실행 종료");

	}
}
/*
Ctrl + C  : 복사
Ctrl + V : 붙여넣기
Ctrl + S : 저장

*/