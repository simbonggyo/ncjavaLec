package chat32_nestedclass;

import chat32_nestedclass.clazz.Calc;

public class _06_anonymousClass {

	public static void main(String[] args) {

		//익명 중첩 클래스 선언 Calc 인터페이스 구현
		//익명 중첩 클래스는 추상클래스나 인터페이스를
		//구현한 클래스없이 사용할 수 있다.
		
		Calc cal = new Calc() {
			
			@Override
			public void calculator(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("결과는"+a+b);
			}
		};
		cal.calculator(20, 30);
	}

}
