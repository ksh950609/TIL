package ch04_control_if_for.sec06;

public class Break2_2 {

	public static void main(String[] args) {
		// 중첩된 반복문에서 break 사용
		// 대문자-소문자 
		// (1) 바깥 for문에 이름(라벨)을 붙이고
		Outter: for(char upper='A'; upper<='Z'; upper++) {  // 대문자 A~Z
			for(char lower='a'; lower<='z'; lower++) {// 소문자 a~z
				System.out.println(upper + "-" + lower);
				
				// 소문자 g이면 중단
				if(lower == 'g') 
					break Outter;		// (2) break 다음에 이름을 적어줌
				
				// 바깥 for문 중단 : 이름을 Otter로 붙이고, break Outter; 해서 중단
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