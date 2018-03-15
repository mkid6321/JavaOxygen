import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * 문자열 라인단위 입출력..
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
		// 라인단위로 쓸 수 잇는 스트림 생성.
		PrintWriter pw = new PrintWriter(fos);
		// 쓴다...
		pw.print("안녕하세요");
		pw.print(100);
		pw.println();
		pw.println("반갑습니다.");
		pw.printf("이름은 %s, 나이는 %d\n", "홍길동", 30);

		pw.flush();
		pw.close();
		System.out.println("파일 쓰기 완료!");
	}

	public static void readFromFile() throws Exception {
		FileInputStream fis = new FileInputStream("c:\\test\\data4.txt");
		// 바이트형태로 읽어온 데이터를 문자형태로 변환해주는 스트림..
		InputStreamReader isr = new InputStreamReader(fis);
		// 라인 단위로 읽어오는 스트림..
		BufferedReader br = new BufferedReader(isr);

		// 읽어온 문자열을 담을 변수.
		String str = null;
		// 읽어온 문자열을 누적할 객체..
		StringBuffer buf = new StringBuffer();

		do {
			// 한줄을 읽어온다..
			str = br.readLine();
			if (str != null) {
				buf.append(str + "\n");
			}
		} while (str != null);

		br.close();

		System.out.printf("str : %s\n", buf);
	}
}
