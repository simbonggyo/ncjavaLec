package chat26.java;

import javax.swing.plaf.multi.MultiButtonUI;


import chat26.java.clac.Add;
import chat26.java.clac.Calc;
import chat26.java.clac.Divide;
import chat26.java.clac.Minus;
import chat26.java.clac.Multiple;

public class _01_instance {

	public static void main(String[] args) {

		//객체화(인스턴화)
		Add add = new Add();//ctrl + shitf + o ->다른 클래스  // -> 클래스 가져와서 변수로 쓸수 있게 만듬.
		add.setNum1(10);
		add.setNum2(20);
		//add.setResult(add.getNum1()+add.getNum2());
		System.out.println(add.add());
		
		Minus minus = new Minus();
		minus.setNum1(20);
		minus.setNum2(10);
		System.out.println(minus.Minus());	
		
		Divide divide = new Divide();
		divide.setNum1(30);
		divide.setNum2(10);
		System.out.println(divide.Divide());
		
		Multiple multiple = new Multiple();
		multiple.setNum1(10);
		multiple.setNum2(20);
		System.out.println(multiple.Multi());
		//설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인턴스화: 생성자를 통해서 객체를 생성하고 heap
		//        메모리 영역 저장
		//        항상 new 키워드와 함께 사용
		//항상 new 키워드와 함께 사용
		Calc C = new Calc();
		//리턴 값을 받아주는 변수가 없으면 결과가 메로리에 저장되지 않고
		//연산이 일어난 후 삭제
		int receiveNum = C.add(200, 100);
		
		System.out.println(receiveNum);
		System.out.println(C.add(C.minue(200, 100),C.divide(100, 10)));
		
		Calc C2 = new Add();
		System.out.println(C2.add(100, 3));
		
		Calc C3 = new Minus();
		System.out.println(C3.minue(4, 3));
	}

}
