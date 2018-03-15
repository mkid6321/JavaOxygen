/*
 * 사용자 정의 예외 만들기, 예외 발생하기, 예외 떠넘기
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//throw new NegativeNumberException();
		//Excption을 직접 상속받은 예외를 떠넘기고 있기때문에 무조건 예외처리를 해야한다..
		try {
			testMethod1(5);
			testMethod1(100);
		} catch (Exception e) {
			System.out.println(e);
		}
		//RuntimeException을 상속받은 예외가 발생하기 때문에 에외어리경제성
		//있니???
		testMethod2(100);
		testMethod2(-100);
	}
	//try ~~catch는 나한테 예외 떠넘기기
	//NumberBoundException 테스트
	//throws : 우측에 나열된 예외가 발생하면 메서드를 호출한 쪽으로 저달하겠다는 의미, \
	//메서드를 호출한 쪽에서 예외처리가 자유롭게 할수  잇도록 하는 개념
	//thorw : 예외 발생시킨다.
	static void testMethod1(int a1)throws NumberBoundsException {
		//조건에 맞지 않으면  NumberBoundsException
		if(!(a1 >= 0&& a1 <= 10) ) {
			throw new NumberBoundsException();
		}
		System.out.println("a1: %d\n");
	}
	//RuntimeException상속박은 예외가 발생하기 때문에 예외처리에 대한 강제성은 ㅇㅄ다
	static void testMethod2(int a1) {
		if(a1 < 0) {
			throw new NegativeNumberException();
		}
		System.out.printf("a1 : %d\n",a1);
	}
}

//Exception을 상속받은 클래스
// 이 예외가 발생하는 코드는 반드시 예외처리 해줘야 한다.
class NumberBoundsException extends Exception {
	@Override
	public String getMessage() {
		return "tntwksms  0 ~ 10까지여야 한다.";
	}
}

//RuntimeException 을 상속받은 클래스
// 이 예외가 발생하는 코드는 예외처리를 하지 않아도 된다.
class NegativeNumberException extends RuntimeException{
	@Override
	public String getMessage() {
		return "음요수를 담을수 없습니다.";
	}
}