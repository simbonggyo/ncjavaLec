package chat99.java;

public class _04_forStatement {

	private static int Ui = 30;
	
	public static void main(String[] args) {

		for(int i = 1; i <= Ui; i++) 
		{
		for(int j = i; j > 0; j--)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		}
	}

}
