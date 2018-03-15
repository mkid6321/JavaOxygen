import java.util.Calendar;
import java.util.Date;

/*
 * Date,Calendar
 * Date : 컴퓨터 입장에서 시간을 관리.
 * Calendar : 사람 입장에서 시간을 관리.
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		//현재 시간을 관리하는 Date객체
		//import java.util
		Date d1 = new Date();
		//System.out.println(d1);
		
		//0시간(1970년 1월 1일 0시 0분 0초 0ms 세계표준시)
		Date d2 = new Date(0);
		System.out.printf("0시간 : %s\n",d2);
		
		//현재 시간 값을 가지고 있는 Calendar
		Calendar c1 = Calendar.getInstance();
		System.out.printf("c1 : %s\n",c1);
		//시간값 추출
		int year = c1.get(Calendar.YEAR);
		//month는 0부터 시작을 하여서.
		int month = c1.get(Calendar.MONTH) + 1;
		int dayOfMonth = c1.get(Calendar.DAY_OF_MONTH);
		int hour = c1.get(Calendar.HOUR);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int day = c1.get(Calendar.DAY_OF_WEEK);
		
		String day_str = null;
		switch(day) {
		case Calendar.SUNDAY:
			day_str = "일요일";
			break;
		case Calendar.MONDAY:
			day_str = "월요일";
			break;
		case Calendar.TUESDAY:
			day_str = "화요일";
			break;
		case Calendar.WEDNESDAY:
			day_str = "수요일";
			break;
		case Calendar.THURSDAY:
			day_str = "목요일";
			break;
		case Calendar.FRIDAY:
			day_str = "금요일";
			break;
		case Calendar.SATURDAY:
			day_str = "토요일";
			break;
		}
		//컴퓨터는 0부터 시작을 하여서 배열의 인덱스 값을 사용해서 0부터 나온다...
		System.out.printf("%d-%d-%d %s %d:%d%d\n",year,month,dayOfMonth,day_str,hour,minute,second);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, 1999);
		c2.set(Calendar.MONTH,9);
		c2.set(Calendar.DAY_OF_MONTH,20);
		//Date 객체로 추출한다.
		Date date10 = c2.getTime();
		System.out.printf("data10 : %s\n",date10);
	}
}
