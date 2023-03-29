package chat35_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {

		//Interger 생성자 자바 9버전부터는 사용불가
	Integer num1 = Integer.valueOf(100);
	Integer num2 = Integer.valueOf(100);
	//주소값 비교
	System.out.println(num1 == num2);
	
	System.out.println(num1.equals(num2));
	String numStr = "1000";
	int converNum = Integer.parseInt(numStr);
	System.out.println(converNum);
	System.out.println(converNum);
	
	String converStr = num1.toString();
	System.out.println(converStr.getClass().getName());
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	//문자열로 변환
	System.out.println(Integer.parseInt("FT"));
	
	System.out.println(Integer.parseInt("TF",16));
	}

}
