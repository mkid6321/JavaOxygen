import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * objectStream : 객체를 복원하기 윈한 정보를 주고받는 스트림..
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
		t1.a4 = "몬자열데이터";
		
		FileOutputStream fos = new FileOutputStream("c:\\test\\data5.txt");
		//객체를 복원하기 위한 데이터를 byt 배열로 만들어 전달하는 스크림...
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//객체를쓴다..\
		oos.writeObject(t1);
		oos.flush();
		oos.close();
		System.out.println("파일쓰기 완료");
	}
	
	public static void readFromFile() throws Exception{
		FileInputStream fis = new FileInputStream("c:\\test\\data5.txt");
		//직렬화 되어잇는 객체 복원 정보를 읽어와 객체를 복원하는 스트림
		ObjectInputStream ois = new ObjectInputStream(fis);
		//객체를 복원
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

