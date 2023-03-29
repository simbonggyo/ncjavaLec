package homework.calculation;



import java.util.Scanner;

import homework.calculation.Q1.Add;
import homework.calculation.Q1.Div;
import homework.calculation.Q1.Mul;
import homework.calculation.Q1.Sub;
import homework.calculation.Q1.calculate;

public class calculationinterface {

	public static void main(String[] args) {

		calculate a = new calculate();
		calculate b = new Add();
		calculate c = new Sub();
		calculate d = new Mul();
		calculate e = new Div();
	
	
		
		calculate[] calcArr = new calculate[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].Calc(3,1);
		calcArr[1].Calc(4,3);
		calcArr[2].Calc(3,2);
		calcArr[3].Calc(5, 2);
		
	}

}
