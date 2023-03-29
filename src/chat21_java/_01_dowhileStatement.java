package chat21_java;

public class _01_dowhileStatement {

	public static void main(String[] args) {
 
		do {
			System.out.println("무조건 1회 실행");
			
		}while(1<0); 
		int i = 1;
	
	
	do {
		if(i % 3 == 0)
			System.out.println(i++);
		
	}while(i<=20);
	
}
}
