/**
 * 
 * @author lee
 *ĸ��ȭ
 *������ ��ü�� ��� ����������� �����͸� ��ȣ�ϴ� ����
 *
 *��� ������ ���������ڸ� private�� �ְ� �����ϰ���
 *�ϴ� ����� ���� �޼��带 �����Ѵ�..
 *
 *private ������ �����ϴ� �޼���(setter)
 *��ȯ�ϴ� �޼���(Getter)�� ������ �Ǿ� �ִ� �����
 *Ư���� ������Ƽ(Property)��� �θ���.
 *
 */
public class MainClass {
	public static void main(String[] args) {
		TestClass t1 = new TestClass(1000);
		TestClass t2 = new TestClass(2000);
		t1.printMember();
		t2.printMember();
		System.out.println("----------");
		
		t1.setA2(3000);
		System.out.printf("a2  %d\n",t1.getA2());
		
//		System.out.println("a3: %d\n",);
		
		t1.setA4(5000);
		System.out.printf("a4 : %d\n",t1.getA4());
	}
}

//ĸ��ȭ�� ������ Ŭ����
class TestClass{
	private int a1 = 100;
	private int a2 = 200;
	private int a3 = 300;
	private int a4 = 400;
	private int a5 = 500;
	private int a6 = 600;
	private int a7 = 700;
	private int a8 = 800;
	private int a9 = 900;
	private int a10 = 1000;
	
	//�����ڸ� ���� ��ü ������ �� �ѹ��� �����Ҽ��ֵ���
	//�Ҽ��� �ִ�.
	public TestClass(int _a1) {
		this.a1 = _a1;
	}
	
	public void printMember() {
		System.out.printf("a1 : %d\n",a1);
		System.out.printf("a2 : %d\n",a2);
		System.out.printf("a3 : %d\n",a3);
		System.out.printf("a4 : %d\n",a4);
	}
	//private ��� ������ ���� �����ϴ� �޼���
	//Setter : set + ������(ù���ڴ� �빮��)
	public void setA2(int a2) {
		this.a2 = a2;
	}
	
	//private ��� ������ ���� ��ȯ�ϴ� �޼���
	
	public int getA2() {
		return a2;
	}
	
	//getter�� �����ϴ� Property : Read only Porperty
	
	//������� �����ϱ� 
	public void setA4(int a4) {
		if(a4 > 0) {
			this.a4 = a4;
		}
	}
	public int getA4() {
		return a4;
	}

	//��Ŭ�������� getter,setter�ڵ� ����.
	//Source > Generate Getting/setters
	public int getA5() {
		return a5;
	}

	public void setA5(int a5) {
		this.a5 = a5;
	}

	public int getA6() {
		return a6;
	}

	public void setA6(int a6) {
		this.a6 = a6;
	}

	public int getA7() {
		return a7;
	}

	public void setA7(int a7) {
		this.a7 = a7;
	}

	public int getA8() {
		return a8;
	}

	public void setA8(int a8) {
		this.a8 = a8;
	}

	public int getA9() {
		return a9;
	}

	public void setA9(int a9) {
		this.a9 = a9;
	}

	public int getA10() {
		return a10;
	}

	public void setA10(int a10) {
		this.a10 = a10;
	}
	
}