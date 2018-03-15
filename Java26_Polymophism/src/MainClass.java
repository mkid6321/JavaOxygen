/*
 * ������. ��ü�� �ּҰ��� �θ�Ŭ������ ���������� ���� �� 
 * �ִ� ����
 * 
 * �θ�Ŭ������ ���������� ���� ȣ���� �޼��尡 �ڽ�Ŭ��������
 * Overriding�Ǿ� ���� ��� �ڽ� Ŭ������ �޼��尡 ȣ��ȴ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ���� : SuperClass, ���� ���� : SuperClass
		SuperClass sc1 = new SuperClass();
		System.out.printf("sc1.superMember : %d\n", sc1.superMember);
		sc1.superMethod();
		// ��ü ���� : SubClass, ���� ���� : SubClass
		SubClass sub1 = new SubClass();
		System.out.printf("sub1.superMember : %d\n", sub1.superMember);
		System.out.printf("sub1.subMember : %d\n", sub1.subMember);
		sub1.superMethod();
		sub1.subMethod();
		// ��ü ���� : SuperClass, ���� ���� : SubClass
		// �Ұ�
		// �θ�Ŭ������ ������ ���� ��ü�� �ּҰ��� �ڽ�
		// �� ���������� ���� �� ����.
		// �ڽ��� � Ŭ���������� �𸣱� �����̴�.
		// SubClass sub2 = new SuperClass();
		// ��ü ���� : SubClass, ���� ���� : SuperClass
		// �ڽ�Ŭ������ ��ü�ȿ��� �θ�Ŭ������ ��ü �κ���
		// �ֱ� ������ ����
		SuperClass sc2 = new SubClass();
		System.out.println("sc2.superMember : " + sc2.superMember);
		sc2.superMethod();
		// �θ�Ŭ������ ���������� �θ�Ŭ���� ������ �����
		// ����. SuperClass�� ���� ���� �ȿ��� SuperClass��
		// ������ ���� ��ü�� �ּҰ��� ������ �ְ� 
		// SuperClass�� ��ӹ��� ��ü�� �ּҰ��� �� ����
		// �ֱ� ������ �ƿ� SuperClass ������ ������ �� 
		// �ֵ��� �ϰ� �ִ�.
//		System.out.println("sc2.subMember : " + sc2.subMember);
//		sc2.subMethod();
		
		sc2.testMethod();
	}
}

class SuperClass{
	int superMember = 100;
	
	void superMethod() {
		System.out.println("SuperClass�� superMethod");
	}
	
	void testMethod() {
		System.out.println("SuperClass�� testMethod");
	}
}

class SubClass extends SuperClass{
	int subMember = 200;
	
	void subMethod() {
		System.out.println("SubMethod�� subMethod");
	}
	// SuperClass�� testMethod�� �������̵��Ѵ�.
	void testMethod() {
		System.out.println("SubMethod�� testMethod");
	}
}









