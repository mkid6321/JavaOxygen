/*
 * ���� 
 * 
 * �����ڰ� �ʿ信 ���� ����� ����ϴ� ������
 * �⺻�ڷ���(Primitive Type)
 * ������ �ڷ��� : byte, short, int, long
 * ������ �ڷ��� : char
 * �Ǽ��� �ڷ��� : double, float
 * ���� �ڷ��� : boolean
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		byte a1;
		short a2;
		int a3;
		long a4;
		
		int a10, a11, a12;
		
		// ������ ���� �����Ѵ�.
		a1 = 100;
		System.out.println("a1 : " + a1);
		
		// ������ ����� ���ÿ� ���� �����Ѵ�.(�ʱ�ȭ)
		int a20 = 200;
		System.out.println("a20 : " + a20);
		// ������ ��� �ڵ����� ����ȯ�� �Ͼ��.
		a1 = 100;			// 4byte -> 1byte
		a2 = 200;			// 4byte -> 2byte
		a3 = 300;			// 4byte -> 4byte
		a4 = 400;			// 4byte -> 8byte
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println("a4 : " + a4);
		// 1byte �������� ���� �� ���� ���̱� ������
		// �ڵ����� ����ȯ�� �߻����� �ʴ´�.
		// a1 = 1000000;
		int a100 = 100;
		// ū �������� ���� ���� �����ҿ� ������
		// ���� ������� ������ �߻��Ѵ�.
		// ���� �������� ��������� ����ȯ�� ����� �Ѵ�.
		byte a200 = (byte)a100;
		System.out.println("a200 : " + a200);
		int a300 = 10000;
		byte a400 = (byte)a300;
		System.out.println("a400 : " + a400);
		// �Ǽ��� �ڷ����� �ڵ����� ����ȯ�� ���� �ʴ´�.
		float f1 = 11.11F;
		double d1 = 22.22;
		System.out.println("float : " + f1);
		System.out.println("double : " + d1);
		// ����
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("boolean : " + b1);
		System.out.println("boolean : " + b2);
		// ������
		char c1 = 'A';
		char c2 = 65;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}
}






