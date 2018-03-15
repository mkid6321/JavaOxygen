/*
 * 자주발생하는 예외
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//NullpointerException : 객체의 ㅈ소값을 가지고
		//있지 않은 참조변ㅅ를 사용할 경우
		try {
//			TestClass t1 = null;
//			t1.testMethod();
//			ArrayIndexOutOfBoundsException
//			배열의 범위를 넘어 섰을경우/
//			int[] array1 = new int[3];
//			array1[99] = 100;
			//ClassCastException
			// 객체의 주소값을 참조변ㅅ에 넣을 떼
			// 강제 형변환해서 넣는경우..
//			SuperClass s1 = new SubClass();
//			SuperClass s2 = new SuperClass();
//			
//			SubClass sub1 = (SubClass)s1;
//			System.out.println(sub1);
//			
//			SubClass sub2 = (SubClass)s2;
//			System.out.println(sub2);
			
			//JVM에게 객체를 생성하도록 명령을 전달한다
			//ClassNotFoundException
			//지정한 클래스를 찾을수 없을 경우
			//JVM에게 객ㅊ를 생성하도록 명령을 전달한다.
			Class.forName("com.test.Hahahah");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외 발생");
		}catch(ClassCastException e) {
			System.out.println("객체변환 오류");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스 찾지 못하는 에러..");
		}catch(Exception e) {
			System.out.println("모든예외");
		}
	}
}

class TestClass{
	void testMethod() {
		System.out.println("testMethod");
	}
}

class SuperClass{
	
}

class SubClass extends SuperClass{
	
}