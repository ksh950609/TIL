package ch04_control_if_for.sec03;

public class For {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {  // �ݺ� Ƚ�� ���� : 10ȸ �ݺ�
			// �ݺ� ����Ǵ� ����
			System.out.println("�ȳ�" + i);
		} // for �� �ȿ��� ����� i�� for �� �ȿ����� ��� ����
		// for �� �ۿ����� ��� �Ұ�
		
		
		System.out.println("----------------");
		int j;   // main()�� ����� ���� : main() �� ��� ������ ��� ����
		for(j = 1; j<=10; j++)  {
			System.out.println(j);
		} // j ��� ����
		
		System.out.println("j : " + j);
		
		System.out.println("----------------");
		
		// 1 ~ 100 ������ ��
		
		int i;
		int sum = 0;  // ���ϱ� ���꿡�� sum�� ����� ���̹Ƿ� �ݵ�� �ʱ�ȭ�ؾ� ��
		
		for(i=1;  i<=10; i++) {
			// ���ϱ�
			//sum = sum + i; // +1, +2, +3, .... +10
			sum += i;
		}
		
		System.out.println("1 ~ " + (i - 1)  + " �� : " + sum);
		// ���� i ���� 11�� �Ǿ� �����Ƿ� 10�� ������ �ϱ� ���ؼ� -1 ����

	}

}
















