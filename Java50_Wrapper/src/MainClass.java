/*
 * 
 * Wrapper Class
 * 
 * �⺻�ڷ���(byte,short,int,long,double,float,boolean,char)
 * ���� ��ü�� �����ؼ� ������ �� �ִ� ��ü
 * 
 * ��ü�� �����ϰų� parse �迭 �޼��带 ����Ѵ�..
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//��ü�� ����(Boxing)
		Integer a1 = new Integer(100);
		Double a3 = new Double(11.11);
		
		Integer a10 = Integer.valueOf(100);
		Double a11 = Double.valueOf(11.11);
		
		//��ü�� �����ϴ� ���� �����´�..
		//UnBoxing
		int number1 = a10.intValue();
		double number2 = a11.doubleValue();
		System.out.printf("number1 : %d\n",number1);
		System.out.printf("number1 : %f\n",number2);
		
		//autoBox
		//���� 100�����ϴ� IntgerŬ����Ÿ���� ��ü�� ��������鼭 �� �ּҰ��� a21�� �����̴�
		Integer a20 = 100;
		Double a21 = 11.11;
		//Auto UnBoxing
		int number3 = a20;
		double number4 = a21;
		System.out.printf("number3 : %s\n",number3);
		System.out.printf("number4 : %s\n",number4);
	
		TestClass t1 = new TestClass();
		testMethod(t1);
		testMethod("���ڿ�");
		testMethod(100);
		testMethod(11.11);
		
		//parse �迭 �޼���
		String str1 = "100";
		String str2 = "200";
		String str3 = str1 + str2;
		System.out.printf("str3 : %s\n",str3);
		
		int a100 = Integer.parseInt(str1);
		int a200 = Integer.parseInt(str2);
		int a300 = a100 + a200;
		System.out.printf("a300 : %d\n",a300);
	}
	static void testMethod(Object obj) {
		if(obj instanceof Integer) {
			System.out.println("����");
		}else if(obj instanceof Double) {
			System.out.println("�Ǽ�");
		}else if(obj instanceof String) {
			System.out.println("���ڿ�");
		}else if(obj instanceof TestClass) {
			System.out.println("TestŬ����");
		}
	}
}



class TestClass{
	
}