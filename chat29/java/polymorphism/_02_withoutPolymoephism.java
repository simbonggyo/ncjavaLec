package chat29.java.polymorphism;

import chat29.java.polymorphism.product.LGTV;
import chat29.java.polymorphism.product.SamsungTv;
import chat29.java.polymorphism.product.Tv;

public class _02_withoutPolymoephism {

	public static void main(String[] args) {

//1.다형성을 사용하지 않고 Tv 바꾸기
		LGTV lgtv = new LGTV();
		SamsungTv samsungTv = new SamsungTv();
		lgtv.Poweron();
		lgtv.operate(13);
		lgtv.Poweroff();
		lgtv.Poweron();
		
		
	}

}
