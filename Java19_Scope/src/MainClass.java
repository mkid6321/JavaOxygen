/*
 * ������ ��� ����
 * 
 * �ڹٴ� ��� ������(������ ����� ��ġ�� ���� ��ġ������
 * ����� ����)�� ������ �ִ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		t1.testMethod1();
		t1.testMethod2();
		
		t1.testMethod3();
	}

}

class TestClass{
	// �ɹ� ����
	// �ɹ� ������ ���� Ŭ���� ���ζ�� �����Ӱ� ����� 
	// �����ϴ�.
	int a1 = 100;
	int a2 = a1;
	// �ɹ������� ���������� �̸��� ���� ���
	int a100 = 1000;
	
	void testMethod1() {
		System.out.printf("a1 : %d\n", a1);
		// ���� ����(�Ű������� ���������� ����Ѵ�)
		int a3 = 300;
		System.out.printf("a3 : %d\n", a3);
		{
			int a4 = 400;
			System.out.printf("a4 : %d\n", a4);
		}
		// a4 ������ ����� �� �ۿ����� ������ ����� ��
		// ����
		// System.out.printf("a4 : %d\n", a4);
		
		// for���� ���� ����
		// ������� ����� ��ġ�� { } ���̶�� �ϴ���
		// for { } �ȿ��� ����Ȱɷ� ����Ѵ�.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("i : %d\n", i);
		}
		// System.out.printf("i : %d\n", i);
	}
	
	void testMethod2() {
		System.out.printf("a1 : %d\n", a1);
		// testMethod1�� �������� a3 ���
		// a3 ������ �ٸ� �޼����� ���� �����̹Ƿ�
		// ����� �Ұ��ϴ�.
		// System.out.printf("a3 : %d\n", a3);
	}
	
	void testMethod3() {
		// �ɹ������� ������ �̸��� ��������
		int a100 = 2000;
		System.out.printf("a100 : %d\n", a100);
		// ���������� �ɹ������� �̸��� �����Ұ��
		// �ɹ� ������ ����� ���� this�� ����Ѵ�.
		System.out.printf("this.a100 : %d\n", this.a100);
	}
}












