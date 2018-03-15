import com.test.test1.TestClass1;
import com.test.test1.TestClass2;
import com.test.test2.TestClass3;
import com.test.test2.TestClass4;

/*
 * 1. ��Ű�� ��������  : ������Ʈ ��Ŭ�� > ExportŬ��
 * 2. Export â���� java > JAR File Ŭ��
 * 3. ���������� �ϴ� ��Ű���� �����ϽŴ����� �����Ѵ�..
 * 
 * �����ö�
 * 1.������Ʈ���� ��Ŭ�� > Properties
 * 2.Properties â���� ������ Java Build Path�� Ŭ��.
 * 3.������ Libraries���� Ŭ��
	4.Module Path�� Ŭ���ϰ� Add External Jars�� Ŭ��
      5.���ϴ� jar������ �������ϰ� Ȯ���� �����ش�.
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		TestClass1 t1 = new TestClass1();
		TestClass2 t2 = new TestClass2();
		TestClass3 t3 = new TestClass3();
		TestClass4 t4 = new TestClass4();
		System.out.printf("t1 : %s\n",t1);
		System.out.printf("t2 : %s\n",t2);
		System.out.printf("t3 : %s\n",t3);
		System.out.printf("t4 : %s\n",t4);
	}
}
