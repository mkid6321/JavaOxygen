/*
 * static 중첩 클래스
 * 
 * 내부 클래스는 외부 클래스의 객체를 통하지 않고
 * 객체 생성이 가능하다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("OuterClass.a1 : %d\n", OuterClass.a1);
		
		OuterClass.outerMethod();
		
		OuterClass.InnerClass in1 = new OuterClass.InnerClass();
		in1.innerMethod();
	}

}
// static 맴버는 객체를 생성하지 않고 사용하기 때문에
// static 클래스도 외부 클래스의 객체 생성 없이 바로
// 사용한 가능한 맴버가 된다.
class OuterClass{
	static int a1 = 100;
	int a2 = 200;
	
	static void outerMethod() {
		System.out.println("outerMethod");
	}
	static class InnerClass{
		void innerMethod() {
			System.out.println("innerMethod");
			// 외부 클래스의 맴버를 사용
			System.out.printf("a1 : %d\n", a1);
			// 일반 맴버는 사용이 불가하다.
			// System.out.printf("a2 : %d\n", a2);
		}
	}
}











