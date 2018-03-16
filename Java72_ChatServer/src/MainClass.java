import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



/*asdad
 * ChatServer.java
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		ChatServer sc = new ChatServer();
		try {
			sc.serverStart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

// 사용자 접속 대기.
// 사용자가 접속 후 닉네임을 입력받는다.
// 사용자가 접속하게 되면 다른 클라이언트 들에게
// 접속 알림 메시지를 보낸다...
// 접속한 사용자에게는 환영 메시지를 전달한다...

// 메시지 수신처리
// 사용자가 메시지를 전달하면 받는다.
// 전달 받은 메시지를 모든 사용자에게 전달 한다..
class ChatServer {
	// 서버의 기능을 갖추고 있는 객체.
	private ServerSocket server;
	
	//사용자 정보 객체를 보관할 ArrayList
	private ArrayList<UserClass> user_list;
	
	public void serverStart() throws Exception {
		user_list = new ArrayList<>();
		// 포트를 할당받고 서버 객체를 생성.
		server = new ServerSocket(33333);
		// 사용자 접속대기처리 쓰레드 기능..
		ClientConnectionManager mng1 = new ClientConnectionManager();
		mng1.start();
	}

	// 사용자 접속 대기처리 쓰레드..
	class ClientConnectionManager extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					// 사용자 접속을 대기한다..
					System.out.println("사용자 접속 대기");
					Socket socket = server.accept();
					// System.out.println(socket);
					// 닉네임 수신을 위한 쓰레드 가동..
					NickNameInputManager mng2 = new NickNameInputManager(socket);
					mng2.start();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// end_class
	// 지금 막 생성된 소켓 객체를 넘긴다..
	class NickNameInputManager extends Thread {
		// 사용자와 1:1로 연결되어 있는 소켓 객체..
		Socket socket;

		public NickNameInputManager(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				// 스트림을 추출한다.
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				// 클라이언트 연결중에 close로 스트림 닫아버리면 안된다...
				// .close()로 닫으면 다시수신 못한ㄷ..

				// 닉네임 수신 받는다
				String nickName = dis.readUTF();
				System.out.printf("대화명 : %s\n", nickName);
				//다른 사용자에게 접속 알림 메시지를 잔달한다...
				sendAllUser(nickName + "님이 접속하였습니다.");
				//사용자 정보를 담는다. 이것을 언제 ArrayList에 포함할지가 중요하다..
				UserClass uc = new UserClass(socket, nickName);
				user_list.add(uc);
				uc.start();
				//사용자에게 환영 메시지를 전달한다...
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(nickName + "님 환영합니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

	//사용자 정보를 관리하는 클래스..
	//현재 사용자가 보내는 메시지를 수신대기하는 쓰레드..
	class UserClass extends Thread{
		//사용자와 1:1로 연결되어 있는 소켓 객체..
		Socket socket;
		String nickName;
		
		UserClass(Socket socket,String nickName){
			this.socket = socket;
			this.nickName = nickName;
		}
		
		@Override
		public void run() {
			try {
				//스트림을 추출한ㄷ...
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				while(true) {
					//데이터 수신..
					String msg = dis.readUTF();
					//클라이언트들에게 송신한다..
					sendAllUser(nickName + ":" + msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 접속한 클라이언트들에게 메시지를 송신하는 메서드(BroadCast)
	public synchronized void sendAllUser(String msg) {
		try {
			//접속한 사용자의 수만큼 반복한다..
			for(UserClass user : user_list) {
				//소켓으로 부터 스트림 추출한다..
				OutputStream os = user.socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				//메시지를 송신한다...
				dos.writeUTF(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

