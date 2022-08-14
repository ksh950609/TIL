package ch04_control_if_for.sec01;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, max;
		
		System.out.print("숫자 1 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자 2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("숫자 3 입력 : ");
		num3 = sc.nextInt();

		if ((num1 > num2) && (num1 > num3))
			max = num1;
		else if (num2 > num3)   // else로 넘어온 것은 num1이 가장큰 수가 아니라는 의미. 따라서 num1과의 비교 불필요.
			max = num2;
		else
			max = num3;
		
		
		System.out.println("가장 큰 수 : " + max);
		
		sc.close();
	}

}

/*
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int num1, num2, num3;
	
	System.out.print("숫자 1 입력 : ");
	num1 = sc.nextInt();
	
	System.out.print("숫자 2 입력 : ");
	num2 = sc.nextInt();
	
	System.out.print("숫자 3 입력 : ");
	num3 = sc.nextInt();

	if ((num1 > num2) && (num1 > num3))
		System.out.println("가장 큰 수 : " + num1);
	else if (num2 > num3)   // else로 넘어온 것은 num1이 가장큰 수가 아니라는 의미. 따라서 num1과의 비교 불필요.
		System.out.println("가장 큰 수 : " + num2);
	else
		System.out.println("가장 큰 수 : " + num3);
	
	sc.close();
}
*/