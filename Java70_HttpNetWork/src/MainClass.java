import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 *  HTTP ��Ʈ��ũ..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			//������ �������� �ּ�..
			URL url = new URL("http://www.google.com");
			//����
			URLConnection conn = url.openConnection();
			//��Ʈ�� ����
			//import java.io
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			StringBuffer buf = new StringBuffer();
			//�о�´�.
			
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
