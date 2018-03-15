/*
 * 인터페이스
 * 
 * 인터페이스는 개발자 만드는 클래스를 다양한 형태로
 * 사용하고자 하기위해 사용하는 개념
 * 
 * 객체는 구현한 인터페이스형 참조변수에 담을 수 있다
 * 
 * 자바는 단일 상속만 지원하기 때문에 하나의 클래스는 하나의
 * 부모클래스만 가질 수 있다. 하나의 클래스에서 여러개를
 * 구현하고자할 때 사용하는 것이 인터페이스.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		JVM.testMethod1(t1);
		
		TestClass2 t2 = new TestClass2();
		JVM.testMethod2(t2);
		JVM.testMethod3(t2);
		
		TestClass3 t3 = new TestClass3();
		JVM.testMethod1(t3);
		JVM.testMethod2(t3);
		JVM.testMethod3(t3);
		
		TestClass4 t4 = new TestClass4();
		JVM.testMethod1(t4);
		JVM.testMethod2(t4);
		JVM.testMethod3(t4);
	}

}
// 인터페이스를 구현한 클래스
// 클래스는 하나 이상의 인터페이스를 구현할 수 있다.
class TestClass1 implements Inter1{
	@Override
	public void interMethod1() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 interMethod1");
	}
}
class TestClass2 implements Inter2, Inter3{
	@Override
	public void interMethod3() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2의 interMehtod3");
	}
	@Override
	public void interMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2의 interMethod2");
	}
}
class TestClass3 implements Inter1, Inter2, Inter3{
	public void interMethod3() {
		System.out.println("TestClass3의 interMethod3");
	}
	public void interMethod2() {
		System.out.println("TestClass3의 interMethod2");
	}
	public void interMethod1() {
		System.out.println("TestClass의 interMethod1");
	}
}
// 인터페이스를 상속받은 인터페이스
interface InterTotal extends Inter1, Inter2, Inter3{
	
}
class TestClass4 implements InterTotal{
	public void interMethod1() {
		System.out.println("TestClass4의 interMethod1");
	}
	public void interMethod2() {
		System.out.println("TestClass4의 interMethod2");
	}
	public void interMethod3() {
		System.out.println("TestClass4의 interMethod3");
	}
}










