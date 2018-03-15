import com.test.test1.TestClass2;

public class MainClass {
	public static void main(String[] args) {
		//같은 패키지에 있는 클래스의 객체를 사용하는 경우
		//가능  : public ,default,proteceted
		//불가능  : private
		TestClass1 t1 = new TestClass1();
		System.out.printf("private : %d\n",t1.privateMember);
		System.out.printf("public : %d\n",t1.publicMember);
		System.out.printf("default : %d\n",t1.defaultMember);
		System.out.printf("protected : %d\n",t1.protectedMember);
		//다른 패키지에 있는 클래스의 객체를 생성한 경우
		TetsClass2 t2 = new TestClass2();
		//가능 : public
		//불가능 : private,default,proteted
	}
}

//같은 패키지에 있는 클래스
class TestClass1{
	private int privateMember = 100;
	public int publicMember = 200;
	int defaultMember = 300;
	protected int protectedMember = 400;
	
	void testMethod1() {
		//접근제한자에 관계 없이 같은 클래스 내부라면
		/// 자유롭게 접근이 가능하다.
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}

//같은 패키지에 있는 클래스를 상속받는 경우
class SubClass1 extends TestClass1{
	public SubClass1() {
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}

//다른패키지의 클래스를 상속받은 경우.
class SubClass2 extends TestClass2() {
	SubClass2(){
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}






