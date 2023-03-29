package chat38_enum.enums;

public class _03_useOfEnumValue {

	public static void main(String[] args) {

		ValueMonth mar = ValueMonth.MAR;
		ValueMonth feb = ValueMonth.valueOf("FEB");
		ValueMonth apr = Enum.valueOf(ValueMonth.class, "APR");
		System.out.println(mar.getMonthVal());
		System.out.println("jan: " +mar);
		System.out.println("feb: "+ feb);
		System.out.println("apr: "+ apr);
		
		ValueMonth[] vmArr = ValueMonth.values();
		for(ValueMonth v :vmArr) {
			System.out.println(v.name() +"은" + v.ordinal() + "인덱스에 있습니다.");
		}
	}

}
