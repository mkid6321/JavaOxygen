/* 
 * switch case
 * 
 * if���� �� ȿ������ �κ��� ������� �ؼ��ϱ� ����
 * �����Ǵ� ����̴�.
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ��
		int a1 = 10;
		if(a1 == 3) {
			System.out.println("a1�� 3�Դϴ�");
		} else if(a1 == 5 || a1 == 10) {
			System.out.println("a1�� 5�̰ų� 10�Դϴ�");
		} else if(a1 == 20) {
			System.out.println("a1�� 20�Դϴ�");
		} else {
			System.out.println("a1�� 3, 5, 10, 20�� �ƴմϴ�");
		}
		
		// swtich
		switch(a1) {
		case 3 :
			System.out.println("a1�� 3�Դϴ�");
			break;
		case 5 :
		case 10 : 
			System.out.println("a1�� 5�̰ų� 10�Դϴ�");
			break;
		case 20 :
			System.out.println("a1�� 20�Դϴ�");
			break;
		default :
			System.out.println("a1�� 3, 5, 10, 20�� �ƴմϴ�");
		}
		
		String str1 = "���ڿ�2";
		switch(str1) {
		case "���ڿ�1" :
			System.out.println("���ڿ�1 �Դϴ�");
			break;
		case "���ڿ�2" :
			System.out.println("���ڿ�2 �Դϴ�");
			break;
		}
	}

}






