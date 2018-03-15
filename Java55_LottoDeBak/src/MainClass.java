import java.util.Random;
import java.util.Scanner;

/*
 * 로또번호 추출기
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			Lotto lt = new Lotto();
			lt.startLotto();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Lotto {
	// 1 ~ 45까지 담을 배열..
	private int[] number = new int[45];
	// 사용자가 입력한 게임의 개수
	private int gameCnt = 0;
	// 키보드 입력을 위한 클래스
	private Scanner scan = new Scanner(System.in);

	public void startLotto() throws Exception {
		getGameCount();
		// 게임의 개수만큼 반복
		for (int i = 0; i < gameCnt; i++) {
			setLottoNumber();
			getLottoNumber();
		}
	}

	// 사용자에게 게임의 수를 입력받는 메서드
	private void getGameCount() throws Exception {
		System.out.println("게임 계수 : ");
		gameCnt = scan.nextInt();
	}

	// 로또 번호를 초기화하는 메서드
	private void setLottoNumber() {
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
	}

	// 로또 번호를 추출하는 메서드
	private void getLottoNumber() {
		Random rnd = new Random();
		// 숫자의 개수 = 최대숫자 - 최소숫자 + 1
		int max = 45;
		int cnt = max - 1 + 1;
		for (int i = 0; i < 7; i++) {
			// 랜덤번째 인덱스값을 추출
			int idx = rnd.nextInt(cnt);
			// 추첨번호
			int a1 = number[idx];
			System.out.printf("%3d", a1);
			// 범위내의 숫자중 마지막 숫자를 인덱스번째에 넣어준다..
			number[idx] = number[max - 1];
			//최대 숫자를 줄인다.
			max--;
		}
		System.out.println();
	}

}