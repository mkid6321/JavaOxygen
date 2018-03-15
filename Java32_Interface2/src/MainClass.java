
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스의 static final 변수를 코드에서 
		// 사용하면 컴파일시 static final 변수를 사용한
		// 부분은 실제 값으로 전부다 변경된다.
		System.out.printf("Inter1.a1 : %d\n", Inter1.a1);
		System.out.printf("Inter1.a2 : %d\n", Inter1.a2);
	
		TestClass t1 = new TestClass();
		t1.interMethod1();
	}
}
 
interface Inter1{
	// 인터페이스의 모든 변수는 static final 변수
	int a1 = 100;
	int a2 = 200;
	// 자바 8로 부터 지원되는걸로추측이 됩니다만....;;;;
	// 이 메서드는 인터페이스를 구현한 클래스로 추가된다.
	// 자바에서 다중 상속이 필요할 때 사용하면 다중 상속
	// 처럼 사용하는 것이 가능하다.
	default void interMethod1() {
		System.out.println("Inter1의 메서드");
	}
}

class TestClass implements Inter1{
	
}










