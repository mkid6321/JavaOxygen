/*
 * 연산자.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		int a1 = 10 + 3;
		int a2 = 10 - 3;
		int a3 = 10 * 3;	// Asterisk
		int a4 = 10 / 3;
		int a5 = 10 % 3;
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println("a4 : " + a4);
		System.out.println("a5 : " + a5);
		
		int number = 12345;
		int n1 = number / 10000;
		number = number % 10000;
		int n2 = number / 1000;
		number = number % 1000;
		int n3 = number / 100;
		number = number % 100;
		int n4 = number / 10;
		int n5 = number % 10;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		System.out.println("n5 : " + n5);
		
		// ~ 연산자 : 2진수 0을 1로, 1을 0으로 바꾸는 연산자
		int a6 = 10;
		System.out.println("a6 : " + a6);
		int a7 = ~a6 + 1;
		System.out.println("a7 : " + a7);
		
		int a8 = 10 - 2;
		int a9 = 10 + (~2 + 1);
		System.out.println("a8 : " + a8);
		System.out.println("a9 : " + a9);
		
		// 쉬프트 연산자(비트 이동)
		int a10 = 8 >> 1;
		int a11 = 8 / 2;
		System.out.println("a10 : " + a10);
		System.out.println("a11 : " + a11);
		// 증감연산자 : ++, --
		int a12 = 10;
		int a13 = 10;
		
		a12 = a12 + 1;
		a13++;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		
		a12 = a12 - 1;
		a13--;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		// 증감연산자는 다른 연산자와 섞여 있을 경우
		// 뒤에 있으면 가장 마지막에 수행되고 앞에 있으면
		// 가장 먼저 수행된다.
		a12 = 10;
		a13 = a12++ + 1;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		
		a12 = 10;
		a13 = ++a12 + 1;
		System.out.println("a12 : " + a12);
		System.out.println("a13 : " + a13);
		// 비교연산자
		int a14 = 10;
		int a15 = 3;
		int a20 = 10;
		boolean a16 = a14 < a15;	// false
		boolean a17 = a14 > a15;	// true
		boolean a18 = a14 <= a20;	// true
		boolean a19 = a14 >= a20;	// true
		boolean a21 = a14 == a15;	// false
		boolean a22 = a14 != a20;	// false
		System.out.println("a16 : " + a16);
		System.out.println("a17 : " + a17);
		System.out.println("a18 : " + a18);
		System.out.println("a19 : " + a19);
		System.out.println("a21 : " + a21);
		System.out.println("a22 : " + a22);
		// 논리 연산자
		// && : 양쪽이 모두 true여야지만 true이다.
		boolean a23 = a14 < a15 && a14 == a15;
		System.out.println("a23 : " + a23);
		
		boolean a24 = a14 < a15 && a14 == a20;
		System.out.println("a24 : " + a24);
		
		boolean a25 = a14 == a20 && a14 > a15;
		System.out.println("a25 : " + a25);
		// || : 둘다 거짓이여야만 거짓이된다.
		boolean a26 = a14 != a20 || a14 < a15;
		System.out.println("a26 : " + a26);
		// 3항 연산자
		// 조건식의 값이 참이면 값1, 거짓이면 값2가
		// 최종 결과가 된다.
		// 조건식 ? 값1 : 값2
		int a27 = a14 > a15 ? 10 : 3;
		System.out.println("a27 : " + a27);
		
		// 대입연산자
		int a28 = 10;
		int a29 = 10;
		
		a28 = a28 + 10;
		a29 += 10;
		System.out.println("a28 : " + a28);
		System.out.println("a29 : " + a29);
	}

}





