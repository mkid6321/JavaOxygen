/*
 * 프로그램 전체에서 딱하나만 객체 생성해서 사용할수 있도록 만드는 개념
 * 
 * 1. 생성자의 접근 제한자를 private로 한다
 * 2. 객체를 생성해서 주소값을 반환하는 static 메서드를 제공..
 *3. 상속이 불가하도록 class는 final class로 한다.. 
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		//TestClass t1 = new TesttClass();
		//생성자의 접근제한자가  private이기 때문에
		//직접 객체를 생성한는것이 불가능하다.
		TestClass t1 = TestClass.getInstance();
		TestClass t2 = TestClass.getInstance();
		TestClass t3 = TestClass.getInstance();
		System.out.printf("t1 : %s\n",t1);
		System.out.printf("t2 : %s\n",t2);
		System.out.printf("t3 : %s\n",t3);
	}

}


// 싱클톤
//class 앞에 final 넣으면 상속 막는다...
final class TestClass{
	//생성된 객체의 주소값을 담아놓을 참조변수
	private static TestClass t1 = null;
	//생성자에 접근제한자르르 private준다 .
	private TestClass() {
		
	}
	//객체를 생성해서 반환하는 메서드
	public static TestClass getInstance() {
		if(t1 == null) {
			t1 = new TestClass();
		}
		return t1;
	}
}