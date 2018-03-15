/*
 * 다형성. 객체의 주소값을 부모클래스형 참조변수에 담을 수 
 * 있는 개념
 * 
 * 부모클래스형 참조변수를 통해 호출한 메서드가 자식클래스에서
 * Overriding되어 있을 경우 자식 클래스의 메서드가 호출된다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 : SuperClass, 참조 변수 : SuperClass
		SuperClass sc1 = new SuperClass();
		System.out.printf("sc1.superMember : %d\n", sc1.superMember);
		sc1.superMethod();
		// 객체 생성 : SubClass, 참조 변수 : SubClass
		SubClass sub1 = new SubClass();
		System.out.printf("sub1.superMember : %d\n", sub1.superMember);
		System.out.printf("sub1.subMember : %d\n", sub1.subMember);
		sub1.superMethod();
		sub1.subMethod();
		// 객체 생성 : SuperClass, 참조 변수 : SubClass
		// 불가
		// 부모클래스를 가지고 만든 객체의 주소값은 자식
		// 형 참조변수에 담을 수 없다.
		// 자식이 어떤 클래스인지도 모르기 때문이다.
		// SubClass sub2 = new SuperClass();
		// 객체 생성 : SubClass, 참조 변수 : SuperClass
		// 자식클래스의 객체안에는 부모클래스의 객체 부분이
		// 있기 때문에 가능
		SuperClass sc2 = new SubClass();
		System.out.println("sc2.superMember : " + sc2.superMember);
		sc2.superMethod();
		// 부모클래스형 참조변수는 부모클래스 영역만 사용이
		// 가능. SuperClass형 참조 변수 안에는 SuperClass를
		// 가지고 만든 객체의 주소값이 들어갈수도 있고 
		// SuperClass를 상속받은 객체의 주소값이 들어갈 수도
		// 있기 때문에 아에 SuperClass 영역만 접근할 수 
		// 있도록 하고 있다.
//		System.out.println("sc2.subMember : " + sc2.subMember);
//		sc2.subMethod();
		
		sc2.testMethod();
	}
}

class SuperClass{
	int superMember = 100;
	
	void superMethod() {
		System.out.println("SuperClass의 superMethod");
	}
	
	void testMethod() {
		System.out.println("SuperClass의 testMethod");
	}
}

class SubClass extends SuperClass{
	int subMember = 200;
	
	void subMethod() {
		System.out.println("SubMethod의 subMethod");
	}
	// SuperClass의 testMethod를 오버라이딩한다.
	void testMethod() {
		System.out.println("SubMethod의 testMethod");
	}
}









