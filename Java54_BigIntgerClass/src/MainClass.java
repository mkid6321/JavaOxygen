import java.math.BigInteger;
import java.text.Format;
import java.util.Calendar;

/*
 * Java 53�� ������ BigInteger�� ����Ѵ�..
 * 
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		BigInteger big = new BigInteger("100");
		// ,�� �ٿ��� 3�ڸ� ������ ,�� ���̰� �ȴ�...
		System.out.printf("%2d���� : %,30d��\n",1,big);
	
		for(int i = 2; i <= 30; i++) {
			BigInteger number = new BigInteger("4");
			big = big.multiply(number);
			//���Ѵ� �ڸ��� ǥ���Ҽ� �ִ°�...
			System.out.printf("%2d���� : %,30d��\n",i,big);
		}
	}
}
