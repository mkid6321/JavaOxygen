import java.io.FileReader;
import java.io.FileWriter;

/*
 *  FileReader, FileWriter
 * 
 *  Reader, Writer  :2바이트 스트림, 문자데이터를 직접 읽고 쓰기 위한 스트림
 *  
 * 	FilterStream이용해서 하는것이 좋다..
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
		// 스트림 생성.
		// 파일이 없으면 파일을 생성하고 있으면 덮어씌운다..
		// FileWriter fw = new FileWriter("c:\\test\\data2.txt");
		// 문자열쓴다..
		// 파일이 없으면 파일을 생성하고 있으면 뒤에 추가한다..
		FileWriter fw = new FileWriter("c:\\test\\data2.txt", true);
		fw.write("반갑습니다");
		fw.flush();
		fw.close();
		System.out.println("파일 쓰기 완료.");
	}

	// 파일 읽기
	public static void readFromFile() throws Exception {
		// 스트림 생성
		FileReader fr = new FileReader("c:\\test\\data2.txt");
		// 읽어온다..
		// 적당히 크게 잡아준다..
		char[] buf = new char[100];
		// 문자열 데이터를 읽어와 char 배열에 담고 읽어온 문자열의
		// 계수를 반환한다...
		int readCnt = fr.read(buf);
		fr.close();

		String str = new String(buf, 0, readCnt);
		System.out.println(str);
	}
}
