import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * ChatCleint.java
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		
		try {
			ChatClient cc = new ChatClient();
			cc.startClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//서버 접속
//	서버접속에 성공하면 서버로 닉네임을 전달한ㄷ..
//메시지 수신기능
//	서버가 메시지를 전달하면 이를 수신받아 화면에 출력한다.
//메시지 송신기능
//	키보드로 입력한 내용을 서버에 전달..
class ChatClient{
	//서버와 연결되어있는 소켓객체...
	private Socket socket;
	// 서버로 부터 데이터를 수신받는 쓰레드 객체...
	//엔터 누를때마다 스레드 객체가 생성되면 안되니 null이아닐때만 동작하도록 하는것이다...
	private ServerInputManager inputManager = null;
	
	public void startClient() throws Exception{
		//서버에 접속(자기 자신은 : 127.0.0.1)
//		socket = new Socket("127.0.0.1", 33333);
		socket = new Socket("192.168.160.41", 33333);
		//닉네임을 입력 받는다.
		System.out.println("닉네임 : ");
		//키보드로 부터 입력받아 서보로 보내는 쓰레드 가동..
		keyBoardInputManager mng1 = new keyBoardInputManager(socket);
		mng1.start();
		//서버로 부터 데이터를 수신받아 출력하는 쓰레드 가동....
		ServerInputManager mng2 = new ServerInputManager(socket);
		mng2.start();
	}

	//키보드로 입력받은 문자열을 서버로 전달하는 쓰레드.
	class keyBoardInputManager extends Thread{
		//서버와 연결되어있는 소켓..
		Socket socket;
		
		public keyBoardInputManager(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				//키보드와 연결되어있는 스트림
				Scanner scan = new Scanner(System.in);
				//서버와 연결되어 있는 스트림..
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				while(true) {
					//키보드로부터 입력 받는다..
					String msg = scan.next();
					//서버로 보낸다..
					dos.writeUTF(msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//end_class
	
	//서버로 부터 수신받은 문자열을 화면에 출력...
	class ServerInputManager extends Thread{
		//서버와 연결되어 있는 소켓..
		Socket socket;
		
		public ServerInputManager(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				//서버에서 데이터를 수신받기 위한 스트림..
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				while(true) {
					//서버로부터 데이터를 수신받는다..
					String msg = dis.readUTF();
					//출력한다..
					System.out.println(msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}






