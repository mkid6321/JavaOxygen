/*
 * �������̽�
 * 
 * �������̽��� ������ ����� Ŭ������ �پ��� ���·�
 * ����ϰ��� �ϱ����� ����ϴ� ����
 * 
 * ��ü�� ������ �������̽��� ���������� ���� �� �ִ�
 * 
 * �ڹٴ� ���� ��Ӹ� �����ϱ� ������ �ϳ��� Ŭ������ �ϳ���
 * �θ�Ŭ������ ���� �� �ִ�. �ϳ��� Ŭ�������� ��������
 * �����ϰ����� �� ����ϴ� ���� �������̽�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		JVM.testMethod1(t1);
		
		TestClass2 t2 = new TestClass2();
		JVM.testMethod2(t2);
		JVM.testMethod3(t2);
		
		TestClass3 t3 = new TestClass3();
		JVM.testMethod1(t3);
		JVM.testMethod2(t3);
		JVM.testMethod3(t3);
		
		TestClass4 t4 = new TestClass4();
		JVM.testMethod1(t4);
		JVM.testMethod2(t4);
		JVM.testMethod3(t4);
	}

}
// �������̽��� ������ Ŭ����
// Ŭ������ �ϳ� �̻��� �������̽��� ������ �� �ִ�.
class TestClass1 implements Inter1{
	@Override
	public void interMethod1() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1�� interMethod1");
	}
}
class TestClass2 implements Inter2, Inter3{
	@Override
	public void interMethod3() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2�� interMehtod3");
	}
	@Override
	public void interMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2�� interMethod2");
	}
}
class TestClass3 implements Inter1, Inter2, Inter3{
	public void interMethod3() {
		System.out.println("TestClass3�� interMethod3");
	}
	public void interMethod2() {
		System.out.println("TestClass3�� interMethod2");
	}
	public void interMethod1() {
		System.out.println("TestClass�� interMethod1");
	}
}
// �������̽��� ��ӹ��� �������̽�
interface InterTotal extends Inter1, Inter2, Inter3{
	
}
class TestClass4 implements InterTotal{
	public void interMethod1() {
		System.out.println("TestClass4�� interMethod1");
	}
	public void interMethod2() {
		System.out.println("TestClass4�� interMethod2");
	}
	public void interMethod3() {
		System.out.println("TestClass4�� interMethod3");
	}
}










