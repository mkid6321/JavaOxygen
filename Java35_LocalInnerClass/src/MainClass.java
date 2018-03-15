/*
 * ���� ��ø Ŭ���� : �޼��� �ȿ��� Ŭ������ �����
 * �޼��忡���� ����ϴ� �����̴�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethod();
		// ���� ��ø Ŭ������ �޼��� �������� ����� ����
		// �ϱ� ������ �ٸ� �޼��忡���� ���� ������ 
		// �𸥴�.
		// LocalClass1 lc2 = new LocalClass1();
		
		testMethod2();
		testMethod3();
		testMethod4();
	}
	
	static void testMethod() {
		// ���� ��ø Ŭ����
		class LocalClass1{
			void localMethod1() {
				System.out.println("LocalClass1");
			}
		}
		LocalClass1 lc1 = new LocalClass1();
		lc1.localMethod1();
	}
	
	static void testMethod2() {
		TestClass2 t2 = new TestClass2();
		Friday fire = new Friday();
		t2.testMethod1(fire);
		t2.testMethod2(fire);
		t2.testMethod3(fire);
	}
	static void testMethod3() {
		TestClass2 t2 = new TestClass2();	
		
		class InnerClass2 extends DataClass1 implements DataInter1, DataInter2{
			public void dataInterMethod2() {
				System.out.println("InnerClass2�� dataInterMethod2");
			}
			public void dataInterMethod1() {
				System.out.println("InnerClass2�� dataInterMethod1");
			}
			void dataMethod1() {
				System.out.println("InnerClass2�� dataMethod1");
			}
		}
		InnerClass2 ic2 = new InnerClass2();
		t2.testMethod1(ic2);
		t2.testMethod2(ic2);
		t2.testMethod3(ic2);
	}
	// �͸� ��ø Ŭ���� ����
	static void testMethod4() {
		TestClass2 t2 = new TestClass2();
		
		t2.testMethod1(new DataClass1() {
			void dataMethod1() {
				System.out.println("�͸� dataMethod1()");
			}
		});
		
		t2.testMethod2(new DataInter1() {
			public void dataInterMethod1() {
				System.out.println("�͸� dataInterMethod1");
			}
		});
		
		t2.testMethod3(new DataInter2() {
			public void dataInterMethod2() {
				System.out.println("�͸� dataInterMethod2");
			}
		});
		
		DataInter2 di2 = new DataInter2() {
			public void dataInterMethod2() {
				System.out.println("�͸� dataInterMethod2-2");
			}
		};
		t2.testMethod3(di2);
	}
}
// ������øŬ���� ��� ��
abstract class DataClass1{
	abstract void dataMethod1();
}
interface DataInter1{
	void dataInterMethod1();
}
interface DataInter2{
	void dataInterMethod2();
}
class TestClass2{
	void testMethod1(DataClass1 dc1) {
		dc1.dataMethod1();
	}
	void testMethod2(DataInter1 di1) {
		di1.dataInterMethod1();
	}
	void testMethod3(DataInter2 di2) {
		di2.dataInterMethod2();
	}
}

class Friday extends DataClass1 implements DataInter1, DataInter2{
	public void dataInterMethod2() {
		System.out.println("dataInterMethod2");
	}
	public void dataInterMethod1() {
		System.out.println("dataInterMethod1");
	}
	void dataMethod1() {
		System.out.println("dataMethod1");
	}
	
}















