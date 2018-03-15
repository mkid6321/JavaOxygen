import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 *  HTTP 네트워크..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			//접속할 페이지의 주소..
			URL url = new URL("http://www.google.com");
			//접속
			URLConnection conn = url.openConnection();
			//스트림 추출
			//import java.io
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			StringBuffer buf = new StringBuffer();
			//읽어온다.
			
			do {
				str = br.readLine();
				if(str != null) {
					buf.append(str);
				}
			}while(str != null);
			
			System.out.println(buf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
