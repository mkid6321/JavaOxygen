/*
 * final : �����̶�� ���� ������ �ִ� Ű����
 * ���� : ������ �� ������ �Ұ�
 * �޼��� : �������̵��� �Ұ�
 * Ŭ���� : ����� �Ұ�
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
// final ���� ����
// final ������ ����� ���ÿ� �ʱ�ȭ�� �ϰų�
// �����ڿ��� �ʱ�ȭ�� ����� �Ѵ�.
class TestClass{
	// final ����
	final int a1 = 100;
	final int a2;
	
	TestClass(){
		a2 = 200;
	}
	
	void testMethod() {
		// final ������ �� ���� ���� �ٽ� �����ϴ� ���� �Ұ�
		a1 = 1000;
		a2 = 2000;
	}
}
// final �޼��� ����
// final �޼���� �������̵��� �Ұ����ϴ�.
class SuperClass1{
	void superMethod1() {
		
	}
	final void superMethod2() {
		
	}
}

class SubClass1 extends SuperClass1{
	// �Ϲ� �޼��带 �������̵�(����)
	void superMethod1() {
		
	}
	// final �޼��带 �������̵�(�Ұ�)
	void superMethod2() {
		
	}
}
// final class : ��� �Ұ�
final class SuperClass2{
	
}
class SubClass2 extends SuperClass2{
	
}










