package chat26.java;

import chat26.java.clac.Add;
import chat26.java.clac.Calc;
import chat26.java.clac.Minus;

public class _02_overriding {

	public static void main(String[] args) {

		Calc C = new Calc();
		Add add = new Add();
		Minus min = new Minus();
		System.out.println(C.add(4,3));
		System.out.println(C.minue(4, 3));
		System.out.println("--------------");
		System.out.println(add.add(4,3));
		System.out.println(min.minue(3, 4));
	}

}
