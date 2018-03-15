/*
 * Thread 기본 예제...
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass{
	public static void main(String[] args) {
		//쓰레드는 예외처리 해야한다...
		try {
			//testMethod();
			testMethod2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	//쓰레드를 사용하지 않은 예제.
	//동기적인 처리 --> 이러한 처리를 비동기적으로 처리하는것이 쓰레드.
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
	
	//쓰레드를 사용하는 예
	public static void testMethod2() {
		// Runnable 인터페이스를 구현한 클래스
		ThreadClass1 t1 = new ThreadClass1();
		Thread thread1 = new Thread(t1);
		// Thread 클래스를 상속받은 클래스
		ThreadClass2 thread2 = new ThreadClass2();
		ThreadClass3 thread3 = new ThreadClass3();
		//우선순위 설정.
		thread1.setPriority(1);
		thread1.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}


//Runnable interface를 구현..
class ThreadClass1 implements Runnable{
	//발생된 쓰레드가 처리할 코드.
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


//Thread를 상속받은 클래스
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