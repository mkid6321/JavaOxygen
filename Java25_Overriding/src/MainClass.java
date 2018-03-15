/*
 * 메서드의 오버라이딩
 * 
 * 부모클래스의 메서드를 자식 클래스에서 재정의하는 개념
 * 
 * 상속, 다형성, 접근제한자, 중첩클래스, 이벤트처리, 
 * 추상클래스, 인터페이스 등 다양한 개념의 기본이 된다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		sub.testMethod1();
		sub.testMethod2();
	}
}

class SuperClass{
	void testMethod1() {
		System.out.println("SuperClass의 testMethod1");
	}
	
	void testMethod2() {
		System.out.println("SuperClass의 testMethod2");
	}
}

class SubClass extends SuperClass{
	// 부모클래스의 메서드를 overriding 한다.
	void testMethod1() {
		// 부모에 정의된 메서드를 호출하고 싶다면
		// super로 접근한다.
		super.testMethod1();
		System.out.println("SubClass의 testMethod1");
	}
	// source > override/implements methods
	@Override
	void testMethod2() {
		// TODO Auto-generated method stub
		super.testMethod2();
		System.out.println("SubClass의 testMethod2");
	}
	
}










