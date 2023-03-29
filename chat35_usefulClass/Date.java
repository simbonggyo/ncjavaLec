package chat35_usefulClass;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {


		java.util.Date today = new java.util.Date();
		
		SimpleDateFormat sdf1 =
				new SimpleDateFormat("yy년 MM월 dd일");
		
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		
		
		
	}

}
