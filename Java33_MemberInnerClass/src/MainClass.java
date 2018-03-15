/*
 * �ɹ� ��ø Ŭ���� ����
 * Ŭ���� �ȿ� �ִ� Ŭ������ �ǹ��ϸ� ���� Ŭ������
 * �ܺ�Ŭ������ ��ü�� ���ؼ��� ��ü�� ������ �� �ִ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataClass1 dc1 = new DataClass1();
		
		TestClass1 t1 = new TestClass1(dc1);
		t1.testMethod1();
		
		TestClass2 t2 = new TestClass2();
		t2.testMethod2(dc1);
		// ��øŬ���� ��ü ����
		OuterClass1 oc1 = new OuterClass1();
		OuterClass1.InnerClass in2 = oc1.new InnerClass();
		in2.innerMethod1();
		
	}
}
// ��ø Ŭ������ ������� �ʴ� ��
class DataClass1{
	int a1 = 100;
}
// �����ڷ� �޴� ���
class TestClass1{
	DataClass1 dc1;
	
	TestClass1(DataClass1 dc1){
		this.dc1 = dc1;
	}
	void testMethod1() {
		System.out.printf("TestClass1 : %d\n", dc1.a1);
	}
}
// �޼��带 ���� �޴� ���
class TestClass2{
	
	void testMethod2(DataClass1 dc1) {
		System.out.printf("TestClass2 : %d\n", dc1.a1);
	}
}
// �ɹ� ��ø Ŭ������ ���
class OuterClass1{
	int a1 = 100;
	
	class InnerClass{
		
		int a2 = 200;
		
		void innerMethod1() {
			System.out.printf("a1 : %d\n", a1);
		}
	}
	
	void outerMethod1() {
		// OuterClass�� InnerClass�� ��ü�� �����Ǿ� 
		// �ִٴ� ���� ������� �� ���� ������ �ɹ� ���Ұ�
		// System.out.printf("a2 : %d\n",  a2);
		InnerClass in1 = new InnerClass();
		System.out.printf("in1.a2 : %d\n", in1.a2);
	}
}













