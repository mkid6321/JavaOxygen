import java.util.Scanner;

/*
 * 	주민번호 판별
 *  1. 사용자에게 주민번호를 입력받는다.
 *  2. 입력ㅂ다은 주민번호를 당므 공식으로 계산하면 13번째
 *		숫자가 나온다..
 *  3.그 숫자를 비교하여 옳바른 주민 번호인지 확인한다... 
 * 
 *  각 자리수를 다음 숫자로 곱한다(2,3,4,5,6,7,8,9,2,3,4,5)
 *  곱한 값들을 모두 더한다..
 *	더한 값을 11로 나눈 나머지를 구한다
 * 	11을 구한 나머지로 뺀다
 * 	뺀 값을 10으로 나눈 나머지를 구한다
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			// 주민번호를 입력 받는다..
			System.out.println("주민번호 입력(- 제외) : ");
			String str = scan.next();
			// System.out.println(str);
			// 각 자리를 뜯어낸다..
			char[] array = str.toCharArray();
			int[] array2 = new int[13];
			for (int i = 0; i < array.length; i++) {
				array2[i] = (int) (array[i] - '0');
			}
			for (int a1 : array2) {
				System.out.println(a1);
			}
			// 각 자리수를 지정된 숫자로 곱하면서 누적한다..
			int[] array3 = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

			int total = 0;
			for (int i = 0; i < 12; i++) {
				total = total + (array2[i] * array3[i]);
			}
			// 누적한 값을 11로 나눈 나머지를 구한다.
			int mod = total % 11;
			// 11에서 구한 나머지를 뺀다.
			int result = 11 - mod;
			// 뺀 값을 10으로 나눈 나머지를 구한다..
			int result2 = result % 10;
			// 구한 나머지와 마지막 숫자를 비교한다..
			if(result2 == array2[12]) {
				//같으면 올바른 주민번호, 다르면 잘못된 주민번호로 출력한다...
				System.out.println("옳바른 주민 번호 입니다.");
			}else {
				System.out.println("잘못된 주민 번호 입니다.");
			}
			// 같으면 올바른 주민번호
			// 다르면 잘못된 주민번호로 출력한다..
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}