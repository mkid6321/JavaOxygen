/*
 * ���.
 * 
 * �ٸ� Ŭ������ �����޴� �������� �����ִ� ���� �θ�(Super)
 * ��� �θ��� ���� �޴� ���� �ڽ�(Sub)��� �θ���.
 * 
 * �ڽ��� �θ�κ��� �������� ��� �ɹ��� �ڱ� ��ó�� ���
 * �� �� �ִ�.
 * 
 * �ڵ��� �ߺ��� �ּ�ȭ�ϴµ� ���� �������� �����̴�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		System.out.printf("sub.a1 : %d\n", sub.a1);
		System.out.printf("Sub.a2 : %d\n", sub.a2);
		sub.subMethod();
		sub.superMethod();
		sub.subMethod2();
	}
}
// �θ� Ŭ����
class SuperClass{
	int a1 = 10;
	
	void superMethod() {
		System.out.println("SuperClass�� �޼���");
	}
}
// �ڽ� Ŭ����
class SubClass extends SuperClass{
	int a2 = 20;
	
	void subMethod() {
		System.out.println("SubClass�� �޼���");
	}
	
	void subMethod2() {
		// �θ� ���ǵǾ� �ִ� �ɹ��� ����Ѵ�.
		System.out.printf("a1 : %d\n", a1);
		superMethod();
	}
}








