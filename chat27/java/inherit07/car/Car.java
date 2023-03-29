package chat27.java.inherit07.car;

import java.security.PublicKey;


public class Car {

	public String Company;
	public String color;
	public String model;
	public int price;
	public void carInfo() {
		System.out.println("제조사"+Company);
		System.out.println("모델"+model);
		System.out.println("가격"+price);
		System.out.println("색상"+color);
	}
	public void speedUp()
	{
		System.out.println("속도를 높인다");
	}
	public void SpeedDown() 
	{
		System.out.println("속도를 낮춘다");
	}
}
