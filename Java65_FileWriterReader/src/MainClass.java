import java.io.FileReader;
import java.io.FileWriter;

/*
 *  FileReader, FileWriter
 * 
 *  Reader, Writer  :2����Ʈ ��Ʈ��, ���ڵ����͸� ���� �а� ���� ���� ��Ʈ��
 *  
 * 	FilterStream�̿��ؼ� �ϴ°��� ����..
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			// writeToFile();
			readFromFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void writeToFile() throws Exception {
		// ��Ʈ�� ����.
		// ������ ������ ������ �����ϰ� ������ ������..
		// FileWriter fw = new FileWriter("c:\\test\\data2.txt");
		// ���ڿ�����..
		// ������ ������ ������ �����ϰ� ������ �ڿ� �߰��Ѵ�..
		FileWriter fw = new FileWriter("c:\\test\\data2.txt", true);
		fw.write("�ݰ����ϴ�");
		fw.flush();
		fw.close();
		System.out.println("���� ���� �Ϸ�.");
	}

	// ���� �б�
	public static void readFromFile() throws Exception {
		// ��Ʈ�� ����
		FileReader fr = new FileReader("c:\\test\\data2.txt");
		// �о�´�..
		// ������ ũ�� ����ش�..
		char[] buf = new char[100];
		// ���ڿ� �����͸� �о�� char �迭�� ��� �о�� ���ڿ���
		// ����� ��ȯ�Ѵ�...
		int readCnt = fr.read(buf);
		fr.close();

		String str = new String(buf, 0, readCnt);
		System.out.println(str);
	}
}
