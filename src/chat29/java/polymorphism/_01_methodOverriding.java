package chat29.java.polymorphism;

import chat29.java.polymorphism.product.AirCon;
import chat29.java.polymorphism.product.ElectronicDevice;
import chat29.java.polymorphism.product.Tv;

public class _01_methodOverriding {

	public static void main(String[] args) {
		//1. 다형성의 구현
		//부모형태의 변수에 자식 인스턴스(객체)를 담아
		//다양한 형태로 사용한다.
		ElectronicDevice ed = new Tv();
		ed.Poweron();
		ed.operate(11);
		ed.Poweroff();
		
		ed = new AirCon();
		ed.Poweron();
		ed.operate(18);
		ed.Poweroff();
	}

}
