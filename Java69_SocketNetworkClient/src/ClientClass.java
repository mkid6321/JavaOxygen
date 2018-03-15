import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * Ŭ���̾�Ʈ
 * 
 * 
 * 
 * 
 */
public class ClientClass {
	public static void main(String[] args) {
		try {
			//������ �����Ѵ�..
			//���� ��ȣ�� ������ �Ѥ�...
			Socket socket = new Socket("127.0.0.1",55555);
			//��Ʈ�� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			//�����͸� �����Ѵ�..
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			boolean data3 = dis.readBoolean();
			String data4 = dis.readUTF();
			//�����͸� �۽��Ѵ�...
			dos.writeInt(500);
			dos.writeDouble(55.55);
			dos.writeBoolean(false);
			dos.writeUTF("Ŭ���̾�Ʈ�� ���� ���ڿ�");
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
