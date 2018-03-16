import java.util.Scanner;

/*
 * ����ڿ��� �ֹι�ȣ�� �Է¹޴´�.
 * 
 * �Է¹��� �ֹ� ��ȣ�� �м��Ͽ� ������ ���� ����Ѵ�...
 * 
 * ������� : 1982�� 10�� 10��
 * 
 * ���� : ����
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// �ֹ� ��ȣ�� �Է� �޴´�.
			System.out.print("�ֹι�ȣ �Է�(- ����) : ");
			int [] array = getJuminData2();
//			for(int temp : array) {
//				System.out.println(temp);
//			}
			// �ֹ� ��ȣ�� �м��Ͽ� ������� ������ ���Ѵ�.
			int year = array[0] * 10 + array[1];
			int month = array[2] * 10 + array[3];
			int date = array[4] * 10 + array[5];
			
			switch(array[6]) {
			case 1 :
			case 2 :
				year = year + 1900;
				break;
			case 3 :
			case 4 :
				year = year + 2000;
				break;
			case 9 :
			case 0 :
				year = year + 1800;
			}
			
			String gender = null;
			if(array[6] % 2 == 0) {
				gender = "����";
			} else {
				gender = "����";
			}
			
			// ����� ����Ѵ�.
			System.out.printf("������� : %d�� %d�� %d��\n", year, month, date);
			System.out.printf("���� : %s\n", gender);
			System.out.println("�ֹε�� ���.");
			System.out.println(JuminTrue(array));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// �Է¹��� �ֹι�ȣ�� ���ڷ� ��ȯ�ؼ� �и��� ��
	public static int [] getJuminData1() throws Exception{
		Scanner scan = new Scanner(System.in);
		// �ֹι�ȣ�� ���ڷ� �Է¹޴´�.
		long number = scan.nextLong();
		// �� ������ �ڸ��� ���� ������ �迭�� ��´�.
		int [] array = new int[13];
		// ���� ��
		long a1 = 1000000000000L;
		// 13�� �ݺ��Ѵ�.
		for(int i = 0 ; i < array.length ; i++) {
			// ���� ���� ���ؼ� ��´�.
			array[i] = (int)(number / a1);
			// ���� ����� ���� �������� ���ؼ� ��´�.
			number = number % a1;
			a1 = a1 / 10;
		}
		return array;
	}
	// �Է¹��� �ֹι�ȣ�� ���ڿ� �״�� �и��ϴ� ��
	public static int [] getJuminData2() throws Exception{
		// �ֹι�ȣ�� �Է¹޴´�.
		Scanner scan = new Scanner(System.in);
		String jumin = scan.next();
		// �Է¹��� �ֹ� ��ȣ ���ڿ��� �� ���� �ڵ� ���� �����´�.
		char [] array1 = jumin.toCharArray();	
		int [] array2 = new int[13];
		for(int i = 0 ; i < array1.length ; i++) {
			array2[i] = (int)(array1[i] - '0');
		}
		return array2;
	}
	
	//�ֹε���� �´��� �ȸ´��� Ȯ���ϴ� �޼���..
	public static String JuminTrue(int[] getJuminData2) throws Exception{
		String juminResultMessage = null;
		//�ֹε�Ϲ�ȣ�� �޴´�.
		int[] juminTrue = new int[13];
		for(int i = 0; i < getJuminData2.length; i++) {
			juminTrue[i] = getJuminData2[i];
		}
		//�ֹε�ϰ�� ���ϴº���.
		int juminSum = 0;
		for(int i = 0; i < juminTrue.length - 1; i++) {
			switch (i) {
			case 0:
				juminTrue[0] *= 2;
				break;
			case 1:
				juminTrue[1] *= 3;
				break;
			case 2:
				juminTrue[2] *= 4;
				break;
			case 3:
				juminTrue[3] *= 5;
				break;
			case 4:
				juminTrue[4] *= 6;
				break;
			case 5:
				juminTrue[5] *= 7;
				break;
			case 6:
				juminTrue[6] *= 8;
				break;
			case 7:
				juminTrue[7] *= 9;
				break;
			case 8:
				juminTrue[8] *= 2;
				break;
			case 9:
				juminTrue[9] *= 3;
				break;
			case 10:
				juminTrue[10] *= 4;
				break;
			case 11:
				juminTrue[11] *= 5;
				break;
			
			}
		}
		
		for(int temp : juminTrue) {
			System.out.println(temp);
		}
		//�ֹε�� ���� ���°� �� ���ϱ�..
		for(int i = 0; i < juminTrue.length - 1; i++) {
			juminSum += juminTrue[i];
		}
		//�ֹ� ���� �� % 11
		int juminPer = juminSum % 11;
		//11 - juminPer
		int juminBack = 11 - juminPer;
		//juminBack % 10;
		int juminResult = juminBack % 10;
		
		//�ֹι�ȣ���ڸ��� ����Ѱ��� ������ �ٸ��� ��
		if(juminTrue[juminTrue.length - 1] == juminResult) {
			System.out.println("�´��ֹι�ȣ �Դϴ�.");
			juminResultMessage = "�´��ֹι�ȣ �Դϴ�.";
		}else {
			System.out.println("Ʋ���ֹι�ȣ�Դϴ�.");
			juminResultMessage = "Ʋ���ֹι�ȣ�Դϴ�.";
		}
		return juminResultMessage;
	}
}