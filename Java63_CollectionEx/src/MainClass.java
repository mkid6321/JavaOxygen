import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 
 * �л� ������ �����ϴ� ���α׷�
 * 
 * 1. �л������߰�
 * 2. �г⺰ �л��� �̸�
 * 3. �� ���� ������ ���
 * 4. �г⺰ ������ ���
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
	// �̹���� �����ؼ� Ŭ������ �л������ϴ°��� ���ϴ�...
	ArrayList<HashMap<String, Object>> main_list = new ArrayList<>();

	public void startManager() {
		//�׽�Ʈ�� ������ ����.
		addDummyData();
		
		int menu = 0;
		do {
			menu = showMenu();
			switch (menu) {
			case 1: // �л� ���� �߰�.
				System.out.println("�л� ���� �߰�");
				addStudentInfo();
				break;
			case 2: // �г⺰ �л��� �̸�
				System.out.println("�г⺰ �л��� �̸�");
				showStudentName();
				break;
			case 3: // �� ���� ��հ� ����
				System.out.println("�� ���� ��հ� ����");
				break;
			case 4: // �г⺰ ������ ���
				System.out.println("�г⺰ ������ ���");
				break;
			case 5: // ����.
				System.out.println("����Ǿ����ϴ�.");
				break;
			default:
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
			}
		} while (menu != 5);
	}
	// ��� �׽�Ʈ�� ���� ���� ������(����) �߰�
	private void addDummyData() {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "����");
		map1.put("grade", 1);
		map1.put("kor", 100);
		map1.put("eng", 90);
		map1.put("math", 80);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "�̵���");
		map1.put("grade", 2);
		map1.put("kor", 40);
		map1.put("eng", 55);
		map1.put("math", 99);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "��ȣ��");
		map1.put("grade", 2);
		map1.put("kor", 100);
		map1.put("eng", 77);
		map1.put("math", 45);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "���γ�");
		map1.put("grade", 3);
		map1.put("kor", 55);
		map1.put("eng", 66);
		map1.put("math", 33);
		main_list.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "�����");
		map1.put("grade", 1);
		map1.put("kor", 33);
		map1.put("eng", 55);
		map1.put("math", 99);
		main_list.add(map1);
	}
	// �޴� ���� ���...
	private int showMenu() {
		// �л� ���� �߰� ���.
		// 1. �л������߰�
		// 2. �г⺰ �л��� �̸�
		// 3. �� ���� ������ ���
		// 4. �г⺰ ������ ���
		System.out.println("1. �л� ���� �߰�");
		System.out.println("2. �г⺰ �л��� �̸�");
		System.out.println("3. �� ���� ������ ���");
		System.out.println("4. �г⺰ ������ ���");
		System.out.println("5. ����");
		System.out.println("�޴� �Է� :");
		// �޴��� �Է¹޴´�.
		int menu = scan.nextInt();

		return menu;
	}

	// �л� ���� �߰� ���
	private void addStudentInfo() {
		// �л��� ������ �Է� �޴´�.
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("�г� : ");
		int grade = scan.nextInt();
		System.out.print("���� : ");
		int korean = scan.nextInt();
		System.out.print("���� : ");
		int english = scan.nextInt();
		System.out.print("���� : ");
		int math = scan.nextInt();
		// �Է¹��� ������ �����Ѵ�..
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("grade", grade);
		map.put("kor", korean);
		map.put("eng", english);
		map.put("math", math);
		main_list.add(map);

		System.out.println(main_list);
		System.out.println("���� �Ϸ�\n\n");
	}
	// �г⺰ �л��� �̸�
	private void showStudentName() {
		ArrayList<String> grade1 = new ArrayList<>();
		ArrayList<String> grade2 = new ArrayList<>();
		ArrayList<String> grade3 = new ArrayList<>();
		
		//�л��� ����ŭ �ݺ�
		for(HashMap<String, Object> map : main_list) {
			//�л� ���� ��ü�� ����
			int grade = (Integer)map.get("grade");
			String name = (String)map.get("name");
			//�г� ���� �б��Ѵ�.
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
			//�л��� �̸��� �����Ѵ�.
		}
		
		
		//����Ѵ�.
		System.out.println("1�г�");
		for(String name : grade1) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("2�г�");
		for(String name : grade2) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("3�г�");
		for(String name : grade3) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println();
	}
	// �� ���� ������ ����� ���ϴ� ���
	// �г⺰ ������ ����� ���ϴ� ���..
}