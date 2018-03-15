import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 
 * 학생 정보를 관리하는 프로그램
 * 
 * 1. 학생정보추가
 * 2. 학년별 학생의 이름
 * 3. 각 과목별 총점과 평균
 * 4. 학년별 총점과 평균
 * 
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.startManager();
	}
}

class StudentManager {
	Scanner scan = new Scanner(System.in);
	// 이방법은 복잡해서 클래스로 학생정보하는것이 편하다...
	ArrayList<HashMap<String, Object>> main_list = new ArrayList<>();

	public void startManager() {
		//테스트용 데이터 저장.
		addDummyData();
		
		int menu = 0;
		do {
			menu = showMenu();
			switch (menu) {
			case 1: // 학생 정보 추가.
				System.out.println("학생 정보 추가");
				addStudentInfo();
				break;
			case 2: // 학년별 학생의 이름
				System.out.println("학년별 학생의 이름");
				showStudentName();
				break;
			case 3: // 각 과목별 평균과 총점
				System.out.println("각 과목별 평균과 총점");
				break;
			case 4: // 학년별 총점과 평균
				System.out.println("학년별 총점과 평균");
				break;
			case 5: // 종료.
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		} while (menu != 5);
	}
	// 기능 테스트를 위한 가상 데이터(더미) 추가
	private void addDummyData() {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "공유");
		map1.put("grade", 1);
		map1.put("kor", 100);
		map1.put("eng", 90);
		map1.put("math", 80);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "이동욱");
		map1.put("grade", 2);
		map1.put("kor", 40);
		map1.put("eng", 55);
		map1.put("math", 99);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "이호성");
		map1.put("grade", 2);
		map1.put("kor", 100);
		map1.put("eng", 77);
		map1.put("math", 45);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "유인나");
		map1.put("grade", 3);
		map1.put("kor", 55);
		map1.put("eng", 66);
		map1.put("math", 33);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "김고은");
		map1.put("grade", 1);
		map1.put("kor", 33);
		map1.put("eng", 55);
		map1.put("math", 99);
		main_list.add(map1);
	}
	// 메뉴 관리 기능...
	private int showMenu() {
		// 학생 정보 추가 기능.
		// 1. 학생정보추가
		// 2. 학년별 학생의 이름
		// 3. 각 과목별 총점과 평균
		// 4. 학년별 총점과 평균
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학년별 학생의 이름");
		System.out.println("3. 각 과목별 총점과 평균");
		System.out.println("4. 학년별 총점과 평균");
		System.out.println("5. 종료");
		System.out.println("메뉴 입력 :");
		// 메뉴를 입력받는다.
		int menu = scan.nextInt();

		return menu;
	}

	// 학생 정보 추가 기능
	private void addStudentInfo() {
		// 학생의 정보를 입력 받는다.
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("국어 : ");
		int korean = scan.nextInt();
		System.out.print("영어 : ");
		int english = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		// 입력받은 정보를 저장한다..
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("grade", grade);
		map.put("kor", korean);
		map.put("eng", english);
		map.put("math", math);
		main_list.add(map);

		System.out.println(main_list);
		System.out.println("저장 완료\n\n");
	}
	// 학년별 학생의 이름
	private void showStudentName() {
		ArrayList<String> grade1 = new ArrayList<>();
		ArrayList<String> grade2 = new ArrayList<>();
		ArrayList<String> grade3 = new ArrayList<>();
		
		//학생의 수만큼 반복
		for(HashMap<String, Object> map : main_list) {
			//학생 정보 객체를 추출
			int grade = (Integer)map.get("grade");
			String name = (String)map.get("name");
			//학년 별로 분기한다.
			switch(grade) {
			case 1:
				grade1.add(name);
				break;
			case 2:
				grade2.add(name);
				break;
			case 3:
				grade3.add(name);
				break;
			}
			//학생의 이름을 저장한다.
		}
		
		
		//출력한다.
		System.out.println("1학년");
		for(String name : grade1) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("2학년");
		for(String name : grade2) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("3학년");
		for(String name : grade3) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println();
	}
	// 각 과목별 총점과 평균을 구하는 기능
	// 학년별 총점과 평균을 구하는 기능..
}