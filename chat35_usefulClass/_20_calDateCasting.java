package chat35_usefulClass;

import java.util.Calendar;
import java.util.Date;

public class _20_calDateCasting {

	public static void main(String[] args) {

	Calendar cal1 = Calendar.getInstance();
	cal1.set(2018, 5, 7);
				
    //Calendar -> Date 형변환
		Date d1 = new Date(cal1.getTimeInMillis());	
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d1);
				
		System.out.println(d1);
	//Thu Jun 07 12:45:33 KST 2018
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK) + 
						" " + (cal2.get(Calendar.MONTH) + 1) +
						" " + cal2.get(Calendar.DATE) + 
						" " + cal2.get(Calendar.HOUR_OF_DAY) + 
						":" + cal2.get(Calendar.MINUTE) + 
						":" + cal2.get(Calendar.SECOND) +
						" " + cal2.get(Calendar.YEAR));
		System.out.println("d2부터 d1까지");
		//초로 바꾼다음 12% + 30% + 24% + 60% + 60%
		
//		a = money/50000;//5만원
//		b = (money%50000)/10000;//만원
//		c = (money%50000%10000)/5000;//오천원
//		d = (money%50000%10000%5000)/1000;//천원
//		e = (money%50000%10000%5000%1000)/500;//오백원
//		f = (money%50000%10000%5000%1000%500)/100;//백원
//		g = (money%50000%10000%5000%1000%500%100)/50;//50원
//		h = (money%50%10000%5000%1000%500%100%50)/10;//10원
	}

}
