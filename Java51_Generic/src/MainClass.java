/*
 * Generic
 * 클래스를 만들때 참조변수의 타입을 결정하지 않고
 * 객체를 생성할 때 타입을 결정할 수 있는 개념.
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		Calc<Integer,Double> a1 = new Calc<>(100,11.11);
		int r1 = a1.getNumber1();
		double r2 = a1.getNumber2();
		
		System.out.printf("r1 : %d\n",r1);
		System.out.printf("r2 : %f\n",r2);
		
		Calc<String,Boolean> a2 = new Calc<>("문자열",true);
		String r3 = a2.getNumber1();
		boolean r4 = a2.getNumber2();
		System.out.printf("r3 : %s\n",r3);
		System.out.printf("r4 : %s\n",r4);
	}
}


class Calc<A,B>{
	private A number1;
	private B number2;
	
	Calc(A number1,B number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public A getNumber1() {
		return number1;
	}
	
	public B getNumber2() {
		return number2;
	}
}

//상속
abstract class SuperClass1<A,B,C>{
	A a1;
	B a2;
	C a3;
	
	public SuperClass1(A a1,B a2,C a3) {
		// TODO Auto-generated constructor stub
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	abstract A getA1();
	abstract B getA2();
	abstract C getA3();
}

class SubClass extends SuperClass1<Integer,Long,String>{
	public SubClass(Integer a1, Long a2, String a3) {
		super(a1, a2, a3);
		// TODO Auto-generated constructor stub
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	@Override
	Integer getA1() {
		// TODO Auto-generated method stub
		return a1;
	}

	@Override
	Long getA2() {
		// TODO Auto-generated method stub
		return a2;
	}

	@Override
	String getA3() {
		// TODO Auto-generated method stub
		return a3;
	}
	
}