package chat16_java;

public class _03_logicalOperator {

	public static void main(String[] args) {
		//1.관계 연산자
		int num1 = 100;
		int num2 = 300;
		
		System.out.println("num1 < num2" + System.lineSeparator() + (num1 < num2) );//true

		System.out.println("num1 >= num2" + System.lineSeparator()+ (num1 >= num2) );//false
		
		System.out.println("num1 == num2" + System.lineSeparator() + (num1 == num2) );//false

		System.out.println("-------------------------------");
		//2. 논리 연산자
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num1 < num2 && "+ "num3 / num4 == 0 =" //true && true = true
				+ System.lineSeparator() + (num1 < num2 && num3 /num4 == 0));
		
		System.out.println("flase || num4"
				+" *num2 <100=" + System.lineSeparator()
				+(false || num4* num2 < 100)); // false || false => false
		System.out.println("!(num4 < 2000) ="+ System.lineSeparator() +
				(!(num4 < 2000)));//!true => false
		

	}

}
