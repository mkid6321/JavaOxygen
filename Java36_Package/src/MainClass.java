// import : 이 Java 파일에서 TestClass2를 사용하면
// com.test.test1 패키지에 있는 TestClass2라는걸 명시
import com.test.test1.TestClass2;
// *를 사용하면 해당 패키지에 있는 클래스는 전부
// import 된다.
import com.test.test2.*;

/*
 * 패키지 예제
 * 
 * 패키지 : 하나의 자바 프로그램에서 수 많은 클래스들을
 * 효율적으로 관리하기 위해 디렉토리 별로 나눠서 관리하는
 * 개념
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다른 패키지의 객체를 생성
		// 다른 패키지의 클래스를 사용할 때는 해당 클래스가
		// 존재하는 패키지 명까지 기술해야 한다.
		com.test.test1.TestClass1 t1 = new com.test.test1.TestClass1();
		System.out.printf("t1 : %s\n", t1);
		// 상단 부분에 import를 명시하였기 때문에
		// 패키지명을 생략한다.
		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);
		
		TestClass3 t3 = new TestClass3();
		TestClass4 t4 = new TestClass4();
		System.out.printf("t3 : %s\n", t3);
		System.out.printf("t4 : %s\n", t4);
		// 이미 import한 클래스와 동일명의 다른 패키지의
		// 클래스를 사용하고 싶다면 import가 불가하기
		// 때문에 패키지명을 포함하여 작성해야 한다.
		com.test.test3.TestClass2 t5 = new com.test.test3.TestClass2();
		System.out.printf("t5 : %s\n", t5);
	
	}
}






