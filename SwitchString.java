package ch04_control_if_for.sec02;

public class SwitchString {

	public static void main(String[] args) {
		// switch 문 문자열
		String position = "과장";

		switch (position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		}

	}

}
