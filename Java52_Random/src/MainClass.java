import java.util.Random;

/*
 * Random Ŭ����
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		// 5~19������ �������� ���� ���� 20���� �����Ѵ�.
		//���� ������ �������� �����Ҷ�..
		Random rnd = new Random(500);
		//������ ����
		int cnt = 19 - 5 + 1;
		for(int i = 0; i < 20; i++) {
			int number = rnd.nextInt(cnt) + 5;
			System.out.printf("%d,",number);
		}
	}
}
