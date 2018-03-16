/*
 * 	Stack = LIFO(Last In First Out)
 * 	push : 객체를 저장
 * 	pop : 저장된 객체를 반환..
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		
	}
}

class StackClass<T>{
	//push, pop을 제어하기 위한 top
	private NodeClass top = null;
	//저장된 객체의 개수
	private int size = 0;
	public void push(T obj) {
		
	}
	
	public T pop() {
		return null;
	}
	
	public int size() {
		return 0;
	}
	
	//사용자가 전달한 객체를 관리하는 노드 클래스
	class NodeClass{
		T obj;
		NodeClass nextNode;
	}
}