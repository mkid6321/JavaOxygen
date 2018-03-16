import java.util.Scanner;

/*
 * 	�ֹι�ȣ �Ǻ�
 *  1. ����ڿ��� �ֹι�ȣ�� �Է¹޴´�.
 *  2. �Է¤����� �ֹι�ȣ�� ��� �������� ����ϸ� 13��°
 *		���ڰ� ���´�..
 *  3.�� ���ڸ� ���Ͽ� �ǹٸ� �ֹ� ��ȣ���� Ȯ���Ѵ�... 
 * 
 *  �� �ڸ����� ���� ���ڷ� ���Ѵ�(2,3,4,5,6,7,8,9,2,3,4,5)
 *  ���� ������ ��� ���Ѵ�..
 *	���� ���� 11�� ���� �������� ���Ѵ�
 * 	11�� ���� �������� ����
 * 	�� ���� 10���� ���� �������� ���Ѵ�
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			// �ֹι�ȣ�� �Է� �޴´�..
			System.out.println("�ֹι�ȣ �Է�(- ����) : ");
			String str = scan.next();
			// System.out.println(str);
			// �� �ڸ��� ����..
			char[] array = str.toCharArray();
			int[] array2 = new int[13];
			for (int i = 0; i < array.length; i++) {
				array2[i] = (int) (array[i] - '0');
			}
			for (int a1 : array2) {
				System.out.println(a1);
			}
			// �� �ڸ����� ������ ���ڷ� ���ϸ鼭 �����Ѵ�..
			int[] array3 = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

			int total = 0;
			for (int i = 0; i < 12; i++) {
				total = total + (array2[i] * array3[i]);
			}
			// ������ ���� 11�� ���� �������� ���Ѵ�.
			int mod = total % 11;
			// 11���� ���� �������� ����.
			int result = 11 - mod;
			// �� ���� 10���� ���� �������� ���Ѵ�..
			int result2 = result % 10;
			// ���� �������� ������ ���ڸ� ���Ѵ�..
			if(result2 == array2[12]) {
				//������ �ùٸ� �ֹι�ȣ, �ٸ��� �߸��� �ֹι�ȣ�� ����Ѵ�...
				System.out.println("�ǹٸ� �ֹ� ��ȣ �Դϴ�.");
			}else {
				System.out.println("�߸��� �ֹ� ��ȣ �Դϴ�.");
			}
			// ������ �ùٸ� �ֹι�ȣ
			// �ٸ��� �߸��� �ֹι�ȣ�� ����Ѵ�..
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}