/*
 * if �� : ���ǿ� ������ ��� ����Ǵ� �κ�
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ��
		// ���ǿ� ������ ��쿡�� ����ȴ�.
		int a1 = 10;
		if(a1 > 20) {
			System.out.println("a1�� 20���� Ů�ϴ�");
		}
		if(a1 < 20) {
			System.out.println("a1�� 20���� �۽��ϴ�");
		}
		// if ~ else
		// ���ǽ��� �����ϸ� if �κ�, �׷��� ������
		// else �κ��� ����ȴ�.
		if(a1 > 5) {
			System.out.println("a1�� 5���� Ů�ϴ�");
		} else {
			System.out.println("a1�� 5���� ũ�� �ʽ��ϴ�");
		}
		if(a1 > 20) {
			System.out.println("a1�� 20���� Ů�ϴ�");
		} else {
			System.out.println("a1�� 20���� ũ�� �ʽ��ϴ�");
		}
		// if ~ else if ~ else
		// �����ϴ� ������ ���������� ������ �˻��ϸ� �����´�.
		if(a1 > 30) {
			System.out.println("a1�� 30���� Ů�ϴ�");
		} else if(a1 > 20) {
			System.out.println("a1�� 20���� Ů�ϴ�");
		} else if(a1 > 10) {
			System.out.println("a1�� 10���� Ů�ϴ�");
		} else {
			System.out.println("a1�� 10, 20, 30���� ũ�� �ʽ��ϴ�");
		}
	}

}





