package homework.middle5.interfacecalc;
import homework.middle5.interfacecalc.Calculator.Mul;

public class mul implements Mul {

	
	@Override
	public int mul(int a, int b) {
		int result = a * b;
		System.out.println(result);
		return result;
	}

}
