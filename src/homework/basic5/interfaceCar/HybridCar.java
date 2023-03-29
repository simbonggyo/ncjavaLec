package homework.basic5.interfaceCar;

public class HybridCar implements ElectronicCar, FuelCar {

	int fuel = 10;
	@Override
	public void speedUP() {

		System.out.println("속도를 올립니다");
	}

	@Override
	public void speedDown() {

		System.out.println("속도를 내립니다");
	}

	@Override
	public void addFuel() {

		System.out.println("연료를 채웁니다.");
	}

	@Override
	public void charge() {
		System.out.println("엔진을 바꿉니다.");
	}
    public static void main(String[] args) {

    	HybridCar hc = new HybridCar();
    	hc.speedUP();
    	hc.speedDown();
    	hc.addFuel();
    	hc.charge();
   
    }

}
