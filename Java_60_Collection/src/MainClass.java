import java.util.ArrayList;

/*
 * List �÷���
 * 
 * ��ü���ּҰ��� ������ ������ΰ�����
 * 01���� �����Ѵ�
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("���ڿ�1");
		list1.add("���ڿ�2");
		list1.add("���ڿ�3");
		
		String str1 = (String)list1.get(0);
		String str2 = (String)list1.get(1);
		String str3 = (String)list1.get(2);
		
		System.out.printf("str1 : %s\n",str1);
		System.out.printf("str2 : %s\n",str2);
		System.out.printf("str3 : %s\n",str3);
		
		ArrayList<String> list2 = new ArrayList<>();
		//��ü�߰�
		list2.add("���ڿ�100");
		list2.add("���ڿ�200");
		list2.add("���ڿ�300");
		
		//��ü����
		list2.add(1,"���ڿ�400");
		//�����ϰ� �ִ� ��ü�� �ּҰ��� ���
		int cnt = list2.size();
		System.out.printf("��ü�� ���� : %d\n",cnt);
		
		//��ü ��������
		for(int i = 0; i <list2.size(); i++) {
			String str = list2.get(i);
			System.out.printf("list2 : %s\n",str);
		}
		
		//��ü�� �ּҰ��� ����..
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//�����ϱ�..
		list2.set(1, "���ڿ�");
		System.out.println("������");
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//�����ϱ�
		list2.remove(1);
		System.out.println("������");
		for(String str : list2) {
			System.out.printf("list2 : %s\n",str);
		}
		
		//�ʱ�ȭ..
		list2.clear();
		int cnt2 = list2.size();
		System.out.printf("�ʱ�ȭ �� : %d\n",cnt2);
	}
	
}
