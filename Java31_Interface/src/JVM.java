
public class JVM {
	static void testMethod1(Inter1 in1) {
		in1.interMethod1();
	}
	static void testMethod2(Inter2 in2) {
		in2.interMethod2();
	}
	static void testMethod3(Inter3 in3) {
		in3.interMethod3();
	}
}
// �������̽�
// �������̽��� ��� �޼���� �߻� �޼���
interface Inter1{
	void interMethod1();
}
interface Inter2{
	void interMethod2();
}
interface Inter3{
	void interMethod3();
}







