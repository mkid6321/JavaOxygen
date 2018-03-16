import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

/*
 * 사원들의 정보를 관리하는 프로그램
 * 
 * 1.사원정보 입력
 * 2.사원정보 출력
 * 3.부서별 사원의 이름 출력
 * 4.종료
 * 
 * 사원정보출력에서 예외처리를 통해서 어디까지사원정보를 입력했는지 알수가 있다...
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerClass mc = new ManagerClass();
		mc.startManagement();
	}

}

class ManagerClass {
	// 사용자 입력을 위한 클래스
	Scanner scan = new Scanner(System.in);
	// 저장할 파일의 경로
	final String path = "c:\\test\\employeer.dat";

	public void startManagement() {
		// 반복 제어를 하기 위한 변수
		boolean chk = true;
		while (chk) {
			// 메뉴를 출력하고 메뉴 번호를 입력받는다.
			int menu = showMenu();
			// 메뉴에 맞는 기능을 동작시킨다.
			switch (menu) {
			case 1: // 사원정보입력
				addEmployeerInfo();
				break;
			case 2: // 사원정보출력
				readEmployeerInfoAll();
				break;
			case 3: // 부서별 사원의 이름
				readEmployeerName();
				break;
			case 4: // 종료
				chk = false;
				break;
			}
		}
	}

	// 메뉴를 출력하는 기능
	private int showMenu() {
		System.out.println("메뉴-------------------");
		System.out.println("1. 사원 정보 입력");
		System.out.println("2. 사원 정보 출력");
		System.out.println("3. 부서별 사원의 이름을 출력");
		System.out.println("4. 종료");
		System.out.print("메뉴 : ");
		int menu = scan.nextInt();

		return menu;
	}

	// 사원의 정보를 입력하는 기능
	private void addEmployeerInfo() {
		try {
			// 사원정보를 입력받는다.
			System.out.println();
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			System.out.print("부서(1. 인사과, 2. 개발부) : ");
			int partNumber = scan.nextInt();
			// 입력받은 정보를 파일에 저장한다.
			FileOutputStream fos = new FileOutputStream(path, true);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(name);
			dos.writeInt(age);
			if (partNumber == 1) {
				dos.writeUTF("인사과");
			} else if (partNumber == 2) {
				dos.writeUTF("개발부");
			} else {
				dos.writeUTF("외부인");
			}
			dos.flush();
			dos.close();
			System.out.println("저장완료");
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사원의 정보를 출력하는 기능
	private void readEmployeerInfoAll() {
		try {
			// 데이터를 읽어와 담아놓을 컬렉션
			ArrayList<Employeer> list = new ArrayList<Employeer>();
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);
			// 데이터를 읽어온다.
			try {
				while (true) {
					String name = dis.readUTF();
					int age = dis.readInt();
					String partName = dis.readUTF();
					// 외부인이 아닐 경우에만 list에 담는다.
					if (partName.equals("외부인") == false) {
						Employeer em = new Employeer();
						em.setName(name);
						em.setAge(age);
						em.setPartName(partName);

						list.add(em);
					}
				}
			} catch (Exception e) {

			}
			dis.close();
			// 출력
			for (Employeer em : list) {
				System.out.printf("이름 : %s\n", em.getName());
				System.out.printf("나이 : %d\n", em.getAge());
				System.out.printf("부서 : %s\n", em.getPartName());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 부서별 사원의 이름을 출력하는 기능
	private void readEmployeerName() {
		try {
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);
			// 부서별 사원의 이름을 담을 ArrayList
			ArrayList<String> part1List = new ArrayList<String>();
			ArrayList<String> part2List = new ArrayList<String>();
			try {
				while (true) {
					// 정보를 읽어온다.
					String name = dis.readUTF();
					int age = dis.readInt();
					String partName = dis.readUTF();

					if (partName.equals("인사과")) {
						part1List.add(name);
					} else if (partName.equals("개발부")) {
						part2List.add(name);
					}
				}
			} catch (Exception e2) {

			}
			dis.close();
			System.out.println("인사과---------------");
			for (String name : part1List) {
				System.out.println(name);
			}
			System.out.println("개발부---------------");
			for (String name : part2List) {
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// 사원 한명의 정보를 담을 클래스
class Employeer {
	private String name;
	private int age;
	private String partName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

}
