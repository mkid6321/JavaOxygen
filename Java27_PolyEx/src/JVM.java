
public class JVM {
	
	static void testMethod(SuperClass sc) {
		sc.superMethod();
	}
}
// 개발자가 상속 받도록 제공하는 클래스
class SuperClass{
	// 개발자가 오버라이딩할 메서드
	void superMethod() {
		
	}
}
