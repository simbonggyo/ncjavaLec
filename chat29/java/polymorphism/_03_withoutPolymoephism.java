package chat29.java.polymorphism;

import chat29.java.polymorphism.product.LGTV;
import chat29.java.polymorphism.product.SamsungTv;
import chat29.java.polymorphism.product.Tv;

public class _03_withoutPolymoephism {

	public static void main(String[] args) {

      //1.다형성을 사용 Tv 바꾸기
	  // tv라는 객체안에 LGTV 혹은 Samsung TV를 넣으면된다.


		Tv tv = new LGTV();
		tv.Poweron();
		tv.operate(10);
		tv.Poweroff();
		
		tv = new SamsungTv();
		tv.Poweron();
		tv.operate(20);
		tv.Poweroff();
		
		//{company: ["현대","기아","쉐보레:]}
		System.out.println(tv.toString());
	}

}
