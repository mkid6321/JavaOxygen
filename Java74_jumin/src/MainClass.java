import java.util.Scanner;

/*
 * 사용자에게 주민번호를 입력받는다.
 * 
 * 입력받은 주민 번호를 분석하여 다음과 같이 출력한다...
 * 
 * 생년월일 : 1982년 10월 10일
 * 
 * 성별 : 남자
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 주민 번호를 입력 받는다.
			System.out.print("주민번호 입력(- 제외) : ");
			int [] array = getJuminData2();
//			for(int temp : array) {
//				System.out.println(temp);
//			}
			// 주민 번호를 분석하여 생년월일 성별을 구한다.
			int year = array[0] * 10 + array[1];
			int month = array[2] * 10 + array[3];
			int date = array[4] * 10 + array[5];
			
			switch(array[6]) {
			case 1 :
			case 2 :
				year = year + 1900;
				break;
			case 3 :
			case 4 :
				year = year + 2000;
				break;
			case 9 :
			case 0 :
				year = year + 1800;
			}
			
			String gender = null;
			if(array[6] % 2 == 0) {
				gender = "여자";
			} else {
				gender = "남자";
			}
			
			// 결과를 출력한다.
			System.out.printf("생년월일 : %d년 %d월 %d일\n", year, month, date);
			System.out.printf("성별 : %s\n", gender);
			System.out.println("주민등록 결과.");
			System.out.println(JuminTrue(array));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 입력받은 주민번호를 숫자로 변환해서 분리는 예
	public static int [] getJuminData1() throws Exception{
		Scanner scan = new Scanner(System.in);
		// 주민번호를 숫자로 입력받는다.
		long number = scan.nextLong();
		// 각 숫자의 자리를 뜯어내서 정수형 배열에 담는다.
		int [] array = new int[13];
		// 나눌 수
		long a1 = 1000000000000L;
		// 13번 반복한다.
		for(int i = 0 ; i < array.length ; i++) {
			// 나눈 몫을 구해서 담는다.
			array[i] = (int)(number / a1);
			// 다음 계산을 위해 나머지를 구해서 담는다.
			number = number % a1;
			a1 = a1 / 10;
		}
		return array;
	}
	// 입력받은 주민번호를 문자열 그대로 분리하는 예
	public static int [] getJuminData2() throws Exception{
		// 주민번호를 입력받는다.
		Scanner scan = new Scanner(System.in);
		String jumin = scan.next();
		// 입력받은 주민 번호 문자열의 각 글자 코드 값을 가져온다.
		char [] array1 = jumin.toCharArray();	
		int [] array2 = new int[13];
		for(int i = 0 ; i < array1.length ; i++) {
			array2[i] = (int)(array1[i] - '0');
		}
		return array2;
	}
	
	//주민등록이 맞는지 안맞는지 확인하는 메서드..
	public static String JuminTrue(int[] getJuminData2) throws Exception{
		String juminResultMessage = null;
		//주민등록번호를 받는다.
		int[] juminTrue = new int[13];
		for(int i = 0; i < getJuminData2.length; i++) {
			juminTrue[i] = getJuminData2[i];
		}
		//주민등록계산 합하는변수.
		int juminSum = 0;
		for(int i = 0; i < juminTrue.length - 1; i++) {
			switch (i) {
			case 0:
				juminTrue[0] *= 2;
				break;
			case 1:
				juminTrue[1] *= 3;
				break;
			case 2:
				juminTrue[2] *= 4;
				break;
			case 3:
				juminTrue[3] *= 5;
				break;
			case 4:
				juminTrue[4] *= 6;
				break;
			case 5:
				juminTrue[5] *= 7;
				break;
			case 6:
				juminTrue[6] *= 8;
				break;
			case 7:
				juminTrue[7] *= 9;
				break;
			case 8:
				juminTrue[8] *= 2;
				break;
			case 9:
				juminTrue[9] *= 3;
				break;
			case 10:
				juminTrue[10] *= 4;
				break;
			case 11:
				juminTrue[11] *= 5;
				break;
			
			}
		}
		
		for(int temp : juminTrue) {
			System.out.println(temp);
		}
		//주민등록 계산식 나온거 다 더하기..
		for(int i = 0; i < juminTrue.length - 1; i++) {
			juminSum += juminTrue[i];
		}
		//주민 공식 합 % 11
		int juminPer = juminSum % 11;
		//11 - juminPer
		int juminBack = 11 - juminPer;
		//juminBack % 10;
		int juminResult = juminBack % 10;
		
		//주민번호끝자리와 계산한값이 같은지 다른지 비교
		if(juminTrue[juminTrue.length - 1] == juminResult) {
			System.out.println("맞는주민번호 입니다.");
			juminResultMessage = "맞는주민번호 입니다.";
		}else {
			System.out.println("틀린주민번호입니다.");
			juminResultMessage = "틀린주민번호입니다.";
		}
		return juminResultMessage;
	}
}