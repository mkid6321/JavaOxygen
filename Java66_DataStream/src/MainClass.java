import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 
 * DataInputStream , DataOutputStream
 * �⺻�ڷ��� ���� byte �迭�� �����ؼ� �ٸ� ��Ʈ������ �ѱ�� ������Ʈ��
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			// writetoFile();
			readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ���� ����.
	public static void writetoFile() throws Exception {
		// ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("c:\\test\\data3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		// ������ �ϴµ����Ͱ� DataOutputStream�� ���� ����Ʈ �迭�� �����ǰ�
		// ������ ����Ʈ �迭�� FileOutputStream���� ���޵Ǿ� FileOutputStream��
		// ���Ͽ� ���� �ȴ�..
		dos.writeInt(100);
		dos.writeDouble(11.11);
		dos.writeBoolean(true);
		dos.writeUTF("���ڿ�");
		// �������� ���� ������� �о�� �Ѵ�..
		dos.flush();
		dos.close();
		System.out.println("�ϼ�.");
	}

	// �о����
	public static void readFromFile() throws Exception {
		FileInputStream fis = new FileInputStream("c:\\test\\data3.txt");
		DataInputStream dis = new DataInputStream(fis);

		int data1 = dis.readInt();
		double data2 = dis.readDouble();
		boolean data3 = dis.readBoolean();
		String data4 = dis.readUTF();

		dis.close();

		System.out.printf("data1 : %d\n", data1);
		System.out.printf("data2 : %f\n", data2);
		System.out.printf("data3 : %s\n", data3);
		System.out.printf("data4 : %s\n", data4);
	}
}
