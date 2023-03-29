package chat29.java.polymorphism.product;

public class Tv extends ElectronicDevice{

	public int lastChannel = 1;
	public void Poweroff() {
		System.out.println("전원을 끈다.");
		moveTo(lastChannel);
	}
	public void Poweron() {
		System.out.println("전원을 킨다.");	
	}
	public void moveTo(int num) {
		System.out.println("tv"+lastChannel+"을 이동시킵니다.");
	}
	public void lastChannel() {
	
		System.out.println("tv를 직전 체널로 이동시킵니다");
		lastChannel--;
	}
	public void afterChannel() {
		System.out.println("tv를 다음 채널로 이동시킵니다.");
		lastChannel++;
	}
	public void operate(int channel) {
		lastChannel = channel;
		moveTo(channel);
	}
}

	
	
	

