/*
 * ���� : ������ ������ ����, �ڵ������ ó���� ������ ����
 * ����ó�� : ���ܰ� �߻������� ���α׷��� �������Ǵ� ���� ����
 * 			�����ڰ� ����� ���� �ڵ带 ������ ��� �̾�� �� �ֵ��� �ϴ°�!!
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		System.out.println("���� �߻� ��");
		try {
			//������ ���� �߻�
			int a1 = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(); //���������� ���ε� ǥ���Ѵ�...
		}
		
		System.out.println("���� �߻� ��");
		
		
		
		
	}
}
