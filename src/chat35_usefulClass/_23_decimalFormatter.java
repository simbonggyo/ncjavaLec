package chat35_usefulClass;

import java.text.DecimalFormat;

public class _23_decimalFormatter {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###.###");
		
		int price1 = 10000;
		int price2 = 1000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));
	}

}
