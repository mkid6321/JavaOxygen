import com.test.test1.TestClass1;
import com.test.test1.TestClass2;
import com.test.test2.TestClass3;
import com.test.test2.TestClass4;

/*
 * 1. 패키지 내보낼때  : 프로젝트 우클릭 > Export클릭
 * 2. Export 창에서 java > JAR File 클릭
 * 3. 내보내고자 하는 패키지만 선택하신다음에 저장한다..
 * 
 * 가져올때
 * 1.프로젝트에서 우클릭 > Properties
 * 2.Properties 창에서 좌측의 Java Build Path를 클릭.
 * 3.우측의 Libraries탭을 클릭
	4.Module Path를 클릭하고 Add External Jars를 클릭
      5.원하는 jar파일을 선ㅌ개하고 확인을 눌러준다.
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		TestClass1 t1 = new TestClass1();
		TestClass2 t2 = new TestClass2();
		TestClass3 t3 = new TestClass3();
		TestClass4 t4 = new TestClass4();
		System.out.printf("t1 : %s\n",t1);
		System.out.printf("t2 : %s\n",t2);
		System.out.printf("t3 : %s\n",t3);
		System.out.printf("t4 : %s\n",t4);
	}
}
