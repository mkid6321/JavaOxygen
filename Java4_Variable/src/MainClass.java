/*
 * 변수 
 * 
 * 개발자가 필요에 의해 만들어 사용하는 기억장소
 * 기본자료형(Primitive Type)
 * 정수형 자료형 : byte, short, int, long
 * 문자형 자료형 : char
 * 실수형 자료형 : double, float
 * 논리형 자료형 : boolean
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		byte a1;
		short a2;
		int a3;
		long a4;
		
		int a10, a11, a12;
		
		// 변수에 값을 저장한다.
		a1 = 100;
		System.out.println("a1 : " + a1);
		
		// 변수를 선언과 동시에 값을 저장한다.(초기화)
		int a20 = 200;
		System.out.println("a20 : " + a20);
		// 정수의 경우 자동으로 형변환이 일어난다.
		a1 = 100;			// 4byte -> 1byte
		a2 = 200;			// 4byte -> 2byte
		a3 = 300;			// 4byte -> 4byte
		a4 = 400;			// 4byte -> 8byte
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println("a4 : " + a4);
		// 1byte 기억공간에 담을 수 없는 값이기 때문에
		// 자동으로 형변환이 발생하지 않는다.
		// a1 = 1000000;
		int a100 = 100;
		// 큰 기억장소의 값을 작은 기억장소에 담으면
		// 값에 관계없이 오류가 발생한다.
		// 만약 담으려면 명시적으로 형변환을 해줘야 한다.
		byte a200 = (byte)a100;
		System.out.println("a200 : " + a200);
		int a300 = 10000;
		byte a400 = (byte)a300;
		System.out.println("a400 : " + a400);
		// 실수형 자료형은 자동으로 형변환이 되지 않는다.
		float f1 = 11.11F;
		double d1 = 22.22;
		System.out.println("float : " + f1);
		System.out.println("double : " + d1);
		// 논리형
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("boolean : " + b1);
		System.out.println("boolean : " + b2);
		// 문자형
		char c1 = 'A';
		char c2 = 65;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}
}






