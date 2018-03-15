
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기 ㄱ = new 계산기();
		int 결과1 = ㄱ.더하기(100, 200);
		int 결과2 = ㄱ.더하기(1000, 2000);
		double 결과3 = ㄱ.더하기(11.11, 22.22);
		double 결과4 = ㄱ.더하기(33.33, 44.44);
		System.out.printf("결과1 : %d\n", 결과1);
		System.out.printf("결과2 : %d\n", 결과2);
		System.out.printf("결과3 : %f\n", 결과3);
		System.out.printf("결과4 : %f\n", 결과4);
	}
}

class 계산기{
	
	int 더하기(int 숫자1, int 숫자2) {
		return 숫자1 + 숫자2;
	}
	double 더하기(double 숫자1, double 숫자2) {
		return 숫자1 + 숫자2;
	}
}








