package chat28.java;

//단위와 상관없이 두 개의 값을 더해주는 클래스
public class Add {

	public static String result;
	
	
	public static String add(int num1,int num2, String uni) {
		result = (num1 + num2) +uni;
		return result;
	}

}
