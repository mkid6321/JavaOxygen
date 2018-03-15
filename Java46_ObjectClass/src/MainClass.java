/*
 * java.lang.Object
 * 
 * 자바에서 객체의 생성과 소멸에 대한 부분이 구현되어 있는 
 * 아주 주용한 클래스
 * 
 * 자바에서 모든 클래스는 직간접적으로 object를 상속받고 있다.
 * 자바의 모든 클래스의 최 상위 부모클래스에 해당한다.
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		//자바에서 부모클래스를 명시하지 않으면
		//Object를 자동으로 상속 받는다..
		Object obj1 = new TestClass1();
		Object obj2 = new TestClass2();
		System.out.printf("obj1 : %s\n",obj1);
		System.out.printf("obj2 : %s\n",obj2);
		
		TestClass3 t3 = new TestClass3();
		System.out.printf("t3 : %s\n",t3);
		
		
		
	}
}

class TestClass1{
	
}

class TestClass2{
	//된다!
	public String toString() {
		System.out.println("테스트~");
		return "TestClass2의 객체입니다.";
	}
}

class TestClass3{
	@Override
	//객체를 출력할때 toString 메서드를 호출하여
	//반환하는 문자여을 출력
	//보통 생성된 객체의 정보(멤버 변수에 저장되어 있는 값들)을 출력할때 사용.
	public String toString() {
		System.out.println("테스트~");
		return "TestClass3의 객체입니다.";
	}
	
	
}