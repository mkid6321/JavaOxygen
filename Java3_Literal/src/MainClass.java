/*
 * 리터럴 : 코드에 작성하는 값들
 * 
 * 정수 리터럴 : 100, 200, 300L, 400l
 * 실수 리터럴 : 11.11, 22.22F, 33.33f
 * 논리 리터럴 : true, false
 * 문자 리터럴 : 'A', '가'
 * 문자열 리터럴 : "안녕하세요", "abcd"
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 리터럴(4byte)
		System.out.println("정수 : " + 100);
		System.out.println("정수 : " + 2147483647);
		System.out.println("정수 : " + -2147483648);
		// 정수 리터럴에 L, l을 붙혀주면 8바이트 기억공간이
		// 만들어지고 거기에 저장된다.
		System.out.println("정수 : " + 2147483648l);
		System.out.println("정수 : " + -2147483649L);
		System.out.println("정수 : " + 9223372036854775807L);
		System.out.println("정수 : " + -9223372036854775808L);
		
		// 실수 리터럴(8byte)
		System.out.println("실수 : " + 11.11);
		// 기억공간을 절약하고 싶다면 F, f를 붙혀준다(4byte)
		System.out.println("실수 : " + 22.22F);
		
		// 논리 리터럴(1bit)
		// true : 참
		// false : 거짓
		System.out.println("논리 : " + true);
		System.out.println("논리 : " + false);
		// 문자(2byte)
		System.out.println("문자 : " + 'A');
		System.out.println("문자 : " + '가');
		// 문자열(글자 수 만큼... 사실 리터럴이 아니다)
		System.out.println("문자열 : " + "안녕하세요");
		
	}

}





