package chat38_enum.enums;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
	  //CusMonth형의 변수 선언
	  //CusMonth.JAN을 값으로 갖는
	  //CusMonth의 열거형 객체가 하나 생성
		CusMonth jan = CusMonth.JAN;
		//CusMonth의 열거형 객체의 이름(상수의 이름)
		//=>JAN
		System.out.println(jan);
		//ordinal() => 해당 상수의 인덱스
		System.out.println(jan.ordinal());
		System.out.println(CusMonth.AUG);
	  
	}

}
