package chat32_nestedclass;

public class _01_innerStaticnestedClass {

	class Add{
		int num1 = 100;
		//static 변수는 static 클래스에서만 사용가능
		//static int num2 = 200;
		//상수로 선언된 static 변수는 사용 가능
		final static int num2 = 300;
	int result = num1+ num2;
	
	}
	//정적 중첩 클래스 선언
	static class Sub{
		static int num3 = 200;
		static int num4 = 100;
		static int result1 = num3 - num4;
	}
	
	
	public static void main(String[]arg){
		//중첩 클래스의 사용
		System.out.println(Sub.result1);
		
		//외부 클래스의 객체을 만들지 않고 
		//내부 클래스의 객체를 생성하면 에러발생
		//Add add = new Add();
		
		
		System.out.println(Add.num2);
	}
}
