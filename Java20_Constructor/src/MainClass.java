/*
 * 생성자
 * 클래스를 통해 객체를 생성하면 무조건 호출되는 요소
 * 객체 생성 후 반드시 동작해야 하는 코드가 있다면
 * 생성자에 만들면 된다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t1 = new TestClass();
		System.out.printf("t1 : %s\n", t1);
		// TestClass2는 매개 변수가 없는 생성자가 없으므로
		// 오류발생
//		TestClass2 t2 = new TestClass2();
//		System.out.printf("t2 : %s\n", t2);
		TestClass2 t3 = new TestClass2(100);
		System.out.printf("t3 : %s\n", t3);
		
		TestClass3 t4 = new TestClass3(100, 200);
		TestClass3 t5 = new TestClass3(1000, 2000);
		System.out.printf("t4.a1 : %d\n", t4.a1);
		System.out.printf("t4.a2 : %d\n", t4.a2);
		System.out.printf("t5.a1 : %d\n", t5.a1);
		System.out.printf("t5.a2 : %d\n", t5.a2);
	}
}
// 생성자를 만들지 않은 클래스
class TestClass{
	// 생성자를 만들지 않으면 컴파일시 다음과 같은
	// 기본 생성자가 자동으로 추가된다.
	/*
	TestClass(){
		
	}
	*/
}
// 생성자를 가지고 있는 클래스
class TestClass2{
	
	TestClass2(int a){
		System.out.printf("TestClass2의 생성자 : %d\n", a);
	}
}

class TestClass3{
	int a1;
	int a2;
	
	TestClass3(int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	
}









