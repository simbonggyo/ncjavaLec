package chat38_enum.enums;


public enum CusMonth {

	//지정하는 상수는 Static final
	//값을 변경할 수 없다.
	JAN(1,"january"),FFB(2,"febrary"),MAR(3,"march"),APR(4,"April"),MAY(5,"may"),JUN(6,"jun"),JUL(7,"july"),AUG(8,"august"),SET(9,"september"),OCT(10,"octorber"),NOV(11,"november"),DEX(12,"december");
	private final int MONTH;
	private final String MONTH_NAME;
	
	
	CusMonth(int month,String name){
		
		MONTH = month;
		MONTH_NAME = name;
	}
	public int getMONTH() {
		return MONTH;
	}
	public String getMONTH_NAME() {
		return MONTH_NAME;
	}
	public CusMonth NestMONTH(int index) {
	
		return CusMonth.values()[index+1];
		
	 
	}
	
	}
