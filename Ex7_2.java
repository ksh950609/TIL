package ch04_control_if_for.sec08_ex;

import java.util.Scanner;

public class Ex7_2 {
    public static void main(String[] args) {

        //변수
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        Outer: while (true){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            
            switch (sc.nextInt()){
                case 1:
                    System.out.print("예금액> ");
                    balance += sc.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= sc.nextInt();
                    break;
                case 3:
                    System.out.print("잔고> " + balance);
                    break;
                case 4:
                    break Outer;
                default:
            }

            System.out.println();

        }

        System.out.println("프로그램 종료");

        sc.close();


    }
}

