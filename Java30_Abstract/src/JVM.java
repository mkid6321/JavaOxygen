
public class JVM {
	
	static void testMethod(SuperClass sc) {
		sc.superMethod();
	}
}
// 개발자가 상속받을 클래스
abstract class SuperClass{
	// 추상 메서드
	abstract void superMethod();
}
