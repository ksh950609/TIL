package ch04_control_if_for.sec08_ex;

import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {

        //����
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run){
            System.out.println("------------------------------");
            System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
            System.out.println("------------------------------");
            System.out.print("����> ");
            
            switch (sc.nextInt()){
                case 1:
                    System.out.print("���ݾ�> ");
                    balance += sc.nextInt();
                    break;
                case 2:
                    System.out.print("��ݾ�> ");
                    balance -= sc.nextInt();
                    break;
                case 3:
                    System.out.print("�ܰ�> " + balance);
                    break;
                case 4:
                	run = false;
                    break;
                default:
            }

            System.out.println();

        }

        System.out.println("���α׷� ����");

        sc.close();


    }
}

