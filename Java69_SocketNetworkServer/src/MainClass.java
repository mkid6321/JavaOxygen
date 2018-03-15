import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����
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
			//���� ����� ���� �� �ִ� ��ü�� ����(��Ʈ�� �Ҵ�޴´�.)
			//��Ʈ��ȣ : 1 ~ 65535
			//80��  :������
			//23�� : ftp����..
			ServerSocket server = new ServerSocket(55555);
			// ����� ������ ����Ѵ�..
			//socket : Ŭ���̾�Ʈ�� ������ 1:1�� ����Ǿ� �ִ� ��ü..
			System.out.println("����� ���� ���");
			Socket socket = server.accept();
			//Ŭ���̾�Ʈ ������ �����ؼ� socket��ü�� ���������
			//��Ʈ���� �����Ѵ�...
			//import java.io
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			//�����͸� �۽��Ѵ�...
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("������ ���� ���ڿ�");
			
			//�����͸� ���Ź޴´�..
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
