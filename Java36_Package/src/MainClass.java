// import : �� Java ���Ͽ��� TestClass2�� ����ϸ�
// com.test.test1 ��Ű���� �ִ� TestClass2��°� ���
import com.test.test1.TestClass2;
// *�� ����ϸ� �ش� ��Ű���� �ִ� Ŭ������ ����
// import �ȴ�.
import com.test.test2.*;

/*
 * ��Ű�� ����
 * 
 * ��Ű�� : �ϳ��� �ڹ� ���α׷����� �� ���� Ŭ��������
 * ȿ�������� �����ϱ� ���� ���丮 ���� ������ �����ϴ�
 * ����
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ٸ� ��Ű���� ��ü�� ����
		// �ٸ� ��Ű���� Ŭ������ ����� ���� �ش� Ŭ������
		// �����ϴ� ��Ű�� ����� ����ؾ� �Ѵ�.
		com.test.test1.TestClass1 t1 = new com.test.test1.TestClass1();
		System.out.printf("t1 : %s\n", t1);
		// ��� �κп� import�� ����Ͽ��� ������
		// ��Ű������ �����Ѵ�.
		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);
		
		TestClass3 t3 = new TestClass3();
		TestClass4 t4 = new TestClass4();
		System.out.printf("t3 : %s\n", t3);
		System.out.printf("t4 : %s\n", t4);
		// �̹� import�� Ŭ������ ���ϸ��� �ٸ� ��Ű����
		// Ŭ������ ����ϰ� �ʹٸ� import�� �Ұ��ϱ�
		// ������ ��Ű������ �����Ͽ� �ۼ��ؾ� �Ѵ�.
		com.test.test3.TestClass2 t5 = new com.test.test3.TestClass2();
		System.out.printf("t5 : %s\n", t5);
	
	}
}






