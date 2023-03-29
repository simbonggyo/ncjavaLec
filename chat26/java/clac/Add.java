package chat26.java.clac;

public class Add extends Calc{
	//Add 는 Calc 와 add 을 둘다 가능
	//맴버 변수
	private int num1;
	private int num2;
	private int result;
	
	// getter 와 setter 로 값을 가져와서 넣는다.
	public int getNum1() {
		return num1; //num1 의 값을 가져온다
	}
	public void setNum1(int num1) {
		this.num1 = num1; // 지금 클래스 있는 객체 호출후 넣는다.
	}
	public int getNum2() {
		return num2;  //num2 의 값을 가져온다.
	}
	public void setNum2(int num2) {
		this.num2 = num2; // 지금 클래스 있는 객체 호출후 넣는다.
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	
	
	
	//alt + shift + s => Getter Setter => select all
//오버라이딩 : 부모 클래스에 존재하는 메소드를 재정의
public int add(int a, int b) {
	return(a*a)+(b*b);
}
}
