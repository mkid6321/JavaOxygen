import java.util.Scanner;

/*
 * ����ڿ��� 0�� �Է¹��� �� ���� �����Ͽ�
 * �� ���� ����Ѵ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			// ����ڰ� �Է��� ��
			int number = 0;
			// ������ ������ �ִ� ����
			int total = 0;
			// 1. ����ڰ� 0�� �Է��� �� ���� �ݺ�
			do {
			//    1.1 ����ڿ��� ���ڸ� �Է¹޴´�.
				System.out.print("���� : ");
				number = scan.nextInt();
			//    1.2 �Է¹��� ���ڰ� 0�� �ƴϸ� ����
				if(number != 0) {
					total = total + number;
					// total += number;
				}
			} while(number != 0);
			// 2. ������ ����Ѵ�.
			System.out.printf("���� : %d\n", total);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}







