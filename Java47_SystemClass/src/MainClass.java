/*
 * System 클래스
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//현재시간
		//1970년 1월1일0시 0분0초 0ms (세계 표준시)
		//를 기준으로 1ms 마다 1초가 증가한 값
		// 중복되지 않는 값이 필요할때 사용한다..
		
		long now = System.currentTimeMillis();
		System.out.printf("현재신간:%d\n",now);
		//배열 복사
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int [] array2 = new int[5];
		// 원본 배열 , 원본에서 시작 인텍스 , 타켓배열 
		// 타겟 배열의 시작 인덱스, 복사할 기억공의 개수
		System.arraycopy(array1, 2, array2, 0, 5);
		//이것을 쓰는것이 좋은것이 속도가 빠르다 한꺼번에 복사해서 덮어씌우므로
		//배열복사는 이것을 쓰는것이 좋다..
		for(int number : array2) {
			System.out.printf("배열복사 : %d\n",number);
		}
		
		//메모리 청소(가비지 커렉터)
		//자바는 가비지 컬렉터를 알아서 돌려주기 때문에
		//직접 하실 필요는 없다..
		for(int i = 0; i < 100; i++) {
			System.gc();
			System.out.println("gc 테스트" + i);
		}
	}
}
