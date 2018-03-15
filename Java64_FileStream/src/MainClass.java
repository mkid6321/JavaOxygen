import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * FileInputStream, FileOutputStream
 * 
 * �⺻��Ʈ�� : ���������͸� ������ϴ� ����� ���... 
 * ���ͽ�Ʈ�� : �⺻��Ʈ���� ����Ǿ� �����͸� �����ϴ� ��Ȱ�� ���.
 * 
 * FileInputStream,FileOutputStream : ���Ͽ� �����͸� ���ų� ������ �ִ� �⺻ ��Ʈ��.
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			writeToFile();
			readFromFile();
		} catch (Exception e) {
			// TODO: handle exception
			// ���⼭ �߻��� ���� IOException
			e.printStackTrace();
		}

	}

	// ���Ͼ���
	public static void writeToFile() throws Exception {
		// FileOutputStream�� �����Ѵ�...
		// FileOutputStream fos = new FileOutputStream("c:\\test\\data1.txt");
		// ������ ������ ���Ӱ� �����ϰ� ������ ���� ���� �� �߰��Ѵ�..
		FileOutputStream fos = new FileOutputStream("c:\\test\\data1.txt", true);
		// ���Ͽ� �� �����͸� �غ��Ѵ�.
		byte[] data = "�ȳ��ϼ���".getBytes(); // byte�迭�� ��ȯ..
	
		// ���Ͽ� ����;..
		for(byte b : data) {
			System.out.println(b);
		}
		// �����Ͱ� ��� ����Ʈ �迭�� ��� �����͸� ����.
		fos.write(data);
		// �Ϻθ� ���� ���� ���(����Ʈ�迭,������ġ,���);
		// fos.write(data, 2, 4);
		// ���� �� ���� �����͸� ��� ������.
		fos.flush();
		// ������ �ݴ´�.
		fos.close();
		System.out.println("����Ϸ�");
	}

	// ���� �б�
	public static void readFromFile() throws Exception {
		// ���Ͽ��� �����͸� �о���� ���� ��Ʈ���� ����..
		// ������ ������ ���Ӱ� �����ϰ� ������ ���� ������ ���� �����..
		FileInputStream fis = new FileInputStream("c:\\test\\data1.txt");
		// �о�� �������� �ѷ�
		int cnt = fis.available();
		// �����͸� ���� ����Ʈ�迭 �����..
		byte[] buf = new byte[cnt];
		// �����͸� �о�´�..
		 fis.read(buf);
		// �����͸� ���� �迭, �迭�� ������ġ,���� �������� ���
		// fis.read(buf, 0, buf.length);
		// fis.read(buf, 0, 4);
		fis.close();
		// �����͸� ����ϰ��� �ϴ� ���·� �����Ѵ�.
		// String str = new String(buf);
		String str = new String(buf,2,4);
		System.out.printf("�о�� ������ : %s\n", str);
	}
}
