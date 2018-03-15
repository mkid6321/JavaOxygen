package java57_;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DecimalFormat : 숫자형식(교재 543page)
 * SimpleDateFormat 
 * 
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DecimalFormat - 3자리 마다 콤파 찍기
		DecimalFormat df = new DecimalFormat("#,###");
		String str1 = df.format(100000);
		String str2 = df.format(23990238402803482L);
		System.out.printf("str1 : %s\n",str1);
		System.out.printf("str2 : %s\n",str2);
		System.out.printf("숫자1 : %d\n",323409234802834L);
		
		//SimpleDateFormat - 년월일 시분초
		//import java.util.Date
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String str3 = sdf.format(now);
		
		Date time2 = new Date(0);
		String str4 = sdf.format(time2);
		
		System.out.printf("str3: %s\n",str3);
		System.out.printf("str4: %s\n",str4);
		
		//MessageFormat
		String strFormat1 = "이름은 %s,나이는 %d입니다.";		
		String str10 = String.format(strFormat1, "홍길동",30);
		String str20 = String.format(strFormat1, "김길동",40);
		System.out.printf("str10 : %s\n",str10);
		System.out.printf("str20 : %s\n",str20);
		
		String strFormat2 = "이름은 {0}, 나이는 {1}입니다.";
		String str30 = MessageFormat.format(strFormat2, "홍길동",30);
		
		Object[] array = {"김길동",40};
		String str40 = MessageFormat.format(strFormat2, array);
		
		System.out.printf("str30 : %s\n",str30);
		System.out.printf("str40 : %s\n",str40);
	}

}
