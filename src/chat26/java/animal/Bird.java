package chat26.java.animal;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Bird {

	//날개(int wing)
	//색깔(string color)
	//새이름(string name)
	//크기(string size)
	//식습관(string food)
	
	public int[] wing = {1};
	public String color;
	public String name;
	public String size;
	public String food;
	
	public Bird(String name) {
		this.name = name;
	}
	public Bird(String name,String food) {
		this.name = name;
		this.food = food;
	}
	public void fly(int num , int num2 , String str) {
		for(int i = 0; i<num; i++) {
			System.out.println(name+"날개를 이용하여 하늘을 납니다");
		}
	}
	public void cry() {
	       System.out.println(name+"나무에 앉아 웁니다.");
		
	}
	public void walk() {
		System.out.println(name+"는 땅을 걷습니다.");
		
		
	}
	public void eatingfood() {
	System.out.println(name+"은 고기를 먹는다.");
		
		
	}
	//날다(void fly)
	//독수리는(name)는 날개를 이용하여 하늘을 납니다.
	//운다(void cry)
	//독수리는 나무에 앉아 웁니다.
	//독수리는 땅을 걷는다
	//걷는다(void walking)
	//독수리는 땅을 걷는다
	//먹이를 먹는다(void eating food)
	//독수리는 고기를 먹는다.
	
}
