/*
 * �ɹ� �޼���
 * 
 * C����� �Լ��� �����ϴ�. �ڹٿ����� ��� �޼���� 
 * �ݵ�� Ŭ���� ���ο����� �ۼ��� �����ϴ�.
 * 
 * �����ڰ� ���� �ڵ带 �׷�ȭ�Ͽ� ������ �� �ִ� ����
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ������ ������ �޼���� ��ü�� ������ ��
		// ���������� ���ؼ� ȣ���� �� �ִ�.
		TestClass t1 = new TestClass();
		t1.testMethod1();
		// ��ȯ���� �����ϴ� �޼��带 ȣ��
		int a1 = t1.testMethod2();
		System.out.printf("a1 : %d\n", a1);
		
		DataClass dc2 = t1.testMethod3();
		System.out.printf("dc2.value1 : %d\n", dc2.value1);
		System.out.printf("dc2.value2 : %d\n", dc2.value2);
		
		t1.testMethod4();
		
		// �Ű������� ������ �ִ� �޼��� ȣ��
		t1.testMethod5(100);
		t1.testMethod5(200);
		
		DataClass dc3 = new DataClass();
		dc3.value1 = 1000;
		dc3.value2 = 2000;
		t1.testMethod6(500, 55.55, dc3);
	}
}

class TestClass{
	// �⺻ �޼���
	void testMethod1() {
		System.out.println("testMethod1");
	}
	// ��ȯ Ÿ�� : �޼����� ������ ������ �޼��带
	// ȣ���ϴ� ������ ���� �����Ѵ�.
	// ���� ���� ��ȯ�ϴ� �޼���
	int testMethod2() {
		System.out.println("testMethod2");
		return 100;
	}
	// ��ü�� �ּҰ��� ��ȯ�ϴ� �޼���
	DataClass testMethod3() {
		System.out.println("testMethod3");
		DataClass dc1 = new DataClass();
		dc1.value1 = 100;
		dc1.value2 = 200;
		return dc1;
	}
	// return �� : �޼����� �ڵ� ������ �ߴ��ϰ�
	// �޼��带 ȣ���� ������ ���ư��ٴ� �ǹ�
	// �ΰ� ������� ���� ������ �� �ִ�.
	void testMethod4() {
		System.out.println("testMethod4 ����");
		int a1 = 10;
		if(a1 < 20) {
			return;
		}
		System.out.println("testMethod4 ����");
	}
	// �Ű� ����
	void testMethod5(int a1) {
		System.out.println("testMethod5");
		System.out.printf("�Ű����� a1 : %d\n", a1);
	}
	void testMethod6(int a1, double a2, DataClass a3) {
		System.out.println("testMethod6");
		System.out.printf("�Ű����� a1 : %d\n", a1);
		System.out.printf("�Ű����� a2 : %f\n", a2);
		System.out.printf("�Ű����� a3.value1 : %d\n", a3.value1);
		System.out.printf("�Ű����� a3.value2 : %d\n", a3.value2);
	}
}

class DataClass{
	int value1;
	int value2;
}









