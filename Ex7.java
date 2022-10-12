package ch04_control_if_for.sec08_ex;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// 예금, 출금, 잔고, 종료 
		Scanner sc=new Scanner(System.in);
		int menuNum=0, balance=0;		
		
		while(menuNum!=4) { 
			System.out.println("--------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------");
			
			System.out.print("선택> ");
			menuNum=sc.nextInt();

			 switch (menuNum){
             case 1:
                 System.out.print("예금액> ");
                 balance += sc.nextInt();
                 break;
             case 2:
                 System.out.print("출금액> ");
                 balance -= sc.nextInt();
                 break;
             case 3:
                 System.out.println("잔고> " + balance);
                 break;      
         }
		}

         System.out.println("프로그램 종료");

		
		sc.close();
	}

}
