import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * ���ڿ� ���δ��� �����..
 * 
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			// writeToFile();
			readFromFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeToFile() throws Exception {
		FileOutputStream fos = new FileOutputStream("c:\\test\\data4.txt");
		// ���δ����� �� �� �մ� ��Ʈ�� ����.
		PrintWriter pw = new PrintWriter(fos);
		// ����...
		pw.print("�ȳ��ϼ���");
		pw.print(100);
		pw.println();
		pw.println("�ݰ����ϴ�.");
		pw.printf("�̸��� %s, ���̴� %d\n", "ȫ�浿", 30);

		pw.flush();
		pw.close();
		System.out.println("���� ���� �Ϸ�!");
	}

	public static void readFromFile() throws Exception {
		FileInputStream fis = new FileInputStream("c:\\test\\data4.txt");
		// ����Ʈ���·� �о�� �����͸� �������·� ��ȯ���ִ� ��Ʈ��..
		InputStreamReader isr = new InputStreamReader(fis);
		// ���� ������ �о���� ��Ʈ��..
		BufferedReader br = new BufferedReader(isr);

		// �о�� ���ڿ��� ���� ����.
		String str = null;
		// �о�� ���ڿ��� ������ ��ü..
		StringBuffer buf = new StringBuffer();

		do {
			// ������ �о�´�..
			str = br.readLine();
			if (str != null) {
				buf.append(str + "\n");
			}
		} while (str != null);

		br.close();

		System.out.printf("str : %s\n", buf);
	}
}
