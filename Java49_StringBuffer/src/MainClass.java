/*
 * StringBuffer Ŭ����
 * 
 * �����ϴ� ���ڿ� ���� �����ϸ� ������ �� �ִ� ��ü
 * ��Ƽ �����忡 �����ϴ�(����ȭ).
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer("abc");
		//�����ϴ� ���ڿ��� ����
		System.out.printf("buf�� ���� : %d\n",buf1.length());
		System.out.printf("buf2�� ���� : %d\n",buf2.length());
		//���ڿ��� �ڿ� �߰��Ѵ�..
		buf1.append("aaa");
		buf1.append("bbb");
		System.out.printf("append : %s\n",buf1);
		//�ڱ� �ڽ��ǰ��� ��ȯ�ؼ��� �̷��� ����..
		//�޼��� ��ü�� �ڱ� �ڽ��� ��ȯ�Ѵ�....
		buf1.append("ccc").append("ddd").append("eee");
		//�̷��� ����� ����!!!
		buf1.append("dddd")
			.append("asdfxv")
			.append("213213");
		System.out.printf("append : %s\n",buf1);
		//����
		buf1.insert(2, "kkk");
		System.out.printf("insert : %s\n",buf1);
		//���� (2~  6 - 1����)
		buf1.replace(2, 6, "zzz");
		System.out.printf("replace : %s\n",buf1);
		//���� (2~ 5-1����)
		buf1.delete(2, 5);
		System.out.printf("delete : %s\n",buf1);
	}

}
