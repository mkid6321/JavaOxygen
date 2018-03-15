/*
 * 변수의 사용 범위
 * 
 * 자바는 블록 스코프(변수가 선언된 위치와 같은 위치에서만
 * 사용이 가능)를 가지고 있다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		t1.testMethod1();
		t1.testMethod2();
		
		t1.testMethod3();
	}

}

class TestClass{
	// 맴버 변수
	// 맴버 변수는 같은 클래스 내부라면 자유롭게 사용이 
	// 가능하다.
	int a1 = 100;
	int a2 = a1;
	// 맴버변수와 지역변수의 이름이 같은 경우
	int a100 = 1000;
	
	void testMethod1() {
		System.out.printf("a1 : %d\n", a1);
		// 지역 변수(매개변수도 지역변수로 취급한다)
		int a3 = 300;
		System.out.printf("a3 : %d\n", a3);
		{
			int a4 = 400;
			System.out.printf("a4 : %d\n", a4);
		}
		// a4 변수가 선언된 블럭 밖에서는 변수를 사용할 수
		// 없다
		// System.out.printf("a4 : %d\n", a4);
		
		// for문의 제어 변수
		// 제어변수가 선언된 위치가 { } 밖이라고 하더라도
		// for { } 안에서 선언된걸로 취급한다.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("i : %d\n", i);
		}
		// System.out.printf("i : %d\n", i);
	}
	
	void testMethod2() {
		System.out.printf("a1 : %d\n", a1);
		// testMethod1의 지역변수 a3 사용
		// a3 변수는 다른 메서드의 지역 변수이므로
		// 사용이 불가하다.
		// System.out.printf("a3 : %d\n", a3);
	}
	
	void testMethod3() {
		// 맴버변수와 동일한 이름의 지역변수
		int a100 = 2000;
		System.out.printf("a100 : %d\n", a100);
		// 지역변수와 맴버변수의 이름이 동일할경우
		// 맴버 변수를 사용할 때는 this를 사용한다.
		System.out.printf("this.a100 : %d\n", this.a100);
	}
}












