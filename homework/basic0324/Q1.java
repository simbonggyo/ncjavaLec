package homework.basic0324;

import java.time.LocalDate;
import java.util.Calendar;

import homework.middle5.interfacecalc.Add;

public class Q1 {

	Calendar cal = Calendar.getInstance();
	
	
	public static void main(String[] arg) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020,4,8);
		System.out.println(cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+"월 "+cal.get(Calendar.DATE)+"일");
		
		Add add = new Add();
		cal.get(Calendar.YEAR)
	}
}
