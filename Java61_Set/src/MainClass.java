import java.util.ArrayList;
import java.util.HashSet;

/*
 * Set
 * 
 * ��ü�� �����ϴ� ����� ������ �ƴϰ� �̸��� �ƴϴ�..
 * �ߺ��� ��ü�� �ּҰ��� ���� �� ����...
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		ArrayList<TestClass> list1 = new ArrayList<>();
		
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		TestClass t3 = new TestClass();
		
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		list1.add(t3);
		list1.add(t3);
		for(TestClass temp : list1) {
			System.out.printf("list : %s\n",temp);
		}
		
		HashSet<TestClass> set1 = new HashSet<>();
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		set1.add(t3);
		set1.add(t3);
		set1.add(t3);
		for(TestClass temp : set1) {
			System.out.printf("set : %s\n",temp);
		}
		
		// ����
		set1.remove(t1);
		System.out.println("���� ��");
		for(TestClass temp : set1) {
			System.out.printf("set : %s\n",temp);
		}
	}
}

class TestClass{
	
}