
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� �� = new ����();
		int ���1 = ��.���ϱ�(100, 200);
		int ���2 = ��.���ϱ�(1000, 2000);
		double ���3 = ��.���ϱ�(11.11, 22.22);
		double ���4 = ��.���ϱ�(33.33, 44.44);
		System.out.printf("���1 : %d\n", ���1);
		System.out.printf("���2 : %d\n", ���2);
		System.out.printf("���3 : %f\n", ���3);
		System.out.printf("���4 : %f\n", ���4);
	}
}

class ����{
	
	int ���ϱ�(int ����1, int ����2) {
		return ����1 + ����2;
	}
	double ���ϱ�(double ����1, double ����2) {
		return ����1 + ����2;
	}
}








