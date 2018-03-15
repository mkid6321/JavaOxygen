/*
 * super : �θ�Ŭ���� ����Ű�� Ű����
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		sub.testMethod1();
		
		SubClass3 sub2 = new SubClass3();
		
	}
}

class SuperClass{
	int a1 = 100;
}
class SubClass extends SuperClass{
	// �θ�Ŭ������ �ɹ� ������ ������ �̸��� ����
	int a1 = 200;
	
	void testMethod1() {
		//�ɹ� ������ ������ �̸��� ��������
		int a1 = 300;
		// �������� a1�� ���
		System.out.printf("a1 : %d\n", a1);
		// �ɹ����� a1�� ���
		System.out.printf("this.a1 : %d\n", this.a1);
		// �θ��� ���� a1�� ���
		System.out.printf("super.a1 : %d\n", super.a1);
	}
}
/*
 * Ŭ������ ��ü�� �����ϰ� �Ǹ� �����ڰ� �ڵ����� ȣ��ȴ�.
 * �� ��, �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ带 �ۼ�����
 * ������ �ڵ����� �θ�Ŭ������ �⺻�����ڰ� ȣ��ȴ�.
 */
class SuperClass1{
	SuperClass1(){
		System.out.println("SuperClass1�� �⺻ ������");
	}
}
class SubClass1 extends SuperClass1{
	SubClass1(int a2){
		System.out.println("SubClass1�� ������");
		System.out.printf("a2 : %d\n", a2);
	}
}
class SubClass2 extends SubClass1{
	// �θ�Ŭ������ �⺻ �����ڰ� ���ٸ� �����ڿ��� 
	// ����Ŭ������ �����ڸ� ��������� ȣ���ؾ� �Ѵ�.
	// ��������� ȣ������ ������ �⺻ �����ڸ� ȣ���Ϸ���
	// �õ��ϱ� �����̴�.
	SubClass2(){
		super(100);
		System.out.println("SubClass2�� �⺻ ������");
	}
	// �Ű� ������ ������ �ִ� ������
	SubClass2(int a1){
		super(a1);
		System.out.println("SubClass2�� �� ��° ������");
		System.out.printf("a1 : %d\n", a1);
	}
}
class SubClass3 extends SubClass2{
	SubClass3(){
		// �θ��� �⺻ �����ڰ� �ƴ� �ٸ� �����ڸ� �����Ѵ�.
		super(100);
		System.out.println("SubClass3�� �⺻ ������");
	}
}











