import java.util.ArrayList;
import java.util.HashSet;

/*
 * Set
 * 
 * 객체를 관리하는 방법이 순서도 아니고 이름도 아니다..
 * 중복된 객체의 주소값은 담을 수 없다...
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
		
		// 삭제
		set1.remove(t1);
		System.out.println("삭제 후");
		for(TestClass temp : set1) {
			System.out.printf("set : %s\n",temp);
		}
	}
}

class TestClass{
	
}