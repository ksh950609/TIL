package ch04_control_if_for.sec01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfNestedEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, qty, price, amount, discount, total;
		String prdName;
		
		System.out.println("******** 상품 정보 ********");
		System.out.println("1 노트북 : 1,200,000원");
		System.out.println("2 디지털 카메라 : 400,000원");
		System.out.println("*************************");
		
		System.out.print("상품번호 입력 : ");
		num = sc.nextInt();
		
		// 1도 아니고 2도 아닌 경우
		if(num != 1 && num != 2) { // 잘못 입력한 경우
			System.out.println("잘못 입력하였습니다.\n종료합니다.");
		}else { // 제대로 입력한 경우
			//주문수량 입력 
			System.out.print("주문수량 입력 : ");
			qty = sc.nextInt();
			
			// 입력한 번호에 따라 상품명과 가격 설정
			if(num == 1) {
				prdName = "노트북";
				price = 1200000;
			}else {
				prdName = "디지털카메라";
				price = 400000;
			}
			
			// 계산
			//1. 주문액
			amount = price * qty;
			
			//2. 할인액
			if(amount >= 1000000)
				discount = (int)(amount * 0.1);
			else if(amount >= 500000)
				discount = (int)(amount * 0.05);
			else
				discount = 0;
			
			// discount 선언 시 0으로 초기화하면 마지막 else 문 없어도 됨
			
			//3. 총지불액 
			total = amount - discount;
			
			DecimalFormat df = new DecimalFormat("#,###");
			
			// 전체 주문 내용 출력 
			System.out.println("******** 주문 내용 ********");
			System.out.println("상품명 : " + prdName);
			System.out.println("가격 : " + df.format(price) + " 원");
			System.out.println("주문수량 : " + qty + " 개");
			System.out.println("주문액 : " + df.format(amount) + " 원");
			System.out.println("할인액 : " + df.format(discount) + " 원");
			System.out.println("총지불액 : " + df.format(total) + " 원");
		}

		sc.close();
	}

}
