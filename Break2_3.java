package ch04_control_if_for.sec06;

public class Break2_3 {

	public static void main(String[] args) {
		// ��ø�� �ݺ������� break ���
		// �빮��-�ҹ��� 
		// �ҹ��� g�̸� ���� for�� �ߴ�, �빮�� K�̸� �ٱ� for�� �ߴ�
		Outter: for(char upper='A'; upper<='Z'; upper++) {  // �빮�� A~Z
			for(char lower='a'; lower<='z'; lower++) {// �ҹ��� a~z
				System.out.println(upper + "-" + lower);
				
				// �ҹ��� g�̸� ���� for�� �ߴ�
				if(lower == 'g') 	break;		
				
				// �빮�� K�̸� �ٱ� for�� �ߴ�
				if(upper == 'K') break Outter;				
				
			}			
			
		}
	
		System.out.println("���α׷� ���� ����");

	}
}
/*
Ctrl + C  : ����
Ctrl + V : �ٿ��ֱ�
Ctrl + S : ����

*/