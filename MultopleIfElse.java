package ch04_control_if_for.sec01;

import java.util.Scanner;

public class MultopleIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("���� �Է�(0~100) : ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("������ A�Դϴ�.");
			System.out.println("���ϵ帳�ϴ�.");
		}else if(score >= 80) {
			System.out.println("������ B�Դϴ�.");
		}else if(score >= 70) {
			System.out.println("������ C�Դϴ�.");
		}else if(score >= 60) {
			System.out.println("������ D�Դϴ�.");
		}else {
			System.out.println("������ F�Դϴ�.");
			System.out.println("����� �ٶ��ϴ�.");
		}
		
		sc.close();
	}

}


/*
 * if(score >= 90) {
	System.out.println("������ A�Դϴ�.");
	System.out.println("���ϵ帳�ϴ�.");
}else if((score < 90) && (score >= 80)) {
	System.out.println("������ B�Դϴ�.");
}else if((score < 80) && (score >= 70)) {
	System.out.println("������ C�Դϴ�.");
}else if((score < 70) && (score >= 60)) {
	System.out.println("������ D�Դϴ�.");
}else {
	System.out.println("������ F�Դϴ�.");
	System.out.println("����� �ٶ��ϴ�.");
}
*/

