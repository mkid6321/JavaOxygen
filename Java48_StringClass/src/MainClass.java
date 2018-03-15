/*
 * StringŬ����
 * �ڹٿ��� ���ڿ��� �����ϴ� Ŭ����
 * 
 * 
 * toStrig : String�� �����ϴ� ���ڿ� ���� ��ȯ..
 * 
 * 
 * ""�� ���ڿ��� �ٲܼ��� ����..
 */
public class MainClass {
	public static void main(String[] args) {
		//Strig ��ü ����..
		String str1 = new String("���ڿ�");
		String str2 = "���ڿ�";
		if(str1 == str2) {
			System.out.println("������ü�Դϴ�.");
		}else {
			System.out.println("�ٸ���ü�Դϴ�.");
		}
		//���ڿ� ��
		System.out.printf("str1�� ���� : %d\n",str1.length());
		System.out.printf("���ڿ��� ���� : %d\n","���ڿ�".length());
		
		String str3 = "abcdef";
		//charAt : �־��� �ε���(0) ��°�� ���ڸ� ��ȯ�Ѵ�..
		char c1 = str3.charAt(2);
		System.out.printf("c1:%c\n",c1);
		System.out.printf("c1�� ������ : %d\n",(int)c1);
		
		//���ڿ� �˻�
		// ...�� �����ϴ���
		boolean chk1 = str3.startsWith("abc");
		// ...�� ��������
		boolean chk2 = str3.endsWith("def");
		
		//�ε���
		int idx1 = str3.indexOf("cde");
		int idx2 = str3.indexOf("zzz");
		System.out.printf("startsWith : %s\n", chk1);
		System.out.printf("endWith : %s\n", chk2);
		System.out.printf("indexOf : %s\n", idx1);
		System.out.printf("indexOf : %s\n", idx2);
		//������ϴ¹��ڴ� -1��ȯ..
		
		//���ڿ��� ������ ��
		String str4 = "�ȳ��ϼ���";
		String str5 = "�ȳ��ϼ���";
		// �ȳ��ϼ��� ��ü �ϳ������� ��������. �׷��� str4,str5�� ��ü�� �����Ŵ�..
		System.out.println("str4 �� str5��");
		//�ȳ��ϼ����� ��ü�� ���� �����...
		String str6 = new String("�ȳ��ϼ���");
		
		//�̰��� ���ڿ� ���� ���ϴ°��� �ƴϴ�..
		if(str4 == str5) {
			System.out.println("���� ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
		System.out.println("str4 �� str6��");
		if(str4 == str6) {
			System.out.println("���� ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
		if(str4.equals(str6)) {
			System.out.println("���� ���ڿ� �Դϴ�.");
		}else {
			System.out.println("�ٸ� ���ڿ� �Դϴ�.");
		}
		
		//���ڿ� �����..
		// �̸� + ȫ�浿 + ���� + 27 �����Ŵ�..
		String format = "�̸���%s, ���̴� %d�Դϴ�";
		String str7 = String.format(format, "ȫ�浿",30);
		String str8 = String.format(format, "��浿",40);
		System.out.printf("str7 : %s\n",str7);
		System.out.printf("str8 : %s\n",str8);
		
		//���� ���ڿ��� �̿��� ���ڿ��� �ڸ���...
		String str9 = "aaa_bbb_ccc_ddd_eee";
		String[] array1 = str9.split("_");
		for(String temp : array1) {
			System.out.println(temp);
		}
		
		String str10 = "ABcdEf";
		//�빮�� -> �ҹ���
		String str11 = str10.toLowerCase();
		//�ҹ��� -> �빮��
		String str12 = str10.toUpperCase();
		System.out.printf("str11 : %s\n",str11);
		System.out.printf("str12 : %s\n",str12);
		
		//���ʰ��� ������� �ϴ°��� ����..
		//���� ���� ���� ����..
		String str13 = "     ���ڿ�       ";
		String str14 = str13.trim();
		System.out.printf("[%s]\n",str13);
		System.out.printf("[%s]\n",str14);
	}
	
}
