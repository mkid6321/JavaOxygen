/*
 * �޼����� �������̵�
 * 
 * �θ�Ŭ������ �޼��带 �ڽ� Ŭ�������� �������ϴ� ����
 * 
 * ���, ������, ����������, ��øŬ����, �̺�Ʈó��, 
 * �߻�Ŭ����, �������̽� �� �پ��� ������ �⺻�� �ȴ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		sub.testMethod1();
		sub.testMethod2();
	}
}

class SuperClass{
	void testMethod1() {
		System.out.println("SuperClass�� testMethod1");
	}
	
	void testMethod2() {
		System.out.println("SuperClass�� testMethod2");
	}
}

class SubClass extends SuperClass{
	// �θ�Ŭ������ �޼��带 overriding �Ѵ�.
	void testMethod1() {
		// �θ� ���ǵ� �޼��带 ȣ���ϰ� �ʹٸ�
		// super�� �����Ѵ�.
		super.testMethod1();
		System.out.println("SubClass�� testMethod1");
	}
	// source > override/implements methods
	@Override
	void testMethod2() {
		// TODO Auto-generated method stub
		super.testMethod2();
		System.out.println("SubClass�� testMethod2");
	}
	
}










