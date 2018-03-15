
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스의 객체 생성
		// 추상 클래스는 완벽한 설계도가 아니기 때문에
		// 객체 생성이 불가능하다. 
		// SuperClass sc1 = new SuperClass();
		TestClass1 t1 = new TestClass1();
		TestClass2 t2 = new TestClass2();
		JVM.testMethod(t1);
		JVM.testMethod(t2);
	}

}
// 추상클래스를 상속받은 클래스
class TestClass1 extends SuperClass{
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 superMethod");
	}
}
class TestClass2 extends SuperClass{
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2의 superMethod");
	}
}









