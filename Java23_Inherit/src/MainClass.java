/*
 * 상속.
 * 
 * 다른 클래스를 물려받는 개념으로 물려주는 쪽을 부모(Super)
 * 라고 부르고 물려 받는 쪽을 자식(Sub)라고 부른다.
 * 
 * 자식은 부모로부터 물려받은 모든 맴버를 자기 것처럼 사용
 * 할 수 있다.
 * 
 * 코드의 중복을 최소화하는데 많이 쓰여지는 개념이다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		System.out.printf("sub.a1 : %d\n", sub.a1);
		System.out.printf("Sub.a2 : %d\n", sub.a2);
		sub.subMethod();
		sub.superMethod();
		sub.subMethod2();
	}
}
// 부모 클래스
class SuperClass{
	int a1 = 10;
	
	void superMethod() {
		System.out.println("SuperClass의 메서드");
	}
}
// 자식 클래스
class SubClass extends SuperClass{
	int a2 = 20;
	
	void subMethod() {
		System.out.println("SubClass의 메서드");
	}
	
	void subMethod2() {
		// 부모에 정의되어 있는 맴버를 사용한다.
		System.out.printf("a1 : %d\n", a1);
		superMethod();
	}
}








