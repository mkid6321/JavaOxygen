/*
 * 예외 : 예측이 가능한 오류, 코드상으로 처리가 가능한 오류
 * 예외처리 : 예외가 발생했을때 프로그램이 중지지되는 것을 막고
 * 			개발자가 만들어 놓은 코드를 수행후 계속 이어나갈 수 있도록 하는것!!
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		System.out.println("예외 발생 전");
		try {
			//수학적 예외 발생
			int a1 = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(); //에러나오는 라인도 표시한다...
		}
		
		System.out.println("예외 발생 후");
		
		
		
		
	}
}
