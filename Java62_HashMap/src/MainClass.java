import java.util.HashMap;

/*
 * Map
 * 
 * 순서가 아닌 이름으로 객체를 관리하는 컬렉션..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		//객체 저장하기
		map1.put("data1", "문자열1");
		map1.put("data2","문자열2");
		map1.put("data3","문자열3");
		
		//객체가져오기
		String data1 = map1.get("data1");
		String data2 = map1.get("data2");
		String data3 = map1.get("data3");
		System.out.printf("data1 : %s\n",data1);
		System.out.printf("data2 : %s\n",data2);
		System.out.printf("data3 : %s\n",data3);
		
		//객체 수정하기
		map1.put("data1", "문자열4");
		data1 = map1.get("data1");
		System.out.printf("data1 : %s\n",data1);
		
		//객체 제거하기 
		map1.remove("data1");
		data1 = map1.get("data1");
		System.out.printf("data1 : %s\n",data1);
		
		//다른 타입을 객체를 저장..
		//object로 했기때문에 형변환 해야한다..
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("value1", "문자열");
		//100이 아니고 정수 100을 관리하는 Integer객체 주소값이 들어가는데 
		// 오토박싱이되어서 들어가는 것이다..
		map2.put("value2",100);
		map2.put("value3",11.11);
		
		String value1 = (String)map2.get("value1");
		int value2 = (Integer)map2.get("value2");
		double value3 = (Double)map2.get("value3");
		
		System.out.printf("value1 : %s\n",value1);
		System.out.printf("value2 : %s\n",value2);
		System.out.printf("value3 : %f\n",value3);
	}
}
