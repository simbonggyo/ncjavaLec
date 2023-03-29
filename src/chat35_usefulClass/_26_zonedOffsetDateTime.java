package chat35_usefulClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_zonedOffsetDateTime {

	public static void main(String[] args) {

		LocalDate date =LocalDate.of(2023, 3, 24);
		LocalTime time = LocalTime.of(16, 4, 30);
		
		//of메소드를 이용한 LocalDateTime객체 생성
		LocalDateTime ldt =LocalDateTime.of(date, time);
		
		LocalDateTime ldt2 = date.atTime(time);
		LocalDateTime ldt3 = time.atDate(date);
		
		//ZondId 객체 생성
		ZoneId zid = ZoneId.of("Asia/Seoul");
		//LocatDateTime 에 ZoneId추가해서
		//ZoneDateTime에 객체 생성
		ZonedDateTime zdt = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		//ZonedDateTime 객체에 ZoneId 추가
		ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zid);
		
		//ZoneDateTime -> OffsetFateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();
		System.out.println(zdt);
		System.out.println(zdt2);
		System.out.println(zdt3);
		System.out.println(odt);
	}

}
