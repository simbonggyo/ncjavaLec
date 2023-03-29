package chat99.java;

import chat26.java.clac.Calc;
import chat99.java.car.Car;

public class _06_constructor {

	public static void main(String[] args) {

		Car ca = new Car();
		
		Car ca2 = new Car("현대");
		Car ca3 = new Car("현대","아반떼");
		Car ca4 = new Car("현대","아반떼","검정");
		Car ca5 = new Car("현대","아반떼","검정",4000);
		
		ca.CarInfo();
		System.out.println("----------------");
		ca2.CarInfo();
		System.out.println("---------------");
		ca3.CarInfo();
		System.out.println("----------------");
		ca4.CarInfo();
		System.out.println("---------------");
		ca5.CarInfo();
		System.out.println("---------------");
	}

}
