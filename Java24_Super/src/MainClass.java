/*
 * super : 부모클래를 가르키는 키워드
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub = new SubClass();
		sub.testMethod1();
		
		SubClass3 sub2 = new SubClass3();
		
	}
}

class SuperClass{
	int a1 = 100;
}
class SubClass extends SuperClass{
	// 부모클래스의 맴버 변수와 동일한 이름의 변수
	int a1 = 200;
	
	void testMethod1() {
		//맴버 변수와 동일한 이름의 지역변수
		int a1 = 300;
		// 지역변수 a1을 사용
		System.out.printf("a1 : %d\n", a1);
		// 맴버변수 a1을 사용
		System.out.printf("this.a1 : %d\n", this.a1);
		// 부모의 변수 a1을 사용
		System.out.printf("super.a1 : %d\n", super.a1);
	}
}
/*
 * 클래스의 객체를 생성하게 되면 생성자가 자동으로 호출된다.
 * 이 때, 생성자에서 다른 생성자를 호출하는 코드를 작성하지
 * 않으면 자동으로 부모클래스의 기본생성자가 호출된다.
 */
class SuperClass1{
	SuperClass1(){
		System.out.println("SuperClass1의 기본 생성자");
	}
}
class SubClass1 extends SuperClass1{
	SubClass1(int a2){
		System.out.println("SubClass1의 생성자");
		System.out.printf("a2 : %d\n", a2);
	}
}
class SubClass2 extends SubClass1{
	// 부모클래스에 기본 생성자가 없다면 생성자에서 
	// 보무클래스의 생성자를 명시적으로 호출해야 한다.
	// 명시적으로 호출하지 않으면 기본 생성자를 호출하려고
	// 시도하기 때문이다.
	SubClass2(){
		super(100);
		System.out.println("SubClass2의 기본 생성자");
	}
	// 매개 변수를 가지고 있는 생성자
	SubClass2(int a1){
		super(a1);
		System.out.println("SubClass2의 두 번째 생성자");
		System.out.printf("a1 : %d\n", a1);
	}
}
class SubClass3 extends SubClass2{
	SubClass3(){
		// 부모의 기본 생성자가 아닌 다른 생성자를 선택한다.
		super(100);
		System.out.println("SubClass3의 기본 생성자");
	}
}











