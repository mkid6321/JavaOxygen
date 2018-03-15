/*
 * 
 * Wrapper Class
 * 
 * 기본자료형(byte,short,int,long,double,float,boolean,char)
 * 값을 객체로 포장해서 관리할 수 있는 객체
 * 
 * 객체로 포장하거나 parse 계열 메서드를 사용한다..
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//객체로 포장(Boxing)
		Integer a1 = new Integer(100);
		Double a3 = new Double(11.11);
		
		Integer a10 = Integer.valueOf(100);
		Double a11 = Double.valueOf(11.11);
		
		//객체가 관리하는 값을 가져온다..
		//UnBoxing
		int number1 = a10.intValue();
		double number2 = a11.doubleValue();
		System.out.printf("number1 : %d\n",number1);
		System.out.printf("number1 : %f\n",number2);
		
		//autoBox
		//정수 100관리하는 Intger클래스타입의 객체가 만들어지면서 그 주소값이 a21에 들어간것이다
		Integer a20 = 100;
		Double a21 = 11.11;
		//Auto UnBoxing
		int number3 = a20;
		double number4 = a21;
		System.out.printf("number3 : %s\n",number3);
		System.out.printf("number4 : %s\n",number4);
	
		TestClass t1 = new TestClass();
		testMethod(t1);
		testMethod("문자열");
		testMethod(100);
		testMethod(11.11);
		
		//parse 계열 메서드
		String str1 = "100";
		String str2 = "200";
		String str3 = str1 + str2;
		System.out.printf("str3 : %s\n",str3);
		
		int a100 = Integer.parseInt(str1);
		int a200 = Integer.parseInt(str2);
		int a300 = a100 + a200;
		System.out.printf("a300 : %d\n",a300);
	}
	static void testMethod(Object obj) {
		if(obj instanceof Integer) {
			System.out.println("정수");
		}else if(obj instanceof Double) {
			System.out.println("실수");
		}else if(obj instanceof String) {
			System.out.println("문자열");
		}else if(obj instanceof TestClass) {
			System.out.println("Test클래스");
		}
	}
}



class TestClass{
	
}