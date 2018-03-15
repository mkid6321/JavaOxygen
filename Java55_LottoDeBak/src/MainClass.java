import java.util.Random;
import java.util.Scanner;

/*
 * �ζǹ�ȣ �����
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
	// 1 ~ 45���� ���� �迭..
	private int[] number = new int[45];
	// ����ڰ� �Է��� ������ ����
	private int gameCnt = 0;
	// Ű���� �Է��� ���� Ŭ����
	private Scanner scan = new Scanner(System.in);

	public void startLotto() throws Exception {
		getGameCount();
		// ������ ������ŭ �ݺ�
		for (int i = 0; i < gameCnt; i++) {
			setLottoNumber();
			getLottoNumber();
		}
	}

	// ����ڿ��� ������ ���� �Է¹޴� �޼���
	private void getGameCount() throws Exception {
		System.out.println("���� ��� : ");
		gameCnt = scan.nextInt();
	}

	// �ζ� ��ȣ�� �ʱ�ȭ�ϴ� �޼���
	private void setLottoNumber() {
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
	}

	// �ζ� ��ȣ�� �����ϴ� �޼���
	private void getLottoNumber() {
		Random rnd = new Random();
		// ������ ���� = �ִ���� - �ּҼ��� + 1
		int max = 45;
		int cnt = max - 1 + 1;
		for (int i = 0; i < 7; i++) {
			// ������° �ε������� ����
			int idx = rnd.nextInt(cnt);
			// ��÷��ȣ
			int a1 = number[idx];
			System.out.printf("%3d", a1);
			// �������� ������ ������ ���ڸ� �ε�����°�� �־��ش�..
			number[idx] = number[max - 1];
			//�ִ� ���ڸ� ���δ�.
			max--;
		}
		System.out.println();
	}

}