/*
 * if 문 : 조건에 만족할 경우 수행되는 부분
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 문
		// 조건에 만족할 경우에만 수행된다.
		int a1 = 10;
		if(a1 > 20) {
			System.out.println("a1은 20보다 큽니다");
		}
		if(a1 < 20) {
			System.out.println("a1은 20보다 작습니다");
		}
		// if ~ else
		// 조건식이 만족하면 if 부분, 그렇지 않으면
		// else 부분이 수행된다.
		if(a1 > 5) {
			System.out.println("a1은 5보다 큽니다");
		} else {
			System.out.println("a1은 5보다 크지 않습니다");
		}
		if(a1 > 20) {
			System.out.println("a1은 20보다 큽니다");
		} else {
			System.out.println("a1은 20보다 크지 않습니다");
		}
		// if ~ else if ~ else
		// 만족하는 조건을 만날때까지 조건을 검사하며 내려온다.
		if(a1 > 30) {
			System.out.println("a1은 30보다 큽니다");
		} else if(a1 > 20) {
			System.out.println("a1은 20보다 큽니다");
		} else if(a1 > 10) {
			System.out.println("a1은 10보다 큽니다");
		} else {
			System.out.println("a1은 10, 20, 30보다 크지 않습니다");
		}
	}

}





