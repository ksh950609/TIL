package ch04_control_if_for.sec02;

public class SwitchString {

	public static void main(String[] args) {
		// switch �� ���ڿ�
		String position = "����";

		switch (position) {
			case "����":
				System.out.println("700����");
				break;
			case "����":
				System.out.println("500����");
				break;
			default:
				System.out.println("300����");
		}

	}

}
