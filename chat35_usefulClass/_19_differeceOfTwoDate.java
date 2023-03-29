package chat35_usefulClass;


import java.util.Calendar;

public class _19_differeceOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2019, 3, 20);
		
		//getTimeInMills() : long타입으로 지정된 날짜를 
		//                   밀리세컨드로 리턴.
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		long a = (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12));
		long b = (diff / ((long)1000 * 60 * 60 * 24 * 30))%12;
		long c = (diff / ((long)1000 * 60 * 60 * 24))%30;
		long d = (diff / ((long)1000 * 60 * 60))%24;
		long e = (diff / ((long)1000 * 60))%60;
		long h = (diff / (long)1000)%60;
		System.out.println("d2부터 d1까지 " + 
					(diff / 1000) + "초가 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60)) + "분이 지났습니다.");	
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60 * 60)) + "시간이 지났습니다.");	
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다.");
		
		System.out.println((diff / 1000)%60);
		System.out.println(a+"년"+ b+"월"+ c+"일"+d+"시간"+e+"분"+h+"초 지났습니다.");
	}

}
