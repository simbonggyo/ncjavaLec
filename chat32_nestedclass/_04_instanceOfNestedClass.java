package chat32_nestedclass;

import chat98.java.NestedClass2;

class NestedClass{
	class Add{
		int num1;
		int num2;
		final static int num5 = 300;
		int result;
		
		int add() {
			result = num1-num2;
			return result;
		}
		
	}
	static class sub{
		static int num3;
		static int num4;
		
		static int result1;
		static int sub() {
			result1 = num3 - num4;
			return result1;
		}
	}
}
public class _04_instanceOfNestedClass {

	public static void main(String[] args) {

		//1.정적 중첩 클래스의 사용
		NestedClass.sub.num3 = 10;
		NestedClass.sub.num4 = 20;
		System.out.println(NestedClass.sub.sub());
		//2.인스턴스 중첩 클래스의 사용
		//2-1. 외부클래스의 객체를 생성
		NestedClass nc = new NestedClass();
		//2-2. 중첩 클래스의 객체 생성
		NestedClass.Add add = nc.new Add();
		add.num1 = 12;
		add.num2 = 20;
		System.out.println(add.add());
		//final static으로 선언된 상수는
		//객체없이도 접근 가능
		System.out.println(NestedClass.Add.num5);
}
