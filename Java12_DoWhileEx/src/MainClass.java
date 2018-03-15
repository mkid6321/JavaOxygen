import java.util.Scanner;

/*
 * 사용자에게 0을 입력받을 때 까지 누적하여
 * 총 합을 출력한다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			// 사용자가 입력한 값
			int number = 0;
			// 총합을 가지고 있는 변수
			int total = 0;
			// 1. 사용자가 0을 입력할 때 까지 반복
			do {
			//    1.1 사용자에게 숫자를 입력받는다.
				System.out.print("점수 : ");
				number = scan.nextInt();
			//    1.2 입력받은 숫자가 0이 아니면 누적
				if(number != 0) {
					total = total + number;
					// total += number;
				}
			} while(number != 0);
			// 2. 총합을 출력한다.
			System.out.printf("총합 : %d\n", total);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}







