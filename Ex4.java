package ch04_control_if_for.sec08_ex;

public class Ex4 {

	public static void main(String[] args) {
		// 연습문제 : 1 - 100까지 3의 배수의 총 합

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5)
				break;
		}

	}

}

/*
int num1, num2;

do {

    num1 = (int) (Math.random() * 6) + 1;
    num2 = (int) (Math.random() * 6) + 1;
    System.out.println("(" + num1 + ", " + num2 + ")");

} while (num1 + num2 != 5);
*/


/*
int num1 = 0, num2 = 0;

while (num1 + num2 != 5) {
	num1 = (int) ((Math.random() * 6) + 1);
	num2 = (int) ((Math.random() * 6) + 1);
	System.out.println("(" + num1 + "," + num2 + ")");
}
*/

