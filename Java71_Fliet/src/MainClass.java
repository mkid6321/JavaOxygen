import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

/*
 * ������� ������ �����ϴ� ���α׷�
 * 
 * 1.������� �Է�
 * 2.������� ���
 * 3.�μ��� ����� �̸� ���
 * 4.����
 * 
 * ���������¿��� ����ó���� ���ؼ� ��������������� �Է��ߴ��� �˼��� �ִ�...
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
	// ����� �Է��� ���� Ŭ����
	Scanner scan = new Scanner(System.in);
	// ������ ������ ���
	final String path = "c:\\test\\employeer.dat";

	public void startManagement() {
		// �ݺ� ��� �ϱ� ���� ����
		boolean chk = true;
		while (chk) {
			// �޴��� ����ϰ� �޴� ��ȣ�� �Է¹޴´�.
			int menu = showMenu();
			// �޴��� �´� ����� ���۽�Ų��.
			switch (menu) {
			case 1: // ��������Է�
				addEmployeerInfo();
				break;
			case 2: // ����������
				readEmployeerInfoAll();
				break;
			case 3: // �μ��� ����� �̸�
				readEmployeerName();
				break;
			case 4: // ����
				chk = false;
				break;
			}
		}
	}

	// �޴��� ����ϴ� ���
	private int showMenu() {
		System.out.println("�޴�-------------------");
		System.out.println("1. ��� ���� �Է�");
		System.out.println("2. ��� ���� ���");
		System.out.println("3. �μ��� ����� �̸��� ���");
		System.out.println("4. ����");
		System.out.print("�޴� : ");
		int menu = scan.nextInt();

		return menu;
	}

	// ����� ������ �Է��ϴ� ���
	private void addEmployeerInfo() {
		try {
			// ��������� �Է¹޴´�.
			System.out.println();
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int age = scan.nextInt();
			System.out.print("�μ�(1. �λ��, 2. ���ߺ�) : ");
			int partNumber = scan.nextInt();
			// �Է¹��� ������ ���Ͽ� �����Ѵ�.
			FileOutputStream fos = new FileOutputStream(path, true);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(name);
			dos.writeInt(age);
			if (partNumber == 1) {
				dos.writeUTF("�λ��");
			} else if (partNumber == 2) {
				dos.writeUTF("���ߺ�");
			} else {
				dos.writeUTF("�ܺ���");
			}
			dos.flush();
			dos.close();
			System.out.println("����Ϸ�");
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ����� ������ ����ϴ� ���
	private void readEmployeerInfoAll() {
		try {
			// �����͸� �о�� ��Ƴ��� �÷���
			ArrayList<Employeer> list = new ArrayList<Employeer>();
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);
			// �����͸� �о�´�.
			try {
				while (true) {
					String name = dis.readUTF();
					int age = dis.readInt();
					String partName = dis.readUTF();
					// �ܺ����� �ƴ� ��쿡�� list�� ��´�.
					if (partName.equals("�ܺ���") == false) {
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
			// ���
			for (Employeer em : list) {
				System.out.printf("�̸� : %s\n", em.getName());
				System.out.printf("���� : %d\n", em.getAge());
				System.out.printf("�μ� : %s\n", em.getPartName());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �μ��� ����� �̸��� ����ϴ� ���
	private void readEmployeerName() {
		try {
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);
			// �μ��� ����� �̸��� ���� ArrayList
			ArrayList<String> part1List = new ArrayList<String>();
			ArrayList<String> part2List = new ArrayList<String>();
			try {
				while (true) {
					// ������ �о�´�.
					String name = dis.readUTF();
					int age = dis.readInt();
					String partName = dis.readUTF();

					if (partName.equals("�λ��")) {
						part1List.add(name);
					} else if (partName.equals("���ߺ�")) {
						part2List.add(name);
					}
				}
			} catch (Exception e2) {

			}
			dis.close();
			System.out.println("�λ��---------------");
			for (String name : part1List) {
				System.out.println(name);
			}
			System.out.println("���ߺ�---------------");
			for (String name : part2List) {
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// ��� �Ѹ��� ������ ���� Ŭ����
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
