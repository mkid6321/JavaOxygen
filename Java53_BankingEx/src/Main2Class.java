/*
 * �����̰� ������ �Ѵ�.
 * 
 * 1���� : 100��
 * 
 * 2�������ʹ� ���� �ܰ���� 3�踦 �����Ѵ�.
 * 30���������� �ܰ���� ��� ����Ͻÿ�
 * 
 * �� int ����(�迭)�� ����Ѵ�.
 */
public class Main2Class {

	// �ܰ���� ���� �迭
	static int [] banking = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1����
		banking[banking.length - 1] = 100;
		printBanking(1);
		// 2���� ~ 30����
		for(int i = 2 ; i <= 30 ; i++) {
			// �� �迭�� 4�� ���Ѵ�.
			for(int k = 0 ; k < banking.length ; k++) {
				banking[k] = banking[k] * 4;
			}
			// overflow ó��
			for(int k = banking.length - 1 ; k > 0 ; k--) {
				// 1000���� ���� ���� ���ڸ� �����ҿ� ���Ѵ�.
				banking[k - 1] = banking[k - 1] + (banking[k] / 1000);
				// 1000���� ���� �������� ���� �����ҿ� �����Ѵ�.
				banking[k] = banking[k] % 1000;
			}
			printBanking(i);
		}
	}
	
	public static void printBanking(int date) {
		boolean checkZero = false;
		System.out.printf("%2d���� : ", date);
		
		for(int i = 0 ; i < banking.length ; i++) {
			if(checkZero == false) {
				if(banking[i] == 0) {
					System.out.print("    ");
				} else {
					System.out.printf("%3d", banking[i]);
					checkZero = true;
					if(i == banking.length - 1) {
						System.out.println("��");
 					} else {
 						System.out.print(",");
 					}
				}
			} else {
				System.out.printf("%03d", banking[i]);
				if(i == banking.length - 1) {
					System.out.println("��");
				} else {
					System.out.print(",");
				}
			}
		}
		System.out.println();
	}
}








