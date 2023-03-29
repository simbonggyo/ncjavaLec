package chat29.java.polymorphism.product;

public class SamsungTv extends Tv{

	public void Poweron() {
		System.out.println("제조사 : samsung");
		super.Poweron();
	}
	public void Poweroff() {
		System.out.println("제조사: sumsung");
		super.Poweroff();
		
	}
	public void operate(int Channel) {
		super.operate(Channel);
		
	}
}
