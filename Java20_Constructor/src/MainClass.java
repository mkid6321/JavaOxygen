/*
 * ������
 * Ŭ������ ���� ��ü�� �����ϸ� ������ ȣ��Ǵ� ���
 * ��ü ���� �� �ݵ�� �����ؾ� �ϴ� �ڵ尡 �ִٸ�
 * �����ڿ� ����� �ȴ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		System.out.printf("t1 : %s\n", t1);
		// TestClass2�� �Ű� ������ ���� �����ڰ� �����Ƿ�
		// �����߻�
//		TestClass2 t2 = new TestClass2();
//		System.out.printf("t2 : %s\n", t2);
		TestClass2 t3 = new TestClass2(100);
		System.out.printf("t3 : %s\n", t3);
		
		TestClass3 t4 = new TestClass3(100, 200);
		TestClass3 t5 = new TestClass3(1000, 2000);
		System.out.printf("t4.a1 : %d\n", t4.a1);
		System.out.printf("t4.a2 : %d\n", t4.a2);
		System.out.printf("t5.a1 : %d\n", t5.a1);
		System.out.printf("t5.a2 : %d\n", t5.a2);
	}
}
// �����ڸ� ������ ���� Ŭ����
class TestClass{
	// �����ڸ� ������ ������ �����Ͻ� ������ ����
	// �⺻ �����ڰ� �ڵ����� �߰��ȴ�.
	/*
	TestClass(){
		
	}
	*/
}
// �����ڸ� ������ �ִ� Ŭ����
class TestClass2{
	
	TestClass2(int a){
		System.out.printf("TestClass2�� ������ : %d\n", a);
	}
}

class TestClass3{
	int a1;
	int a2;
	
	TestClass3(int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	
}









