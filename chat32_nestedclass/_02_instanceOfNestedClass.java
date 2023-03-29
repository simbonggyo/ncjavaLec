package chat32_nestedclass;

import chat32_nestedclass.clazz.NestedClass;
import chat32_nestedclass.clazz.NestedClass.Div;

public class _02_instanceOfNestedClass {

	static class Outer{
		class Mul{
			int num1 = 10;
			int num2 = 20;
			int result = num1*num2;
			
		}
		static class Div {
			int num1 = 10;
			int num2 = 5;
			int result = num1 / num2;
		}
	
	
}
         public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Mul mul = out.new Mul();
		NestedClass nc = new NestedClass();
		//외부클래스의 객체를 사용해서
		//외부클래스 객체.new 중첩클래스 생성자();
		NestedClass.Mul mul2 = nc.new Mul();
		System.out.println(mul2.result);
		
		//static으로 선언된 정적 중첩 클래스의 객체는
		//외부 클래스의 객체없이도 생성가능
		NestedClass.Div div = new Div();
         }
}