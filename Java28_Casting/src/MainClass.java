/*
 * 형변환. 타입이 서로 다른 자료형에 값을 담을 때
 * 타입이 변환되는 현상
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1 = new TestClass1();
		TestClass2 tc2 = new TestClass2();
		TestClass3 tc3 = new TestClass3();
		mainMethod(tc1);
		mainMethod(tc2);
		mainMethod(tc3);
	}
	
	static void mainMethod(Object obj) {
		if(obj instanceof TestClass1) {
			TestClass1 tc10 = (TestClass1)obj;
			tc10.testMethod1();
		} else if(obj instanceof TestClass2) {
			if(obj instanceof TestClass3) {
				TestClass3 tc30 = (TestClass3)obj;
				tc30.testMethod3();
			} else {
				TestClass2 tc20 = (TestClass2)obj;
				tc20.testMethod2();
			}
		}
	}
}
// Object를 상속 받은 클래스
class TestClass1{
	void testMethod1() {
		System.out.println("TestClass1의 메서드");
	}
}
class TestClass2{
	void testMethod2() {
		System.out.println("TestClass2의 메서드");
	}
}
class TestClass3 extends TestClass2{
	void testMethod3() {
		System.out.println("TestClass3의 메서드");
	}
}





