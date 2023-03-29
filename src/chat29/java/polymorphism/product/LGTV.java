package chat29.java.polymorphism.product;

public class LGTV extends Tv{

	public void Poweron() {
		System.out.println("제조사 : lg");
		super.Poweron();
	}
	public void Poweroff() {
		System.out.println("제조사: lg");
		super.Poweroff();
		
	}
	public void operate(int Channel) {
		super.operate(Channel);
		
	}
}
