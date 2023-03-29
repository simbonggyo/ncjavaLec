package chat23_java;

import java.util.Scanner;

public class _01_forforstatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("2~9까지 입력");
			int num = sc.nextInt();
		
			if(num == 0 || num ==1) {
			System.out.println("종료되었습니다.");
			break;
		    }
		
		
	
for(int i = 2; i<= num; i++) {
	for(int j = 1; j<=9; j++) {
		System.out.println( i +"*"+j + "=" + ( i * j ));
	}
	System.out.println();
}
}
}
}
