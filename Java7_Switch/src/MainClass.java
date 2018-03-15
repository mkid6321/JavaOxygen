/* 
 * switch case
 * 
 * if문의 비 효율적인 부분을 어느정도 해소하기 위해
 * 제공되는 제어문이다.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 문
		int a1 = 10;
		if(a1 == 3) {
			System.out.println("a1은 3입니다");
		} else if(a1 == 5 || a1 == 10) {
			System.out.println("a1은 5이거나 10입니다");
		} else if(a1 == 20) {
			System.out.println("a1은 20입니다");
		} else {
			System.out.println("a1은 3, 5, 10, 20이 아닙니다");
		}
		
		// swtich
		switch(a1) {
		case 3 :
			System.out.println("a1은 3입니다");
			break;
		case 5 :
		case 10 : 
			System.out.println("a1은 5이거나 10입니다");
			break;
		case 20 :
			System.out.println("a1은 20입니다");
			break;
		default :
			System.out.println("a1은 3, 5, 10, 20이 아닙니다");
		}
		
		String str1 = "문자열2";
		switch(str1) {
		case "문자열1" :
			System.out.println("문자열1 입니다");
			break;
		case "문자열2" :
			System.out.println("문자열2 입니다");
			break;
		}
	}

}






