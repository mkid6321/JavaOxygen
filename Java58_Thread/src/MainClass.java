/*
 * Thread �⺻ ����...
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass{
	public static void main(String[] args) {
		//������� ����ó�� �ؾ��Ѵ�...
		try {
			//testMethod();
			testMethod2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	//�����带 ������� ���� ����.
	//�������� ó�� --> �̷��� ó���� �񵿱������� ó���ϴ°��� ������.
	public static void testMethod() throws Exception{
		for(int i = 0; i < 20; i++) {
			Thread.sleep(100);
			System.out.println("_");
		}
		
		for(int i = 0; i < 20; i++) {
			Thread.sleep(100);
			System.out.println("^");
		}
		
		for(int i = 0; i < 20; i++) {
			Thread.sleep(100);
			System.out.println("-");
		}
	}
	
	//�����带 ����ϴ� ��
	public static void testMethod2() {
		// Runnable �������̽��� ������ Ŭ����
		ThreadClass1 t1 = new ThreadClass1();
		Thread thread1 = new Thread(t1);
		// Thread Ŭ������ ��ӹ��� Ŭ����
		ThreadClass2 thread2 = new ThreadClass2();
		ThreadClass3 thread3 = new ThreadClass3();
		//�켱���� ����.
		thread1.setPriority(1);
		thread1.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}


//Runnable interface�� ����..
class ThreadClass1 implements Runnable{
	//�߻��� �����尡 ó���� �ڵ�.
	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				Thread.sleep(100);
				System.out.print("^");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


//Thread�� ��ӹ��� Ŭ����
class ThreadClass2 extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				Thread.sleep(100);
				System.out.print("_");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadClass3 extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				Thread.sleep(100);
				System.out.print("-");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}