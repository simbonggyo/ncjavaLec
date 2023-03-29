package chat35_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {

		double num = 123.45678;
		System.out.println(Math.ceil(num));
		System.out.println((double)Math.round(num));
		System.out.println(Math.floor(num));
		System.out.println((double)Math.round(num*1000));
		
		//max, min
		int num1 = 123;
		int num2 = -456;
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		//rint
		double num3 = 123.456;
		System.out.println(Math.rint(num3));
		
	}

}
