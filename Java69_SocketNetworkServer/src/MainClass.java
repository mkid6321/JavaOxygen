import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 서버
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			//서버 기능을 갖출 수 있는 객체를 생성(포트를 할당받는다.)
			//포트번호 : 1 ~ 65535
			//80번  :웹서비스
			//23번 : ftp전용..
			ServerSocket server = new ServerSocket(55555);
			// 사용자 접속을 대기한다..
			//socket : 클라이언트와 서버가 1:1로 연결되어 있는 객체..
			System.out.println("사용자 접속 대기");
			Socket socket = server.accept();
			//클라이언트 접속이 성공해서 socket객체가 만들어지면
			//스트림을 추출한다...
			//import java.io
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			//데이터를 송신한다...
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("서버가 보낸 문자열");
			
			//데이터를 수신받는다..
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			boolean data3 = dis.readBoolean();
			String data4 = dis.readUTF();
			
			dos.flush();
			socket.close();
			server.close();
			
			System.out.printf("data1 : %d\n",data1);
			System.out.printf("data2 : %f\n",data2);
			System.out.printf("data3 : %s\n",data3);
			System.out.printf("data4 : %s\n",data4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
