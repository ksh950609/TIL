package ch04_control_if_for.sec01;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Á¤¼ö ÀÔ·Â : ");
		num = sc.nextInt();
		
		if(num %2 == 1)
			System.out.println("È¦¼ö");
		else
			System.out.println("Â¦¼ö");
		
		sc.close();
	}

}
