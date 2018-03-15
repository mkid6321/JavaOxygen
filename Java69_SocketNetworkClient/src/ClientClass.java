import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 클라이언트
 * 
 * 
 * 
 * 
 */
public class ClientClass {
	public static void main(String[] args) {
		try {
			//서버에 접속한다..
			//동일 번호로 접속을 한ㄷ...
			Socket socket = new Socket("127.0.0.1",55555);
			//스트림 추출
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			//데이터를 수신한다..
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			boolean data3 = dis.readBoolean();
			String data4 = dis.readUTF();
			//데이터를 송신한다...
			dos.writeInt(500);
			dos.writeDouble(55.55);
			dos.writeBoolean(false);
			dos.writeUTF("클라이언트가 보낸 문자열");
			dos.flush();
			socket.close();
			
			System.out.printf("data1 : %d\n",data1);
			System.out.printf("data2 : %f\n",data2);
			System.out.printf("data3 : %s\n",data3);
			System.out.printf("data4 : %s\n",data4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
