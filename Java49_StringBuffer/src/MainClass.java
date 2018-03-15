/*
 * StringBuffer 클래스
 * 
 * 관리하는 문자열 값을 변경하며 관리할 수 있는 객체
 * 멀티 쓰레드에 안전하다(동기화).
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer("abc");
		//관리하는 문자열의 길이
		System.out.printf("buf의 길이 : %d\n",buf1.length());
		System.out.printf("buf2의 길이 : %d\n",buf2.length());
		//문자열을 뒤에 추가한다..
		buf1.append("aaa");
		buf1.append("bbb");
		System.out.printf("append : %s\n",buf1);
		//자기 자신의값을 반환해서ㅓ 이렇게 가능..
		//메서드 자체가 자기 자신을 반환한다....
		buf1.append("ccc").append("ddd").append("eee");
		//이렇게 사용이 가능!!!
		buf1.append("dddd")
			.append("asdfxv")
			.append("213213");
		System.out.printf("append : %s\n",buf1);
		//삽입
		buf1.insert(2, "kkk");
		System.out.printf("insert : %s\n",buf1);
		//변경 (2~  6 - 1까지)
		buf1.replace(2, 6, "zzz");
		System.out.printf("replace : %s\n",buf1);
		//제거 (2~ 5-1까지)
		buf1.delete(2, 5);
		System.out.printf("delete : %s\n",buf1);
	}

}
