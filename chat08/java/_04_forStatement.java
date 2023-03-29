package chat08.java;

public class _04_forStatement {

	public static void main(String[] args) {

		int num = 100;
		int sum = 0;
		
		for(int i = 1; i <= num; i++)
		{
			sum = i + sum;
			
		}
		
		System.out.println(sum);
	}

}
