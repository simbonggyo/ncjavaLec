package homework.middle5.interfacecalc;

public class Add implements homework.middle5.interfacecalc.Calculator.Add {

	
	@Override
	public int add(int a, int b) {

		int result = a + b;
		System.out.println(result);
		return result;
	}

}
