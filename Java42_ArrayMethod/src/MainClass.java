/*
 * �迭�� �޼����� �Ű�����
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = add(10, 20);
		System.out.printf("result1 : %d\n", result1);
		
		int result2 = add(10, 20, 30);
		System.out.printf("result2 : %d\n", result2);
		
		int result3 = add(10, 20, 30, 40);
		System.out.printf("result3 : %d\n", result3);
		
		int [] array1 = {10, 20, 30, 40, 50, 60};
		int result4 = add(array1);
		System.out.printf("result4 : %d\n", result4);
		
		int [] array2 = {10, 20, 30, 40, 50, 60, 70, 80};
		int result5 = add(array2);
		System.out.printf("result5 : %d\n", result5);
		
		int result6 = add2("���ڿ�1", 10, 20, 30, 40, 50);
		System.out.printf("result6 : %d\n", result6);
		
		int result7 = add2("���ڿ�2", 10, 20, 30, 40, 50, 60, 70);
		System.out.printf("result7 : %d\n", result7);
		
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	static int add(int [] array) {
		int total = 0;
		for(int number : array) {
			total = total + number;
		}
		return total;
	}
	// ������ �Ű�����
	// ������ �Ű������� �ٸ� �Ű������� ���� ���� ���
	// ������ �Ű������� ��ġ�� �׻� ���� �ڰ� �Ǿ�� �Ѵ�.
	static int add2(String str, int ... array) {
		System.out.printf("str : %s\n", str);
		int total = 0;
		for(int number : array) {
			total = total + number;
		}
		return total;
	}

}






