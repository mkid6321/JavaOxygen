/*
 * �������� ��
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1 = new TestClass1();
		JVM.testMethod(tc1);
		
		TestClass2 tc2 = new TestClass2();
		JVM.testMethod(tc2);
	}
}
// JVM�� ���鶧 ���� ���� Ŭ������ ��ӹ��� Ŭ����
class TestClass1 extends SuperClass{
	void superMethod() {
		System.out.println("TestClass1�� �޼���");
	}
}
class TestClass2 extends SuperClass{
	void superMethod() {
		System.out.println("TestClass2�� �޼���");
	}
}






