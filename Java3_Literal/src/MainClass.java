/*
 * ���ͷ� : �ڵ忡 �ۼ��ϴ� ����
 * 
 * ���� ���ͷ� : 100, 200, 300L, 400l
 * �Ǽ� ���ͷ� : 11.11, 22.22F, 33.33f
 * �� ���ͷ� : true, false
 * ���� ���ͷ� : 'A', '��'
 * ���ڿ� ���ͷ� : "�ȳ��ϼ���", "abcd"
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���ͷ�(4byte)
		System.out.println("���� : " + 100);
		System.out.println("���� : " + 2147483647);
		System.out.println("���� : " + -2147483648);
		// ���� ���ͷ��� L, l�� �����ָ� 8����Ʈ ��������
		// ��������� �ű⿡ ����ȴ�.
		System.out.println("���� : " + 2147483648l);
		System.out.println("���� : " + -2147483649L);
		System.out.println("���� : " + 9223372036854775807L);
		System.out.println("���� : " + -9223372036854775808L);
		
		// �Ǽ� ���ͷ�(8byte)
		System.out.println("�Ǽ� : " + 11.11);
		// �������� �����ϰ� �ʹٸ� F, f�� �����ش�(4byte)
		System.out.println("�Ǽ� : " + 22.22F);
		
		// �� ���ͷ�(1bit)
		// true : ��
		// false : ����
		System.out.println("�� : " + true);
		System.out.println("�� : " + false);
		// ����(2byte)
		System.out.println("���� : " + 'A');
		System.out.println("���� : " + '��');
		// ���ڿ�(���� �� ��ŭ... ��� ���ͷ��� �ƴϴ�)
		System.out.println("���ڿ� : " + "�ȳ��ϼ���");
		
	}

}





