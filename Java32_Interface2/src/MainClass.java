
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������̽��� static final ������ �ڵ忡�� 
		// ����ϸ� �����Ͻ� static final ������ �����
		// �κ��� ���� ������ ���δ� ����ȴ�.
		System.out.printf("Inter1.a1 : %d\n", Inter1.a1);
		System.out.printf("Inter1.a2 : %d\n", Inter1.a2);
	
		TestClass t1 = new TestClass();
		t1.interMethod1();
	}
}
 
interface Inter1{
	// �������̽��� ��� ������ static final ����
	int a1 = 100;
	int a2 = 200;
	// �ڹ� 8�� ���� �����Ǵ°ɷ������� �˴ϴٸ�....;;;;
	// �� �޼���� �������̽��� ������ Ŭ������ �߰��ȴ�.
	// �ڹٿ��� ���� ����� �ʿ��� �� ����ϸ� ���� ���
	// ó�� ����ϴ� ���� �����ϴ�.
	default void interMethod1() {
		System.out.println("Inter1�� �޼���");
	}
}

class TestClass implements Inter1{
	
}










