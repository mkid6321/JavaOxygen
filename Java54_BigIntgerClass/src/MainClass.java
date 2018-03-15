import java.math.BigInteger;
import java.text.Format;
import java.util.Calendar;

/*
 * Java 53번 예제를 BigInteger를 사용한다..
 * 
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		BigInteger big = new BigInteger("100");
		// ,를 붙여야 3자리 단위로 ,를 붙이게 된다...
		System.out.printf("%2d일차 : %,30d원\n",1,big);
	
		for(int i = 2; i <= 30; i++) {
			BigInteger number = new BigInteger("4");
			big = big.multiply(number);
			//무한대 자리수 표현할수 있는것...
			System.out.printf("%2d일차 : %,30d원\n",i,big);
		}
	}
}
