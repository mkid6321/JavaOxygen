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

//���� ����
//	�������ӿ� �����ϸ� ������ �г����� �����Ѥ�..
//�޽��� ���ű��
//	������ �޽����� �����ϸ� �̸� ���Ź޾� ȭ�鿡 ����Ѵ�.
//�޽��� �۽ű��
//	Ű����� �Է��� ������ ������ ����..
class ChatClient{
	//������ ����Ǿ��ִ� ���ϰ�ü...
	private Socket socket;
	// ������ ���� �����͸� ���Ź޴� ������ ��ü...
	//���� ���������� ������ ��ü�� �����Ǹ� �ȵǴ� null�̾ƴҶ��� �����ϵ��� �ϴ°��̴�...
	private ServerInputManager inputManager = null;
	
	public void startClient() throws Exception{
		//������ ����(�ڱ� �ڽ��� : 127.0.0.1)
//		socket = new Socket("127.0.0.1", 33333);
		socket = new Socket("192.168.160.41", 33333);
		//�г����� �Է� �޴´�.
		System.out.println("�г��� : ");
		//Ű����� ���� �Է¹޾� ������ ������ ������ ����..
		keyBoardInputManager mng1 = new keyBoardInputManager(socket);
		mng1.start();
		//������ ���� �����͸� ���Ź޾� ����ϴ� ������ ����....
		ServerInputManager mng2 = new ServerInputManager(socket);
		mng2.start();
	}

	//Ű����� �Է¹��� ���ڿ��� ������ �����ϴ� ������.
	class keyBoardInputManager extends Thread{
		//������ ����Ǿ��ִ� ����..
		Socket socket;
		
		public keyBoardInputManager(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				//Ű����� ����Ǿ��ִ� ��Ʈ��
				Scanner scan = new Scanner(System.in);
				//������ ����Ǿ� �ִ� ��Ʈ��..
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				while(true) {
					//Ű����κ��� �Է� �޴´�..
					String msg = scan.next();
					//������ ������..
					dos.writeUTF(msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//end_class
	
	//������ ���� ���Ź��� ���ڿ��� ȭ�鿡 ���...
	class ServerInputManager extends Thread{
		//������ ����Ǿ� �ִ� ����..
		Socket socket;
		
		public ServerInputManager(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				//�������� �����͸� ���Źޱ� ���� ��Ʈ��..
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				while(true) {
					//�����κ��� �����͸� ���Ź޴´�..
					String msg = dis.readUTF();
					//����Ѵ�..
					System.out.println(msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}






