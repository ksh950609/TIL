package ch04_control_if_for.sec06;

public class Break2_2 {

	public static void main(String[] args) {
		// ��ø�� �ݺ������� break ���
		// �빮��-�ҹ��� 
		// (1) �ٱ� for���� �̸�(��)�� ���̰�
		Outter: for(char upper='A'; upper<='Z'; upper++) {  // �빮�� A~Z
			for(char lower='a'; lower<='z'; lower++) {// �ҹ��� a~z
				System.out.println(upper + "-" + lower);
				
				// �ҹ��� g�̸� �ߴ�
				if(lower == 'g') 
					break Outter;		// (2) break ������ �̸��� ������
				
				// �ٱ� for�� �ߴ� : �̸��� Otter�� ���̰�, break Outter; �ؼ� �ߴ�
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