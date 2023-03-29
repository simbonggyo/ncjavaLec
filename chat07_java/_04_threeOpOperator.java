package chat07_java;

public class _04_threeOpOperator {

	public static void main(String[] args) {

		int num1 = 111;
		int num2 = 10;
		int result = num1 / num2 >8 ?
				num1 - 11 :
					num2 - 11;
		System.out.println(result);
		//2. 삼항 조건 연산자의 중첩
		int result2 = num1 / num2 > 8 ?
				num1 / num2 > 4 ?
						num1 + 11
						:
					    num2 - 11
				: num1 + 33;
		
				System.out.println(result2);
		
		
	}

}
