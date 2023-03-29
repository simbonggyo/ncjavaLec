package chat38_enum;

import chat38_enum.enums.CusMonth;

public class _01_useOfEnum {

	public static void main(String[] args) {

		CusMonth c = CusMonth.JAN;
		
		System.out.println(c.getMONTH());
		System.out.println(c.getMONTH_NAME());
		
		CusMonth[] cArr = new CusMonth[12];
		cArr[0] = c;
		for(int i = 1; i<11; i++) {
			
			cArr[i] = cArr[i-1].NestMONTH(i);
			System.out.println(cArr[i]);
			
		}
	}

}
