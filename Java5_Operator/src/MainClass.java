/*
 * ������.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������
		int a1 = 10 + 3;
		int a2 = 10 - 3;
		int a3 = 10 * 3;	// Asterisk
		int a4 = 10 / 3;
		int a5 = 10 % 3;
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println("a4 : " + a4);
		System.out.println("a5 : " + a5);
		
		int number = 12345;
		int n1 = number / 10000;
		number = number % 10000;
		int n2 = number / 1000;
		number = number % 1000;
		int n3 = number / 100;
		number = number % 100;
		int n4 = number / 10;
		int n5 = number % 10;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		System.out.println("n5 : " + n5);
		
		// ~ ������ : 2���� 0�� 1��, 1�� 0���� �ٲٴ� ������
		int a6 = 10;
		System.out.println("a6 : " + a6);
		int a7 = ~a6 + 1;
		System.out.println("a7 : " + a7);
		
		int a8 = 10 - 2;
		int a9 = 10 + (~2 + 1);
		System.out.println("a8 : " + a8);
		System.out.println("a9 : " + a9);
		
		// ����Ʈ ������(��Ʈ �̵�)
		int a10 = 8 >> 1;
		int a11 = 8 / 2;
		System.out.println("a10 : " + a10);
		System.out.println("a11 : " + a11);
		// ���������� : ++, --
		int a12 = 10;
		int a13 = 10;
		
		a12 = a12 + 1;
		a13++;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		
		a12 = a12 - 1;
		a13--;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		// ���������ڴ� �ٸ� �����ڿ� ���� ���� ���
		// �ڿ� ������ ���� �������� ����ǰ� �տ� ������
		// ���� ���� ����ȴ�.
		a12 = 10;
		a13 = a12++ + 1;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		
		a12 = 10;
		a13 = ++a12 + 1;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		// �񱳿�����
		int a14 = 10;
		int a15 = 3;
		int a20 = 10;
		boolean a16 = a14 < a15;	// false
		boolean a17 = a14 > a15;	// true
		boolean a18 = a14 <= a20;	// true
		boolean a19 = a14 >= a20;	// true
		boolean a21 = a14 == a15;	// false
		boolean a22 = a14 != a20;	// false
		System.out.println("a16 : " + a16);
		System.out.println("a17 : " + a17);
		System.out.println("a18 : " + a18);
		System.out.println("a19 : " + a19);
		System.out.println("a21 : " + a21);
		System.out.println("a22 : " + a22);
		// �� ������
		// && : ������ ��� true�������� true�̴�.
		boolean a23 = a14 < a15 && a14 == a15;
		System.out.println("a23 : " + a23);
		
		boolean a24 = a14 < a15 && a14 == a20;
		System.out.println("a24 : " + a24);
		
		boolean a25 = a14 == a20 && a14 > a15;
		System.out.println("a25 : " + a25);
		// || : �Ѵ� �����̿��߸� �����̵ȴ�.
		boolean a26 = a14 != a20 || a14 < a15;
		System.out.println("a26 : " + a26);
		// 3�� ������
		// ���ǽ��� ���� ���̸� ��1, �����̸� ��2��
		// ���� ����� �ȴ�.
		// ���ǽ� ? ��1 : ��2
		int a27 = a14 > a15 ? 10 : 3;
		System.out.println("a27 : " + a27);
		
		// ���Կ�����
		int a28 = 10;
		int a29 = 10;
		
		a28 = a28 + 10;
		a29 += 10;
		System.out.println("a28 : " + a28);
		System.out.println("a29 : " + a29);
	}

}





