package chat35_usefulClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _25_LocalDateTime {

	public static void main(String[] args) {		
		
		LocalDate date =LocalDate.of(2023, 3, 24);
		LocalTime time = LocalTime.of(16, 4, 30);
		
		//of메소드를 이용한 LocalDateTime객체 생성
		LocalDateTime ldt =LocalDateTime.of(date, time);
		
		LocalDateTime ldt2 = date.atTime(time);
		LocalDateTime ldt3 = time.atDate(date);
		
		//LocalDateTime -> LocalDate, LocalTime 분리
		LocalDate ld = ldt3.toLocalDate();
		LocalTime lt = ldt3.toLocalTime();
	
		System.out.println(ldt);
		System.out.println(ldt2);
		System.out.println(ldt3);
		System.out.println(ld+"."+lt);
	}

}
