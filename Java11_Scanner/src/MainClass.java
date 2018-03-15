import java.util.Scanner;

/*
 * Scanner : 키보드로 입력 받은 데이터를 원하는 형태로
 * 변환해서 전달해준다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 키보드로 부터 입력받는 도구 생성
			Scanner scan = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int a1 = scan.nextInt();
			System.out.printf("a1 : %d\n", a1);
			
			System.out.print("실수 입력 : " );
			double a2 = scan.nextDouble();
			System.out.printf("a2 : %f\n", a2);
			
			System.out.print("문자열 입력 : ");
			String a3 = scan.next();
			System.out.printf("a3 : %s\n", a3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}







