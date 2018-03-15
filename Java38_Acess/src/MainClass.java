import com.test.test1.TestClass2;

public class MainClass {
	public static void main(String[] args) {
		//���� ��Ű���� �ִ� Ŭ������ ��ü�� ����ϴ� ���
		//����  : public ,default,proteceted
		//�Ұ���  : private
		TestClass1 t1 = new TestClass1();
		System.out.printf("private : %d\n",t1.privateMember);
		System.out.printf("public : %d\n",t1.publicMember);
		System.out.printf("default : %d\n",t1.defaultMember);
		System.out.printf("protected : %d\n",t1.protectedMember);
		//�ٸ� ��Ű���� �ִ� Ŭ������ ��ü�� ������ ���
		TetsClass2 t2 = new TestClass2();
		//���� : public
		//�Ұ��� : private,default,proteted
	}
}

//���� ��Ű���� �ִ� Ŭ����
class TestClass1{
	private int privateMember = 100;
	public int publicMember = 200;
	int defaultMember = 300;
	protected int protectedMember = 400;
	
	void testMethod1() {
		//���������ڿ� ���� ���� ���� Ŭ���� ���ζ��
		/// �����Ӱ� ������ �����ϴ�.
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}

//���� ��Ű���� �ִ� Ŭ������ ��ӹ޴� ���
class SubClass1 extends TestClass1{
	public SubClass1() {
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}

//�ٸ���Ű���� Ŭ������ ��ӹ��� ���.
class SubClass2 extends TestClass2() {
	SubClass2(){
		System.out.printf("private : %d\n",privateMember);
		System.out.printf("public : %d\n",publicMember);
		System.out.printf("default : %d\n",defaultMember);
		System.out.printf("protected : %d\n",protectedMember);
	}
}






