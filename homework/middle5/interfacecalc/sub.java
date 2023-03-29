package homework.middle5.interfacecalc;

import homework.middle5.interfacecalc.Calculator.Sub;

public class sub implements Sub {

	@Override
	public int sub(int a, int b) {

		int result = a - b;
		System.out.println(result);
		return result;
	}

}
