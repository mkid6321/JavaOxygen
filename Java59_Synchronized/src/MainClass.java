/*
 * 쓰레드의 동기화
 * 
 * 비동기로 처리는 쓰레드의 작업중 일부를 동기화 하고자
 * 할때 사용하는 개념..
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		ThreadClass1 t1 = new ThreadClass1();
		ThreadClass2 t2 = new ThreadClass2();
		
		t1.start();
		t2.start();
	}
	
	public static void task1(String name)throws Exception {
		for(int i = 0; i < 5; i++) {
			Thread.sleep(100);
			System.out.printf("task1 - %s\n",name);
		}
	}
	
	public static synchronized void task2(String name)throws Exception {
		for(int i = 0; i < 5; i++) {
			Thread.sleep(100);
			System.out.printf("task2 - %s\n",name);
		}
	}
	
	public static void task3(String name)throws Exception {
		for(int i = 0; i < 5; i++) {
			Thread.sleep(100);
			System.out.printf("task3 - %s\n",name);
		}
	}
}

class ThreadClass1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			MainClass.task1("thread1");
			MainClass.task2("thread1");
			MainClass.task3("thread1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadClass2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			MainClass.task1("thread2");
			MainClass.task2("thread2");
			MainClass.task3("thread2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

