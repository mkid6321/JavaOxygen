/*
 * 	Stack = LIFO(Last In First Out)
 * 	push : ��ü�� ����
 * 	pop : ����� ��ü�� ��ȯ..
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		
	}
}

class StackClass<T>{
	//push, pop�� �����ϱ� ���� top
	private NodeClass top = null;
	//����� ��ü�� ����
	private int size = 0;
	public void push(T obj) {
		
	}
	
	public T pop() {
		return null;
	}
	
	public int size() {
		return 0;
	}
	
	//����ڰ� ������ ��ü�� �����ϴ� ��� Ŭ����
	class NodeClass{
		T obj;
		NodeClass nextNode;
	}
}