/*
 * 객체의 맴버 변수(필드)
 * 
 * 클래스에 맴버 변수를 정의하면 객체를 생성할 때
 * 기억장소가 만들어진다. 클래스에 정의한 모든 맴버 변수는
 * 객체마다 따로따로 만들어져 관리된다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		System.out.printf("t1.a1 : %d\n", t1.a1);
		System.out.printf("t1.a2 : %f\n", t1.a2);
		System.out.printf("t1.a3 : %s\n", t1.a3);
		System.out.printf("t1.a4 : %s\n", t1.a4);

		System.out.printf("t1.a5 : %d\n", t1.a5);
		System.out.printf("t1.a6 : %f\n", t1.a6);
		System.out.printf("t1.a7 : %s\n", t1.a7);
		System.out.printf("t1.a8 : %s\n", t1.a8);

		// 맴버 변수에 값을 저장한다.
		t1.a1 = 500;
		System.out.printf("t1.a1 : %d\n", t1.a1);
		// 같은 클래스를 가지고 객체를 만들었다고 하더라도
		// 맴버 변수는 객체마다 따로 만들어져 관리된다.
		TestClass t2 = new TestClass();
		TestClass t3 = new TestClass();
		t2.a1 = 1000;
		System.out.printf("t2.a1 : %d\n", t2.a1);
		System.out.printf("t3.a1 : %d\n", t3.a1);
	}

}

class TestClass {
	// 객체의 맴버 변수에 값을 저장하지 않으면
	// 객체가 생성될 때 자동으로 초기화가 이루어진다.
	// 정수 : 0, 실수 : 0.0, boolean : false
	// 참조변수 : null
	int a1;
	double a2;
	boolean a3;
	DataClass a4;
	// 맴버 변수 선언시 초기화가 될 값을 지정
	int a5 = 100;
	double a6 = 11.11;
	boolean a7 = true;
	DataClass a8 = new DataClass();
}

class DataClass {

}
