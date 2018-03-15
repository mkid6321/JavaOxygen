import java.util.ArrayList;

/*
 * List 컬렉션
 * 
 * 객체의주소값을 지정한 순서대로관히는
 * 01부터 시작한느
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("문자열1");
		list1.add("문자열2");
		list1.add("문자열3");
		
		String str1 = (String)list1.get(0);
		String str2 = (String)list1.get(1);
		String str3 = (String)list1.get(2);
		
		System.out.printf("str1 : %s\n",str1);
		System.out.printf("str2 : %s\n",str2);
		System.out.printf("str3 : %s\n",str3);
		
		ArrayList<String> list2 = new ArrayList<>();
		//객체추가
		list2.add("문자열100");
		list2.add("문자열200");
		list2.add("문자열300");
		
		//객체삽입
		list2.add(1,"문자열400");
		//관리하고 있는 객체의 주소값의 계수
		int cnt = list2.size();
		System.out.printf("객체의 개수 : %d\n",cnt);
		
		//객체 가져오기
		for(int i = 0; i <list2.size(); i++) {
			String str = list2.get(i);
			System.out.printf("list2 : %s\n",str);
		}
		
		//객체의 주소값을 셋팅..
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//수정하기..
		list2.set(1, "문자열");
		System.out.println("수정후");
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//삭제하기
		list2.remove(1);
		System.out.println("삭제후");
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//초기화..
		list2.clear();
		int cnt2 = list2.size();
		System.out.printf("초기화 후 : %d\n",cnt2);
	}
	
}
