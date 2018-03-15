import java.util.Calendar;
import java.util.Date;

/*
 * Date,Calendar
 * Date : ��ǻ�� ���忡�� �ð��� ����.
 * Calendar : ��� ���忡�� �ð��� ����.
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//���� �ð��� �����ϴ� Date��ü
		//import java.util
		Date d1 = new Date();
		//System.out.println(d1);
		
		//0�ð�(1970�� 1�� 1�� 0�� 0�� 0�� 0ms ����ǥ�ؽ�)
		Date d2 = new Date(0);
		System.out.printf("0�ð� : %s\n",d2);
		
		//���� �ð� ���� ������ �ִ� Calendar
		Calendar c1 = Calendar.getInstance();
		System.out.printf("c1 : %s\n",c1);
		//�ð��� ����
		int year = c1.get(Calendar.YEAR);
		//month�� 0���� ������ �Ͽ���.
		int month = c1.get(Calendar.MONTH) + 1;
		int dayOfMonth = c1.get(Calendar.DAY_OF_MONTH);
		int hour = c1.get(Calendar.HOUR);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int day = c1.get(Calendar.DAY_OF_WEEK);
		
		String day_str = null;
		switch(day) {
		case Calendar.SUNDAY:
			day_str = "�Ͽ���";
			break;
		case Calendar.MONDAY:
			day_str = "������";
			break;
		case Calendar.TUESDAY:
			day_str = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			day_str = "������";
			break;
		case Calendar.THURSDAY:
			day_str = "�����";
			break;
		case Calendar.FRIDAY:
			day_str = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			day_str = "�����";
			break;
		}
		//��ǻ�ʹ� 0���� ������ �Ͽ��� �迭�� �ε��� ���� ����ؼ� 0���� ���´�...
		System.out.printf("%d-%d-%d %s %d:%d%d\n",year,month,dayOfMonth,day_str,hour,minute,second);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, 1999);
		c2.set(Calendar.MONTH,9);
		c2.set(Calendar.DAY_OF_MONTH,20);
		//Date ��ü�� �����Ѵ�.
		Date date10 = c2.getTime();
		System.out.printf("data10 : %s\n",date10);
	}
}
