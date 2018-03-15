
/*
 * 배열 예제..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//정수형 기억 장소 5개를 관리하는 배열 생성.
		int[] array1 = {10,20,30,40,50};
		//0으로 초기화 되는 배열 생성..
		int[] array2 = new int[5];
		System.out.printf("array1.length : %d\n",array1.length);
		System.out.printf("array2.length : %d\n",array2.length);
		//배열에 값 설정하기
		for(int i = 0; i < array2.length; i++) {
			array2[i] = 100 + i;
		}
		//배열의 값 가져오기
		for(int i = 0; i<array2.length; i++) {
			int number = array2[i];
			System.out.printf("array2[%d] : %d\n",i,number);
		}
		
		//인덱스번째 array2 배열의 값을 가져와 number라는 변수에 담아준다..
		
		for(int number : array2) {
			System.out.printf("array2 : %d\n",number);
		}
		
		//args 매개 변수
		if(args != null){
			for(String command : args) {
				System.out.println("args : %d\n");
			}
		}
	}
}
