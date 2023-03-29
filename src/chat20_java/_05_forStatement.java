package chat20_java;

public class _05_forStatement {

	public static void main(String[] args) {
    //1~100까지의 합
		int sum =0;
		int i;
	for(i =1; i<=100; i++) {
		sum += i;
	}
     System.out.println("1~100까지의 합:"+ sum);
     System.out.println("for 문 종료시 i의값"+
     i);
	}
}