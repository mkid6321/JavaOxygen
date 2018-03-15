import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 
 * DataInputStream , DataOutputStream
 * 기본자료형 값을 byte 배열로 가공해서 다른 스트림으로 넘기는 보조스트림
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

	// 파일 생성.
	public static void writetoFile() throws Exception {
		// 스트림 생성
		FileOutputStream fos = new FileOutputStream("c:\\test\\data3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		// 쓰고자 하는데이터가 DataOutputStream에 의해 바이트 배열로 가공되고
		// 가공된 바이트 배열은 FileOutputStream으로 저달되어 FileOutputStream이
		// 파일에 쓰게 된다..
		dos.writeInt(100);
		dos.writeDouble(11.11);
		dos.writeBoolean(true);
		dos.writeUTF("문자열");
		// 읽을때도 위의 순서대로 읽어야 한다..
		dos.flush();
		dos.close();
		System.out.println("완성.");
	}

	// 읽어오기
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
