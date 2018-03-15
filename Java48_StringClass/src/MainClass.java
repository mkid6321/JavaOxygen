/*
 * String클래스
 * 자바에서 문자열을 관리하는 클래스
 * 
 * 
 * toStrig : String이 관리하는 문자열 값을 반환..
 * 
 * 
 * ""는 문자열을 바꿀수가 없다..
 */
public class MainClass {
	public static void main(String[] args) {
		//Strig 객체 생성..
		String str1 = new String("문자열");
		String str2 = "문자열";
		if(str1 == str2) {
			System.out.println("같은객체입니다.");
		}else {
			System.out.println("다른객체입니다.");
		}
		//문자열 갯
		System.out.printf("str1의 개수 : %d\n",str1.length());
		System.out.printf("문자열의 개수 : %d\n","문자열".length());
		
		String str3 = "abcdef";
		//charAt : 주어진 인덱스(0) 번째의 글자를 반환한다..
		char c1 = str3.charAt(2);
		System.out.printf("c1:%c\n",c1);
		System.out.printf("c1의 정수값 : %d\n",(int)c1);
		
		//문자열 검사
		// ...로 시작하는지
		boolean chk1 = str3.startsWith("abc");
		// ...로 끝나는지
		boolean chk2 = str3.endsWith("def");
		
		//인덱스
		int idx1 = str3.indexOf("cde");
		int idx2 = str3.indexOf("zzz");
		System.out.printf("startsWith : %s\n", chk1);
		System.out.printf("endWith : %s\n", chk2);
		System.out.printf("indexOf : %s\n", idx1);
		System.out.printf("indexOf : %s\n", idx2);
		//존재안하는문자는 -1반환..
		
		//문자열이 같은지 비교
		String str4 = "안녕하세요";
		String str5 = "안녕하세요";
		// 안녕하세요 객체 하나가지고 돌려쓴다. 그래서 str4,str5의 객체는 같은거다..
		System.out.println("str4 와 str5는");
		//안녕하세요라는 객체를 새로 만든다...
		String str6 = new String("안녕하세요");
		
		//이것은 문자열 값을 비교하는것이 아니다..
		if(str4 == str5) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		System.out.println("str4 와 str6은");
		if(str4 == str6) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		if(str4.equals(str6)) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		//문자열 만들기..
		// 이름 + 홍길동 + 나이 + 27 같은거다..
		String format = "이름은%s, 나이는 %d입니다";
		String str7 = String.format(format, "홍길동",30);
		String str8 = String.format(format, "김길동",40);
		System.out.printf("str7 : %s\n",str7);
		System.out.printf("str8 : %s\n",str8);
		
		//기준 문자열을 이용해 문자열을 자른다...
		String str9 = "aaa_bbb_ccc_ddd_eee";
		String[] array1 = str9.split("_");
		for(String temp : array1) {
			System.out.println(temp);
		}
		
		String str10 = "ABcdEf";
		//대문자 -> 소문자
		String str11 = str10.toLowerCase();
		//소문자 -> 대문자
		String str12 = str10.toUpperCase();
		System.out.printf("str11 : %s\n",str11);
		System.out.printf("str12 : %s\n",str12);
		
		//양쪽공백 다지우고 하는것이 좋다..
		//문자 양쪽 공백 제거..
		String str13 = "     문자열       ";
		String str14 = str13.trim();
		System.out.printf("[%s]\n",str13);
		System.out.printf("[%s]\n",str14);
	}
	
}
