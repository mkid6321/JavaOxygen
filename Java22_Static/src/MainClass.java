/*
 * static
 * 
 * 객체를 생성하지 않고 사용할 수 있는 맴버
 * 
 * static 변수 : 전체 프로그램 내에서 유일한 값을 담을 
 * 변수
 * 
 * static 메서드 : 맴버 변수 혹은 맴버 메서드를 사용하지
 * 않을 경우
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static 맴버는 객체를 생성하지 않고도 사용이
		// 가능하다.
		System.out.printf("TestClass.a2 : %d\n", TestClass.a2);
		TestClass.testMethod2();
		// 일반 맴버는 클래스의 이름으로 접근하는 것이 불가하다.
//		System.out.println("TestClass.a1 : %d\n", TestClass.a1);
//		TestClass.testMethod1();
	}

}

class TestClass{
	// 일반 맴버 변수
	int a1 = 100;
	// static 맴버 변수
	static int a2 = 200;
	
	// 일반 메서드
	void testMethod1() {
		System.out.println("testMethod1");
		// 일반 메서드에서 static 맴버를 사용한다.
		System.out.printf("a2 : %d\n", a2);
		testMethod2();
	}
	// static 메서드
	static void testMethod2() {
		System.out.println("testMethod2");
		// static 메서드에서 일반 맴버 접근
		// 객체가 생성되었다는 것을 완벽하게 보장받을 수 
		// 없기 때문에 일반 맴버 접근은 불가능하다.
//		System.out.printf("a1 : %d\n", a1);
//		testMethod1();
	}
}












