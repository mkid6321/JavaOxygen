import java.util.Scanner;

/*
 * Scanner : Ű����� �Է� ���� �����͸� ���ϴ� ���·�
 * ��ȯ�ؼ� �������ش�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Ű����� ���� �Է¹޴� ���� ����
			Scanner scan = new Scanner(System.in);
			
			System.out.print("���� �Է� : ");
			int a1 = scan.nextInt();
			System.out.printf("a1 : %d\n", a1);
			
			System.out.print("�Ǽ� �Է� : " );
			double a2 = scan.nextDouble();
			System.out.printf("a2 : %f\n", a2);
			
			System.out.print("���ڿ� �Է� : ");
			String a3 = scan.next();
			System.out.printf("a3 : %s\n", a3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}







