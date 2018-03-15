/*
 * final : 최종이라는 뜻을 가지고 있는 키워드
 * 변수 : 변수의 값 변경이 불가
 * 메서드 : 오버라이딩이 불가
 * 클래스 : 상속이 불가
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
// final 변수 예제
// final 변수는 선언과 동시에 초기화를 하거나
// 생성자에서 초기화를 해줘야 한다.
class TestClass{
	// final 변수
	final int a1 = 100;
	final int a2;
	
	TestClass(){
		a2 = 200;
	}
	
	void testMethod() {
		// final 변수는 값 저장 이후 다시 설정하는 것은 불가
		a1 = 1000;
		a2 = 2000;
	}
}
// final 메서드 예제
// final 메서드는 오버라이딩이 불가능하다.
class SuperClass1{
	void superMethod1() {
		
	}
	final void superMethod2() {
		
	}
}

class SubClass1 extends SuperClass1{
	// 일반 메서드를 오버라이딩(가능)
	void superMethod1() {
		
	}
	// final 메서드를 오버라이딩(불가)
	void superMethod2() {
		
	}
}
// final class : 상속 불가
final class SuperClass2{
	
}
class SubClass2 extends SuperClass2{
	
}










