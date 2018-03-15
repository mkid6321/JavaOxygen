/**
 * 
 * @author lee
 *캡슐화
 *생성된 객체의 멤버 변수에저장된 데이터를 보호하는 개념
 *
 *멤버 변수의 접근제한자를 private로 주고 공개하고자
 *하는 멤버에 대해 메서드를 제공한다..
 *
 *private 변수와 셋팅하는 메서드(setter)
 *반환하는 메서드(Getter)의 구조로 되어 있는 멤버를
 *특별히 프로퍼티(Property)라고 부른다.
 *
 */
public class MainClass {
	public static void main(String[] args) {
		TestClass t1 = new TestClass(1000);
		TestClass t2 = new TestClass(2000);
		t1.printMember();
		t2.printMember();
		System.out.println("----------");
		
		t1.setA2(3000);
		System.out.printf("a2  %d\n",t1.getA2());
		
//		System.out.println("a3: %d\n",);
		
		t1.setA4(5000);
		System.out.printf("a4 : %d\n",t1.getA4());
	}
}

//캡슐화를 적용한 클래스
class TestClass{
	private int a1 = 100;
	private int a2 = 200;
	private int a3 = 300;
	private int a4 = 400;
	private int a5 = 500;
	private int a6 = 600;
	private int a7 = 700;
	private int a8 = 800;
	private int a9 = 900;
	private int a10 = 1000;
	
	//생성자를 통해 객체 생성시 딱 한번만 셋팅할수있도록
	//할수도 있다.
	public TestClass(int _a1) {
		this.a1 = _a1;
	}
	
	public void printMember() {
		System.out.printf("a1 : %d\n",a1);
		System.out.printf("a2 : %d\n",a2);
		System.out.printf("a3 : %d\n",a3);
		System.out.printf("a4 : %d\n",a4);
	}
	//private 멤버 변수에 값을 설정하는 메서드
	//Setter : set + 변수명(첫글자는 대문자)
	public void setA2(int a2) {
		this.a2 = a2;
	}
	
	//private 멤버 변수의 값을 반환하는 메서드
	
	public int getA2() {
		return a2;
	}
	
	//getter만 존재하는 Property : Read only Porperty
	
	//제약사항 설정하기 
	public void setA4(int a4) {
		if(a4 > 0) {
			this.a4 = a4;
		}
	}
	public int getA4() {
		return a4;
	}

	//이클립스에서 getter,setter자동 생서.
	//Source > Generate Getting/setters
	public int getA5() {
		return a5;
	}

	public void setA5(int a5) {
		this.a5 = a5;
	}

	public int getA6() {
		return a6;
	}

	public void setA6(int a6) {
		this.a6 = a6;
	}

	public int getA7() {
		return a7;
	}

	public void setA7(int a7) {
		this.a7 = a7;
	}

	public int getA8() {
		return a8;
	}

	public void setA8(int a8) {
		this.a8 = a8;
	}

	public int getA9() {
		return a9;
	}

	public void setA9(int a9) {
		this.a9 = a9;
	}

	public int getA10() {
		return a10;
	}

	public void setA10(int a10) {
		this.a10 = a10;
	}
	
}