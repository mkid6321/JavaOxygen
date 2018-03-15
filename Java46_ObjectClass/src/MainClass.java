/*
 * java.lang.Object
 * 
 * �ڹٿ��� ��ü�� ������ �Ҹ꿡 ���� �κ��� �����Ǿ� �ִ� 
 * ���� �ֿ��� Ŭ����
 * 
 * �ڹٿ��� ��� Ŭ������ ������������ object�� ��ӹް� �ִ�.
 * �ڹ��� ��� Ŭ������ �� ���� �θ�Ŭ������ �ش��Ѵ�.
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		//�ڹٿ��� �θ�Ŭ������ ������� ������
		//Object�� �ڵ����� ��� �޴´�..
		Object obj1 = new TestClass1();
		Object obj2 = new TestClass2();
		System.out.printf("obj1 : %s\n",obj1);
		System.out.printf("obj2 : %s\n",obj2);
		
		TestClass3 t3 = new TestClass3();
		System.out.printf("t3 : %s\n",t3);
		
		
		
	}
}

class TestClass1{
	
}

class TestClass2{
	//�ȴ�!
	public String toString() {
		System.out.println("�׽�Ʈ~");
		return "TestClass2�� ��ü�Դϴ�.";
	}
}

class TestClass3{
	@Override
	//��ü�� ����Ҷ� toString �޼��带 ȣ���Ͽ�
	//��ȯ�ϴ� ���ڿ��� ���
	//���� ������ ��ü�� ����(��� ������ ����Ǿ� �ִ� ����)�� ����Ҷ� ���.
	public String toString() {
		System.out.println("�׽�Ʈ~");
		return "TestClass3�� ��ü�Դϴ�.";
	}
	
	
}