/*
 * 다음과 같이 출력하세요
    1 2 3
	4 5 6
	7 8 9
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 3 ; i++) {
			int a1 = 1 + (i * 3);
			int a2 = 2 + (i * 3);
			int a3 = 3 + (i * 3);
			System.out.printf("%d %d %d\n", a1, a2, a3);
		}
//		System.out.println("1 2 3");
//		System.out.println("4 5 6");
//		System.out.println("7 8 9");
		System.out.println("--------------");
		for(int k = 0 ; k < 3 ; k++) {
			int a1 = 1 + (k * 3);
			int a2 = a1 + 2;
			for(int i = a1 ; i <= a2 ; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
//		for(int i = 1 ; i <= 3 ; i++) {
//			System.out.printf("%2d", i);
//		}
////		System.out.print("1 ");
////		System.out.print("2 ");
////		System.out.print("3 ");
//		System.out.println();
//		for(int i = 4 ; i <= 6 ; i++) {
//			System.out.printf("%2d", i);
//		}
////		System.out.print("4 ");
////		System.out.print("5 ");
////		System.out.print("6 ");
//		System.out.println();
//		for(int i = 7 ; i <= 9 ; i++) {
//			System.out.printf("%2d", i);
//		}
////		System.out.print("7 ");
////		System.out.print("8 ");
////		System.out.print("9 ");
//		System.out.println();
	}

}






