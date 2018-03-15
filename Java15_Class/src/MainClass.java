/*
 * 클래스
 * 
 * 클래스를 객체를 만들기 위한 설계도
 * 
 * java파일의 이름과 클래스의 이름을 동일하게 해야 한다.
 * 만약 java 파일에 클래스가 여러개가 있다면 그 클래스들 중에
 * 하나의 이름과 동일하면 된다.
 * 
 * 단 public class가 있을 경우 public class의 이름이
 * java 파일의 이름이 되어야 한다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		TestClass1 t2 = new TestClass1();
		TestClass2 t3 = new TestClass2();
		TestClass100 t4 = new TestClass100();
		TestClass200 t5 = new TestClass200();
		TestClass300 t6 = new TestClass300();
		
		System.out.printf("t1 : %s\n", t1);
		System.out.printf("t2 : %s\n", t2);
		System.out.printf("t3 : %s\n", t3);
		System.out.printf("t4 : %s\n", t4);
		System.out.printf("t5 : %s\n", t5);
		System.out.printf("t6 : %s\n", t6);
	}
}

class TestClass1{
	
}

class TestClass2{
	
}





