package ch04_control_if_for.sec03;

public class ForNested2 {

	public static void main(String[] args) {
		// ��ø for ��
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan + "��");
			
			for(int n=1; n<=9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan*n));
			}
			
			System.out.println();
		}

	}

}



�������� ������