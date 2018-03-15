/*
 * 자바의 표준 출력 : 콘솔에 문자열로 출력
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ()안의 값을 출력하고 밑으로 내려준다.
		System.out.println("문자열1");
		System.out.println("문자열2");
		
		// ()안의 값을 출력하고 밑으로 내리지 않는다.
		System.out.print("문자열3");
		System.out.print("문자열4");
		System.out.println();
		
		// 출력서식을 이용한다.
		// %d : 정수
		// %f : 실수
		// %c : 문자
		// %s : 문자열 그리고 그외..
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 11.11);
		System.out.printf("문자열 : %s\n", "문자열");
		System.out.printf("논리값 : %s\n", true);
		System.out.printf("%d, %f, %s\n", 100, 11.11, "문자열");
	}
}







