
public class JVM {
	
	static void testMethod(SuperClass sc) {
		sc.superMethod();
	}
}
// �����ڰ� ��ӹ��� Ŭ����
abstract class SuperClass{
	// �߻� �޼���
	abstract void superMethod();
}
