/*
 * ���ֹ߻��ϴ� ����
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//NullpointerException : ��ü�� ���Ұ��� ������
		//���� ���� ���������� ����� ���
		try {
//			TestClass t1 = null;
//			t1.testMethod();
//			ArrayIndexOutOfBoundsException
//			�迭�� ������ �Ѿ� �������/
//			int[] array1 = new int[3];
//			array1[99] = 100;
			//ClassCastException
			// ��ü�� �ּҰ��� ���������� ���� ��
			// ���� ����ȯ�ؼ� �ִ°��..
//			SuperClass s1 = new SubClass();
//			SuperClass s2 = new SuperClass();
//			
//			SubClass sub1 = (SubClass)s1;
//			System.out.println(sub1);
//			
//			SubClass sub2 = (SubClass)s2;
//			System.out.println(sub2);
			
			//JVM���� ��ü�� �����ϵ��� ����� �����Ѵ�
			//ClassNotFoundException
			//������ Ŭ������ ã���� ���� ���
			//JVM���� ������ �����ϵ��� ����� �����Ѵ�.
			Class.forName("com.test.Hahahah");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �߻�");
		}catch(ClassCastException e) {
			System.out.println("��ü��ȯ ����");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ���� ã�� ���ϴ� ����..");
		}catch(Exception e) {
			System.out.println("��翹��");
		}
	}
}

class TestClass{
	void testMethod() {
		System.out.println("testMethod");
	}
}

class SuperClass{
	
}

class SubClass extends SuperClass{
	
}