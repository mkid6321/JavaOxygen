/*
 * ���α׷� ��ü���� ���ϳ��� ��ü �����ؼ� ����Ҽ� �ֵ��� ����� ����
 * 
 * 1. �������� ���� �����ڸ� private�� �Ѵ�
 * 2. ��ü�� �����ؼ� �ּҰ��� ��ȯ�ϴ� static �޼��带 ����..
 *3. ����� �Ұ��ϵ��� class�� final class�� �Ѵ�.. 
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		//TestClass t1 = new TesttClass();
		//�������� ���������ڰ�  private�̱� ������
		//���� ��ü�� �����Ѵ°��� �Ұ����ϴ�.
		TestClass t1 = TestClass.getInstance();
		TestClass t2 = TestClass.getInstance();
		TestClass t3 = TestClass.getInstance();
		System.out.printf("t1 : %s\n",t1);
		System.out.printf("t2 : %s\n",t2);
		System.out.printf("t3 : %s\n",t3);
	}

}


// ��Ŭ��
//class �տ� final ������ ��� ���´�...
final class TestClass{
	//������ ��ü�� �ּҰ��� ��Ƴ��� ��������
	private static TestClass t1 = null;
	//�����ڿ� ���������ڸ��� private�ش� .
	private TestClass() {
		
	}
	//��ü�� �����ؼ� ��ȯ�ϴ� �޼���
	public static TestClass getInstance() {
		if(t1 == null) {
			t1 = new TestClass();
		}
		return t1;
	}
}