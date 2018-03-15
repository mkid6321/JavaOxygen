/*
 * 다형성의 예
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1 = new TestClass1();
		JVM.testMethod(tc1);
		
		TestClass2 tc2 = new TestClass2();
		JVM.testMethod(tc2);
	}
}
// JVM을 만들때 같이 만든 클래스를 상속받은 클래스
class TestClass1 extends SuperClass{
	void superMethod() {
		System.out.println("TestClass1의 메서드");
	}
}
class TestClass2 extends SuperClass{
	void superMethod() {
		System.out.println("TestClass2의 메서드");
	}
}






