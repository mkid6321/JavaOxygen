/*
 * static
 * 
 * ��ü�� �������� �ʰ� ����� �� �ִ� �ɹ�
 * 
 * static ���� : ��ü ���α׷� ������ ������ ���� ���� 
 * ����
 * 
 * static �޼��� : �ɹ� ���� Ȥ�� �ɹ� �޼��带 �������
 * ���� ���
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static �ɹ��� ��ü�� �������� �ʰ� �����
		// �����ϴ�.
		System.out.printf("TestClass.a2 : %d\n", TestClass.a2);
		TestClass.testMethod2();
		// �Ϲ� �ɹ��� Ŭ������ �̸����� �����ϴ� ���� �Ұ��ϴ�.
//		System.out.println("TestClass.a1 : %d\n", TestClass.a1);
//		TestClass.testMethod1();
	}

}

class TestClass{
	// �Ϲ� �ɹ� ����
	int a1 = 100;
	// static �ɹ� ����
	static int a2 = 200;
	
	// �Ϲ� �޼���
	void testMethod1() {
		System.out.println("testMethod1");
		// �Ϲ� �޼��忡�� static �ɹ��� ����Ѵ�.
		System.out.printf("a2 : %d\n", a2);
		testMethod2();
	}
	// static �޼���
	static void testMethod2() {
		System.out.println("testMethod2");
		// static �޼��忡�� �Ϲ� �ɹ� ����
		// ��ü�� �����Ǿ��ٴ� ���� �Ϻ��ϰ� ������� �� 
		// ���� ������ �Ϲ� �ɹ� ������ �Ұ����ϴ�.
//		System.out.printf("a1 : %d\n", a1);
//		testMethod1();
	}
}












