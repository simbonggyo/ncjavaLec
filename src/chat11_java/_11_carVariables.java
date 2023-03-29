package chat11_java;

public class _11_carVariables {

	public static void main(String[] args) {

		var str = "hello";
		
		System.out.println("str 타입:"+ 
		str.getClass().getName());
		//원시타입의 래퍼클래스
		//int => Integer
		//long => Long
		var num1 = 100;
		
		System.out.println(((Object)num1).getClass().getName());
		var num2 = 12.25;
		System.out.println(((Object)num2).getClass().getName());
	}

}
