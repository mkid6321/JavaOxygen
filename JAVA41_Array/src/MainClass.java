
/*
 * �迭 ����..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//������ ��� ��� 5���� �����ϴ� �迭 ����.
		int[] array1 = {10,20,30,40,50};
		//0���� �ʱ�ȭ �Ǵ� �迭 ����..
		int[] array2 = new int[5];
		System.out.printf("array1.length : %d\n",array1.length);
		System.out.printf("array2.length : %d\n",array2.length);
		//�迭�� �� �����ϱ�
		for(int i = 0; i < array2.length; i++) {
			array2[i] = 100 + i;
		}
		//�迭�� �� ��������
		for(int i = 0; i<array2.length; i++) {
			int number = array2[i];
			System.out.printf("array2[%d] : %d\n",i,number);
		}
		
		//�ε�����° array2 �迭�� ���� ������ number��� ������ ����ش�..
		
		for(int number : array2) {
			System.out.printf("array2 : %d\n",number);
		}
		
		//args �Ű� ����
		if(args != null){
			for(String command : args) {
				System.out.println("args : %d\n");
			}
		}
	}
}
