/*
 * static ��ø Ŭ����
 * 
 * ���� Ŭ������ �ܺ� Ŭ������ ��ü�� ������ �ʰ�
 * ��ü ������ �����ϴ�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("OuterClass.a1 : %d\n", OuterClass.a1);
		
		OuterClass.outerMethod();
		
		OuterClass.InnerClass in1 = new OuterClass.InnerClass();
		in1.innerMethod();
	}

}
// static �ɹ��� ��ü�� �������� �ʰ� ����ϱ� ������
// static Ŭ������ �ܺ� Ŭ������ ��ü ���� ���� �ٷ�
// ����� ������ �ɹ��� �ȴ�.
class OuterClass{
	static int a1 = 100;
	int a2 = 200;
	
	static void outerMethod() {
		System.out.println("outerMethod");
	}
	static class InnerClass{
		void innerMethod() {
			System.out.println("innerMethod");
			// �ܺ� Ŭ������ �ɹ��� ���
			System.out.printf("a1 : %d\n", a1);
			// �Ϲ� �ɹ��� ����� �Ұ��ϴ�.
			// System.out.printf("a2 : %d\n", a2);
		}
	}
}











