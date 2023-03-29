package chat26.java;

import chat26.java.clac.Multiple;

public class _03_Overloading {

	public static void main(String[] args) {

		Multiple mul = new Multiple();
		mul.setNum1(4);
		mul.setNum2(3);
		
		System.out.println("매개변수가 없는 multi()");
		System.out.println(mul.Multi());
		System.out.println("매개변수가 한개인 multi()");
		System.out.println(mul.Multi(4));
		System.out.println("매개변수가 두개인 multi()");
		System.out.println(mul.Multi(4,3));
	}

}
