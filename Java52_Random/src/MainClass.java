import java.util.Random;

/*
 * Random 클래스
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		// 5~19까지의 범위에서 랜덤 숫자 20개를 추출한다.
		//값은 패턴의 랜덤값을 생성할때..
		Random rnd = new Random(500);
		//숫자의 개수
		int cnt = 19 - 5 + 1;
		for(int i = 0; i < 20; i++) {
			int number = rnd.nextInt(cnt) + 5;
			System.out.printf("%d,",number);
		}
	}
}
