/*
 * System Ŭ����
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//����ð�
		//1970�� 1��1��0�� 0��0�� 0ms (���� ǥ�ؽ�)
		//�� �������� 1ms ���� 1�ʰ� ������ ��
		// �ߺ����� �ʴ� ���� �ʿ��Ҷ� ����Ѵ�..
		
		long now = System.currentTimeMillis();
		System.out.printf("����Ű�:%d\n",now);
		//�迭 ����
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int [] array2 = new int[5];
		// ���� �迭 , �������� ���� ���ؽ� , Ÿ�Ϲ迭 
		// Ÿ�� �迭�� ���� �ε���, ������ ������ ����
		System.arraycopy(array1, 2, array2, 0, 5);
		//�̰��� ���°��� �������� �ӵ��� ������ �Ѳ����� �����ؼ� �����Ƿ�
		//�迭����� �̰��� ���°��� ����..
		for(int number : array2) {
			System.out.printf("�迭���� : %d\n",number);
		}
		
		//�޸� û��(������ Ŀ����)
		//�ڹٴ� ������ �÷��͸� �˾Ƽ� �����ֱ� ������
		//���� �Ͻ� �ʿ�� ����..
		for(int i = 0; i < 100; i++) {
			System.gc();
			System.out.println("gc �׽�Ʈ" + i);
		}
	}
}
