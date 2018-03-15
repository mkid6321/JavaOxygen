/*
 * 반복문 예제
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 : 반복횟수를 결정할 수 있을 때 사용
		// for(초기식 ; 조건식 ; 증감식){
		//		수행할 코드
		// }
		// 초기식 -> 조건식 -> 코드 -> 증감식
		//        -> 조건식 -> 코드 -> 증감식
		//        ... -> 조건식(거짓) -> 종료
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("for 문 : " + i);
		}
		System.out.println("-------------------");
		// while문 : 조건에 만족할 경우에 반복한다.
		// 조건식이 위에 있기 때문에 조건식이 처음부터 
		// 거짓이면 단 한번도 수행되지 않는다.
		// 반복할 조건이나 반복을 중단할 조건을 만들 수 있을
		// 때 사용
		// int a1 = 0;
		int a1 = 20;
		while(a1 < 10) {
			System.out.println("while : " + a1);
			a1++;
		}
		System.out.println("------------------");
		// do while
		// while문에서 사용하는 조건식의 변수 값이
		// 반복문 내에서 결정이 될 경우 do while로
		// 변경하면 코드의 중복을 막을 수 있다.
		// 조건식이 아래에 있으므로 조건식이 처음부터 
		// 거짓이라도 단 한번은 수행된다.
		// a1 = 0;
		a1 = 20;
		do {
			System.out.println("do while - a1 : " + a1);
			a1++;
		} while(a1 < 10);
	}
}









