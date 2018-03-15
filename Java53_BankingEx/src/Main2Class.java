/*
 * 보검이가 저금을 한다.
 * 
 * 1일차 : 100원
 * 
 * 2일차부터는 전날 잔고액의 3배를 저금한다.
 * 30일차까지의 잔고액을 모두 출력하시오
 * 
 * 단 int 변수(배열)만 사용한다.
 */
public class Main2Class {

	// 잔고액을 담을 배열
	static int [] banking = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1일차
		banking[banking.length - 1] = 100;
		printBanking(1);
		// 2일차 ~ 30일차
		for(int i = 2 ; i <= 30 ; i++) {
			// 각 배열을 4를 곱한다.
			for(int k = 0 ; k < banking.length ; k++) {
				banking[k] = banking[k] * 4;
			}
			// overflow 처리
			for(int k = banking.length - 1 ; k > 0 ; k--) {
				// 1000으로 나눈 몫을 앞자리 기억장소에 더한다.
				banking[k - 1] = banking[k - 1] + (banking[k] / 1000);
				// 1000으로 나눈 나머지를 현재 기억장소에 저장한다.
				banking[k] = banking[k] % 1000;
			}
			printBanking(i);
		}
	}
	
	public static void printBanking(int date) {
		boolean checkZero = false;
		System.out.printf("%2d일차 : ", date);
		
		for(int i = 0 ; i < banking.length ; i++) {
			if(checkZero == false) {
				if(banking[i] == 0) {
					System.out.print("    ");
				} else {
					System.out.printf("%3d", banking[i]);
					checkZero = true;
					if(i == banking.length - 1) {
						System.out.println("원");
 					} else {
 						System.out.print(",");
 					}
				}
			} else {
				System.out.printf("%03d", banking[i]);
				if(i == banking.length - 1) {
					System.out.println("원");
				} else {
					System.out.print(",");
				}
			}
		}
		System.out.println();
	}
}








