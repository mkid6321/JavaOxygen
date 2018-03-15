/*
 * ����� ���� ���� �����, ���� �߻��ϱ�, ���� ���ѱ�
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//throw new NegativeNumberException();
		//Excption�� ���� ��ӹ��� ���ܸ� ���ѱ�� �ֱ⶧���� ������ ����ó���� �ؾ��Ѵ�..
		try {
			testMethod1(5);
			testMethod1(100);
		} catch (Exception e) {
			System.out.println(e);
		}
		//RuntimeException�� ��ӹ��� ���ܰ� �߻��ϱ� ������ ���ܾ������
		//�ִ�???
		testMethod2(100);
		testMethod2(-100);
	}
	//try ~~catch�� ������ ���� ���ѱ��
	//NumberBoundException �׽�Ʈ
	//throws : ������ ������ ���ܰ� �߻��ϸ� �޼��带 ȣ���� ������ �����ϰڴٴ� �ǹ�, \
	//�޼��带 ȣ���� �ʿ��� ����ó���� �����Ӱ� �Ҽ�  �յ��� �ϴ� ����
	//thorw : ���� �߻���Ų��.
	static void testMethod1(int a1)throws NumberBoundsException {
		//���ǿ� ���� ������  NumberBoundsException
		if(!(a1 >= 0&& a1 <= 10) ) {
			throw new NumberBoundsException();
		}
		System.out.println("a1: %d\n");
	}
	//RuntimeException��ӹ��� ���ܰ� �߻��ϱ� ������ ����ó���� ���� �������� ������
	static void testMethod2(int a1) {
		if(a1 < 0) {
			throw new NegativeNumberException();
		}
		System.out.printf("a1 : %d\n",a1);
	}
}

//Exception�� ��ӹ��� Ŭ����
// �� ���ܰ� �߻��ϴ� �ڵ�� �ݵ�� ����ó�� ����� �Ѵ�.
class NumberBoundsException extends Exception {
	@Override
	public String getMessage() {
		return "tntwksms  0 ~ 10�������� �Ѵ�.";
	}
}

//RuntimeException �� ��ӹ��� Ŭ����
// �� ���ܰ� �߻��ϴ� �ڵ�� ����ó���� ���� �ʾƵ� �ȴ�.
class NegativeNumberException extends RuntimeException{
	@Override
	public String getMessage() {
		return "������� ������ �����ϴ�.";
	}
}