/*
 * 1부터 1씩 증가되는 정수중에
 * 3의 배수이거나 5의 배수 이거나 7의 배수인 숫자
 * 100개를 출력하는 프로그램.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 시작한다.
		int number = 1;
		// 출력할 숫자의 개수
		int max_cnt = 100;
		// 출력한 숫자의 개수
		int cnt = 0;
		// 출력한 숫자의 개수가 100개가 될때까지 반복
		while(cnt < max_cnt) {
			// 숫자가 3의 배수인지 5의 배수인지 7의 배수인지
			// 검사한다.
			// 3, 5, 7의 배수라면 출력한다.	
			if(number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
				// 출력한다.
				System.out.println(number);
				// 출력한 숫자의 개수를 증가한다.
				cnt++;
			}
			// 비교할 숫자를 증가한다.
			number++;
		}
		

	}
}








