/*
 * �����ڿ��� ���� Ŭ������ ������ �ٸ� �����ڸ� ȣ���� ����
 * this() �� ����Ѵ�.
 * 
 * �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ�� ���� ù ��°
 * ���ο� ���;� �Ѵ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass(10);
		TestClass t3 = new TestClass(10, 20);
		
		System.out.printf("t1.a1 : %d\n", t1.a1);
		System.out.printf("t1.a2 : %d\n", t1.a2);
		System.out.printf("t2.a1 : %d\n", t2.a1);
		System.out.printf("t2.a2 : %d\n", t2.a2);
		System.out.printf("t3.a1 : %d\n", t3.a1);
		System.out.printf("t3.a2 : %d\n", t3.a2);
	}
}

class TestClass {
	
	int a1;
	int a2;
	
	TestClass(int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	TestClass(int a1){
		this(a1, 200);
//		this.a1 = a1;
//		this.a2 = 200;
	}
	TestClass(){
		this(100, 200);
//		this.a1 = 100;
//		this.a2 = 200;
	}
}








