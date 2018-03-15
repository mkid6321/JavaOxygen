import java.util.HashMap;

/*
 * Map
 * 
 * ������ �ƴ� �̸����� ��ü�� �����ϴ� �÷���..
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		//��ü �����ϱ�
		map1.put("data1", "���ڿ�1");
		map1.put("data2","���ڿ�2");
		map1.put("data3","���ڿ�3");
		
		//��ü��������
		String data1 = map1.get("data1");
		String data2 = map1.get("data2");
		String data3 = map1.get("data3");
		System.out.printf("data1 : %s\n",data1);
		System.out.printf("data2 : %s\n",data2);
		System.out.printf("data3 : %s\n",data3);
		
		//��ü �����ϱ�
		map1.put("data1", "���ڿ�4");
		data1 = map1.get("data1");
		System.out.printf("data1 : %s\n",data1);
		
		//��ü �����ϱ� 
		map1.remove("data1");
		data1 = map1.get("data1");
		System.out.printf("data1 : %s\n",data1);
		
		//�ٸ� Ÿ���� ��ü�� ����..
		//object�� �߱⶧���� ����ȯ �ؾ��Ѵ�..
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("value1", "���ڿ�");
		//100�� �ƴϰ� ���� 100�� �����ϴ� Integer��ü �ּҰ��� ���µ� 
		// ����ڽ��̵Ǿ ���� ���̴�..
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
