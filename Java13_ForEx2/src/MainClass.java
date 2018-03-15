/*
 * for문 예제
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지의 숫자 중 3배이거나 5의 배수인 숫자를
		// 출력한다.
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}
		}
//		
//		if(1 % 3 == 0 || 1 % 5 == 0) {
//			System.out.println(1);
//		}
//		
//		if(2 % 3 == 0 || 2 % 5 == 0) {
//			System.out.println(2);
//		}
//		
//		if(3 % 3 == 0 || 3 % 5 == 0) {
//			System.out.println(3);
//		}

	}
}









