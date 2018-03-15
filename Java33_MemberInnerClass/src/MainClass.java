/*
 * 맴버 중첩 클래스 예제
 * 클래스 안에 있는 클래스를 의미하며 내부 클래스는
 * 외부클래스의 객체를 통해서만 객체를 생성할 수 있다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataClass1 dc1 = new DataClass1();
		
		TestClass1 t1 = new TestClass1(dc1);
		t1.testMethod1();
		
		TestClass2 t2 = new TestClass2();
		t2.testMethod2(dc1);
		// 중첩클래스 객체 생성
		OuterClass1 oc1 = new OuterClass1();
		OuterClass1.InnerClass in2 = oc1.new InnerClass();
		in2.innerMethod1();
		
	}
}
// 중첩 클래스를 사용하지 않는 예
class DataClass1{
	int a1 = 100;
}
// 생성자로 받는 경우
class TestClass1{
	DataClass1 dc1;
	
	TestClass1(DataClass1 dc1){
		this.dc1 = dc1;
	}
	void testMethod1() {
		System.out.printf("TestClass1 : %d\n", dc1.a1);
	}
}
// 메서드를 통해 받는 경우
class TestClass2{
	
	void testMethod2(DataClass1 dc1) {
		System.out.printf("TestClass2 : %d\n", dc1.a1);
	}
}
// 맴버 중첩 클래스를 사용
class OuterClass1{
	int a1 = 100;
	
	class InnerClass{
		
		int a2 = 200;
		
		void innerMethod1() {
			System.out.printf("a1 : %d\n", a1);
		}
	}
	
	void outerMethod1() {
		// OuterClass는 InnerClass의 객체가 생성되어 
		// 있다는 것을 보장받을 수 없기 때문에 맴버 사용불가
		// System.out.printf("a2 : %d\n",  a2);
		InnerClass in1 = new InnerClass();
		System.out.printf("in1.a2 : %d\n", in1.a2);
	}
}













