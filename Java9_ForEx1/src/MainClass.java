/*
 * 1���� 1�� �����Ǵ� �����߿�
 * 3�� ����̰ų� 5�� ��� �̰ų� 7�� ����� ����
 * 100���� ����ϴ� ���α׷�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� �����Ѵ�.
		int number = 1;
		// ����� ������ ����
		int max_cnt = 100;
		// ����� ������ ����
		int cnt = 0;
		// ����� ������ ������ 100���� �ɶ����� �ݺ�
		while(cnt < max_cnt) {
			// ���ڰ� 3�� ������� 5�� ������� 7�� �������
			// �˻��Ѵ�.
			// 3, 5, 7�� ������ ����Ѵ�.	
			if(number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
				// ����Ѵ�.
				System.out.println(number);
				// ����� ������ ������ �����Ѵ�.
				cnt++;
			}
			// ���� ���ڸ� �����Ѵ�.
			number++;
		}
		

	}
}








