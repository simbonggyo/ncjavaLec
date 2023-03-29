package chat35_usefulClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _17_bigDecimal {

	public static void main(String[] args) {

		BigDecimal bd1 = new BigDecimal(1.732);
		BigDecimal bd2 = BigDecimal.valueOf(3.145);
		BigDecimal bd3 = new BigDecimal(12.112222333);
//1.0,//3.14
		//반올림모드
		//divide : 나눌 때 오차가 발생할 수 있으므로 반올림모드를 지정
		
		System.out.println(bd2.divide(bd2,new MathContext(3,RoundingMode.CEILING)));
		
		//setScale : 소수점 자리수를 다시 설정
		System.out.println(bd3.setScale(5,RoundingMode.UP));
		System.out.println(bd3.setScale(4,RoundingMode.DOWN));
	}

}
