package ch04_control_if_for.sec08_ex;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// ����, ���, �ܰ�, ���� 
		Scanner sc=new Scanner(System.in);
		int menuNum=0, balance=0;		
		
		while(menuNum!=4) { 
			System.out.println("--------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------");
			
			System.out.print("����> ");
			menuNum=sc.nextInt();

			 switch (menuNum){
             case 1:
                 System.out.print("���ݾ�> ");
                 balance += sc.nextInt();
                 break;
             case 2:
                 System.out.print("��ݾ�> ");
                 balance -= sc.nextInt();
                 break;
             case 3:
                 System.out.println("�ܰ�> " + balance);
                 break;      
         }
		}

         System.out.println("���α׷� ����");

		
		sc.close();
	}

}
