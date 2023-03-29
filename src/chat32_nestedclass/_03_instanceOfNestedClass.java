package chat32_nestedclass;

import chat32_nestedclass.clazz.NestedClass;
import chat98.java.NestedClass2;

public class _03_instanceOfNestedClass {

	public static void main(String[] args) {

		//1.외부클래스의 객체 생성
		NestedClass2 nc = new NestedClass2();
		
		//1. 인스턴스 클래스의 객체 생성
		NestedClass2.Mul mul = nc.new Mul();
		//2. 정적 중첩 클래스의 객체 생성
		NestedClass2.Div div = new NestedClass2.Div();
		//3. 정적 중첩 클래스의 정적 멤버에 접근
		System.out.println(NestedClass2.Div.result);
		//3-2 정적 중첩 클래스의 일반 멤버에 접근
		System.out.println(div.getNum3());
		//4. 인스턴스 중첩 클래스의 객체 사용
		mul.setNum1(150);
		mul.setNum1(15);
		mul.setResult(mul.getNum1()*mul.getNum2());
		System.out.println(mul.getResult());
	}

}
