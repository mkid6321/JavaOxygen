/*
 * 맴버 메서드
 * 
 * C언어의 함수와 유사하다. 자바에서는 모든 메서드는 
 * 반드시 클래스 내부에서만 작성이 가능하다.
 * 
 * 개발자가 만든 코드를 그룹화하여 관리할 수 있는 개념
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스에 정의한 메서드는 객체를 생성한 후
		// 참조변수를 통해서 호출할 수 있다.
		TestClass t1 = new TestClass();
		t1.testMethod1();
		// 반환값을 전달하는 메서드를 호출
		int a1 = t1.testMethod2();
		System.out.printf("a1 : %d\n", a1);
		
		DataClass dc2 = t1.testMethod3();
		System.out.printf("dc2.value1 : %d\n", dc2.value1);
		System.out.printf("dc2.value2 : %d\n", dc2.value2);
		
		t1.testMethod4();
		
		// 매개변수를 가지고 있는 메서드 호출
		t1.testMethod5(100);
		t1.testMethod5(200);
		
		DataClass dc3 = new DataClass();
		dc3.value1 = 1000;
		dc3.value2 = 2000;
		t1.testMethod6(500, 55.55, dc3);
	}
}

class TestClass{
	// 기본 메서드
	void testMethod1() {
		System.out.println("testMethod1");
	}
	// 반환 타입 : 메서드의 수행이 끝나면 메서드를
	// 호출하는 쪽으로 값을 전달한다.
	// 정수 값을 반환하는 메서드
	int testMethod2() {
		System.out.println("testMethod2");
		return 100;
	}
	// 객체의 주소값을 반환하는 메서드
	DataClass testMethod3() {
		System.out.println("testMethod3");
		DataClass dc1 = new DataClass();
		dc1.value1 = 100;
		dc1.value2 = 200;
		return dc1;
	}
	// return 문 : 메서드의 코드 수행을 중단하고
	// 메서드를 호출한 쪽으로 돌아간다는 의미
	// 부가 기능으로 값을 전달할 수 있다.
	void testMethod4() {
		System.out.println("testMethod4 시작");
		int a1 = 10;
		if(a1 < 20) {
			return;
		}
		System.out.println("testMethod4 종료");
	}
	// 매개 변수
	void testMethod5(int a1) {
		System.out.println("testMethod5");
		System.out.printf("매개변수 a1 : %d\n", a1);
	}
	void testMethod6(int a1, double a2, DataClass a3) {
		System.out.println("testMethod6");
		System.out.printf("매개변수 a1 : %d\n", a1);
		System.out.printf("매개변수 a2 : %f\n", a2);
		System.out.printf("매개변수 a3.value1 : %d\n", a3.value1);
		System.out.printf("매개변수 a3.value2 : %d\n", a3.value2);
	}
}

class DataClass{
	int value1;
	int value2;
}









