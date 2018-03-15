import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * FileInputStream, FileOutputStream
 * 
 * 기본스트림 : 실제데이터를 입출력하는 기능을 담당... 
 * 필터스트림 : 기본스트림과 연결되어 데이터를 가공하는 역활을 담당.
 * 
 * FileInputStream,FileOutputStream : 파일에 데이터를 쓰거나 읽을수 있는 기본 스트림.
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
			// 여기서 발생할 예외 IOException
			e.printStackTrace();
		}

	}

	// 파일쓰기
	public static void writeToFile() throws Exception {
		// FileOutputStream을 생성한다...
		// FileOutputStream fos = new FileOutputStream("c:\\test\\data1.txt");
		// 파일이 없으면 새롭게 생성하고 있으면 기존 내용 디에 추가한다..
		FileOutputStream fos = new FileOutputStream("c:\\test\\data1.txt", true);
		// 파일에 쓸 데이터를 준비한다.
		byte[] data = "안녕하세요".getBytes(); // byte배열로 반환..
	
		// 파일에 쓴다;..
		for(byte b : data) {
			System.out.println(b);
		}
		// 데이터가 담긴 바이트 배열의 모든 데이터를 쓴다.
		fos.write(data);
		// 일부만 쓰고 싶을 경우(바이트배열,시작위치,계수);
		// fos.write(data, 2, 4);
		// 종료 전 남은 데이터를 모두 보낸다.
		fos.flush();
		// 파일을 닫는다.
		fos.close();
		System.out.println("쓰기완료");
	}

	// 파일 읽기
	public static void readFromFile() throws Exception {
		// 파일에서 데이터를 읽어오기 위한 스트림을 추출..
		// 파일이 없으면 새롭게 생성하고 있으면 기존 내용을 덮어 씌운다..
		FileInputStream fis = new FileInputStream("c:\\test\\data1.txt");
		// 읽어올 데이터의 총량
		int cnt = fis.available();
		// 데이터를 담을 바이트배열 만든다..
		byte[] buf = new byte[cnt];
		// 데이터를 읽어온다..
		 fis.read(buf);
		// 데이터를 담을 배열, 배열의 시작위치,담을 데이터의 계수
		// fis.read(buf, 0, buf.length);
		// fis.read(buf, 0, 4);
		fis.close();
		// 데이터를 사용하고자 하는 형태로 가공한다.
		// String str = new String(buf);
		String str = new String(buf,2,4);
		System.out.printf("읽어온 데이터 : %s\n", str);
	}
}
