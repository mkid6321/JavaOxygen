
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻� Ŭ������ ��ü ����
		// �߻� Ŭ������ �Ϻ��� ���赵�� �ƴϱ� ������
		// ��ü ������ �Ұ����ϴ�. 
		// SuperClass sc1 = new SuperClass();
		TestClass1 t1 = new TestClass1();
		TestClass2 t2 = new TestClass2();
		JVM.testMethod(t1);
		JVM.testMethod(t2);
	}

}
// �߻�Ŭ������ ��ӹ��� Ŭ����
class TestClass1 extends SuperClass{
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1�� superMethod");
	}
}
class TestClass2 extends SuperClass{
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2�� superMethod");
	}
}









