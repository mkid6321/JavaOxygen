/*
 * ��ü�� �ɹ� ����(�ʵ�)
 * 
 * Ŭ������ �ɹ� ������ �����ϸ� ��ü�� ������ ��
 * �����Ұ� ���������. Ŭ������ ������ ��� �ɹ� ������
 * ��ü���� ���ε��� ������� �����ȴ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		System.out.printf("t1.a1 : %d\n", t1.a1);
		System.out.printf("t1.a2 : %f\n", t1.a2);
		System.out.printf("t1.a3 : %s\n", t1.a3);
		System.out.printf("t1.a4 : %s\n", t1.a4);

		System.out.printf("t1.a5 : %d\n", t1.a5);
		System.out.printf("t1.a6 : %f\n", t1.a6);
		System.out.printf("t1.a7 : %s\n", t1.a7);
		System.out.printf("t1.a8 : %s\n", t1.a8);

		// �ɹ� ������ ���� �����Ѵ�.
		t1.a1 = 500;
		System.out.printf("t1.a1 : %d\n", t1.a1);
		// ���� Ŭ������ ������ ��ü�� ������ٰ� �ϴ���
		// �ɹ� ������ ��ü���� ���� ������� �����ȴ�.
		TestClass t2 = new TestClass();
		TestClass t3 = new TestClass();
		t2.a1 = 1000;
		System.out.printf("t2.a1 : %d\n", t2.a1);
		System.out.printf("t3.a1 : %d\n", t3.a1);
	}

}

class TestClass {
	// ��ü�� �ɹ� ������ ���� �������� ������
	// ��ü�� ������ �� �ڵ����� �ʱ�ȭ�� �̷������.
	// ���� : 0, �Ǽ� : 0.0, boolean : false
	// �������� : null
	int a1;
	double a2;
	boolean a3;
	DataClass a4;
	// �ɹ� ���� ����� �ʱ�ȭ�� �� ���� ����
	int a5 = 100;
	double a6 = 11.11;
	boolean a7 = true;
	DataClass a8 = new DataClass();
}

class DataClass {

}
