package ch04_control_if_for.sec06;

public class Break2 {

	public static void main(String[] args) {
		// ��ø�� �ݺ������� break ���
		// �빮��-�ҹ��� 
		for(char upper='A'; upper<='Z'; upper++) {  // �빮�� A~Z
			for(char lower='a'; lower<='z'; lower++) {// �ҹ��� a~z
				System.out.println(upper + "-" + lower);
				
				// �ҹ��� g�̸� �ߴ�
				if(lower == 'g') break;				
				// break���� ����� �ҹ��� ��� for���� g���� ��� �� �ߴܵǰ�
				// �ٱ��� �빮�� ��� for���� ��� Z���� ����
				// ��, ����� for�� 1���� �ߴ�
			}			
			
		}
	
		System.out.println("���α׷� ���� ����");

	}
}

/*
A : 65
B : 66
C : 67
a : 97	
*/