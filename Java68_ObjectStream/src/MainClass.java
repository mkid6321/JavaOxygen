import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * objectStream : ��ü�� �����ϱ� ���� ������ �ְ�޴� ��Ʈ��..
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
//			writeToFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToFile() throws Exception{
		TestClass t1 = new TestClass();
		t1.a1 = 100;
		t1.a2 = 11.11;
		t1.a3 = true;
		t1.a4 = "���ڿ�������";
		
		FileOutputStream fos = new FileOutputStream("c:\\test\\data5.txt");
		//��ü�� �����ϱ� ���� �����͸� byt �迭�� ����� �����ϴ� ��ũ��...
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//��ü������..\
		oos.writeObject(t1);
		oos.flush();
		oos.close();
		System.out.println("���Ͼ��� �Ϸ�");
	}
	
	public static void readFromFile() throws Exception{
		FileInputStream fis = new FileInputStream("c:\\test\\data5.txt");
		//����ȭ �Ǿ��մ� ��ü ���� ������ �о�� ��ü�� �����ϴ� ��Ʈ��
		ObjectInputStream ois = new ObjectInputStream(fis);
		//��ü�� ����
		TestClass t1 = (TestClass)ois.readObject();
		ois.close();
		
		System.out.printf("t1.a1 : %d\n", t1.a1);
		System.out.printf("t1.a2 : %f\n", t1.a2);
		System.out.printf("t1.a3 : %s\n", t1.a3);
		System.out.printf("t1.a4 : %s\n", t1.a4);
		
	}
}

class TestClass implements Serializable{
	int a1;
	double a2;
	boolean a3;
	String a4;
}

