package chat27.java.inherit07;

import chat27.java.inherit07.car.Car;
import chat27.java.inherit07.car.HyundaiCar;
import chat27.java.inherit07.car.HyundaiCarinherit;
import chat27.java.inherit07.car.KiaCar;
import chat27.java.inherit07.car.kiaCarinherit;


public class _01_withoutInherit {

	public static void main(String[] args) {
       //1.객체생성
	   Car ca = new Car();
       KiaCar kia = new KiaCar();
       HyundaiCar Hy = new HyundaiCar();
       
       ca.Company ="GM";
       kia.Company = "kia";
       Hy.Company = "Hyundai";
	
       //자식클래스는 부모의 형태도 가지고 있기 때문에
       //부모클래스로 만들어지느 객체에 대입가능하다.
       Car car1 = new kiaCarinherit();
       Car car2 = new HyundaiCarinherit();
       car1.Company ="kia";
       car1.speedUp();
       car1.SpeedDown();
       //형태가 부모 형태이기 때문에 자식의 기능은 가지고 있지 않다.
       //자식의 기능은 사용하지 못한다.
       //car1.openDoor();
       //다형성의 기초
       //같은 모양의 객체로
       //전혀 다른 결과값을 도출하는 발현하는 성질
       car2.Company = "Hyundai";
       car2.speedUp();
       car2.SpeedDown();
		
	}

}
