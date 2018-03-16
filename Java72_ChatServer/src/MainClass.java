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

// ����� ���� ���.
// ����ڰ� ���� �� �г����� �Է¹޴´�.
// ����ڰ� �����ϰ� �Ǹ� �ٸ� Ŭ���̾�Ʈ �鿡��
// ���� �˸� �޽����� ������...
// ������ ����ڿ��Դ� ȯ�� �޽����� �����Ѵ�...

// �޽��� ����ó��
// ����ڰ� �޽����� �����ϸ� �޴´�.
// ���� ���� �޽����� ��� ����ڿ��� ���� �Ѵ�..
class ChatServer {
	// ������ ����� ���߰� �ִ� ��ü.
	private ServerSocket server;
	
	//����� ���� ��ü�� ������ ArrayList
	private ArrayList<UserClass> user_list;
	
	public void serverStart() throws Exception {
		user_list = new ArrayList<>();
		// ��Ʈ�� �Ҵ�ް� ���� ��ü�� ����.
		server = new ServerSocket(33333);
		// ����� ���Ӵ��ó�� ������ ���..
		ClientConnectionManager mng1 = new ClientConnectionManager();
		mng1.start();
	}

	// ����� ���� ���ó�� ������..
	class ClientConnectionManager extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					// ����� ������ ����Ѵ�..
					System.out.println("����� ���� ���");
					Socket socket = server.accept();
					// System.out.println(socket);
					// �г��� ������ ���� ������ ����..
					NickNameInputManager mng2 = new NickNameInputManager(socket);
					mng2.start();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// end_class
	// ���� �� ������ ���� ��ü�� �ѱ��..
	class NickNameInputManager extends Thread {
		// ����ڿ� 1:1�� ����Ǿ� �ִ� ���� ��ü..
		Socket socket;

		public NickNameInputManager(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				// ��Ʈ���� �����Ѵ�.
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				// Ŭ���̾�Ʈ �����߿� close�� ��Ʈ�� �ݾƹ����� �ȵȴ�...
				// .close()�� ������ �ٽü��� ���Ѥ�..

				// �г��� ���� �޴´�
				String nickName = dis.readUTF();
				System.out.printf("��ȭ�� : %s\n", nickName);
				//�ٸ� ����ڿ��� ���� �˸� �޽����� �ܴ��Ѵ�...
				sendAllUser(nickName + "���� �����Ͽ����ϴ�.");
				//����� ������ ��´�. �̰��� ���� ArrayList�� ���������� �߿��ϴ�..
				UserClass uc = new UserClass(socket, nickName);
				user_list.add(uc);
				uc.start();
				//����ڿ��� ȯ�� �޽����� �����Ѵ�...
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(nickName + "�� ȯ���մϴ�.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

	//����� ������ �����ϴ� Ŭ����..
	//���� ����ڰ� ������ �޽����� ���Ŵ���ϴ� ������..
	class UserClass extends Thread{
		//����ڿ� 1:1�� ����Ǿ� �ִ� ���� ��ü..
		Socket socket;
		String nickName;
		
		UserClass(Socket socket,String nickName){
			this.socket = socket;
			this.nickName = nickName;
		}
		
		@Override
		public void run() {
			try {
				//��Ʈ���� �����Ѥ�...
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				while(true) {
					//������ ����..
					String msg = dis.readUTF();
					//Ŭ���̾�Ʈ�鿡�� �۽��Ѵ�..
					sendAllUser(nickName + ":" + msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// ������ Ŭ���̾�Ʈ�鿡�� �޽����� �۽��ϴ� �޼���(BroadCast)
	public synchronized void sendAllUser(String msg) {
		try {
			//������ ������� ����ŭ �ݺ��Ѵ�..
			for(UserClass user : user_list) {
				//�������� ���� ��Ʈ�� �����Ѵ�..
				OutputStream os = user.socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				//�޽����� �۽��Ѵ�...
				dos.writeUTF(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

