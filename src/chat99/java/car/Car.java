package chat99.java.car;

import java.util.Arrays;

public class Car {

	//제조사(company),모델(model),색상(color),가격(price)
	//public
	int index = 0;
	int i = 0;
	
	public String[] company = {"현대"};
	public String [] model = {"제네시스"};
	public String [] color = {"검정"};
	public String[] option;
	public int price [] = {5000};
	
	public Car() {
		//String null로 초기화되기 때문
		//데이터에 null이 존재하면 예외가 발생할 확률이
		//높아지므로 ""(빈 문자열)로 초기화 해준다.
		company[0] ="";
		model[0] ="";
		color[0] = "";
		System.out.println("기본 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String c) {
		company[0] = c; 
		System.out.println("매개변수가 한 개인 생성자 호출");
	}
	public Car(String c, String m) {
		company[0] = c;
		model[0] = m;
		System.out.println("매개변수가 두 개인 생성자 호출");
	}
	//매개변수명은 어떤 멤버변수를 초기화할지 명확하게 하기 위해
	//멤버변수명과 일치시킨다.
	public Car(String company ,String model , String color)
	{
		//생성되는 객체 자체를 가르키는 this 키워드를 사용해서
		//멤버변수를 지칭하도록 한다.
		this.company[0] = company;//this.company -> 이 Car 라는 객체의 컴퍼니
        this.model[0] = model;
        this.color[0] = color;
        System.out.println("매개변수 세 개인 생성자 호출");
	}
	
	public Car(String company ,String model , String color,int price) 
	{
		this.company[0] = company;//this.company -> 이 Car 라는 객체의 컴퍼니
        this.model[0] = model;
        this.color[0] = color;
        this.price[0] = price;
        System.out.println("매개변수 네 개인 생성자 호출");
        CarInfo();
        
	}
	public void CarInfo() 
	{ 
		System.out.println("제조사"+company[0]+"모델"+model[0]+"색상"+color[0]+"가격"+price[0]);	
	}

	@Override
	public String toString() {
		return "Car [index=" + index + ", i=" + i + ", company=" + Arrays.toString(company) + ", model="
				+ Arrays.toString(model) + ", color=" + Arrays.toString(color) + ", price=" + Arrays.toString(price)
				+ "]";
	}
	
	//
	//carInfo() -> 입력한 자동차 정보를 출력
	//제조사: 현대
	//모델 제네시스
	//색상: 검정
	//가격: 5000
}
