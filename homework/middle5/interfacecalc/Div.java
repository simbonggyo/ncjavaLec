package homework.middle5.interfacecalc;

public class Div implements homework.middle5.interfacecalc.Calculator.Div {

	@Override
	
	public int div(int a, int b) {
	

			int result = a - b;
			System.out.println(result);
			return result;
		

	}

}
