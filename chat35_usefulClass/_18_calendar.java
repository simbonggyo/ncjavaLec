package chat35_usefulClass;

import java.util.Calendar;

public class _18_calendar {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		//HOUR는 오전, 오후 상관없이 0~11로 시간을 표시
		System.out.println("현재 시간은" +today.HOUR + ":" + today.MINUTE + ":" + today.SECOND);
		
		//HOUR_OF_DAY 0 ~ 23으로 시간을 표시
		System.out.println("올해 년도는" +today.YEAR);
		
		//오전(0), 오후(1) 표시해주는 AM_PM
		System.out.println(today.AM_PM);
		
		
		
		//월은 0부터 시작 0(1월) ~ 11(12월)
		System.out.println("현재 월은" + today.MONTH);
		System.out.println("올해의 몇째주 :" +today.WEEK_OF_YEAR);
		System.out.println("");
	}

}
