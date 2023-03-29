package chat22_java;

import java.util.Scanner;

public class _01_infinitiStatement {

	
	public static void main(String[] args) {

		System.out.println("1은 종료. 나머지는 계속 반복:");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1은 종료 . 나머지는 계속 반복");
			String inputStr = sc.nextLine();
			if(inputStr.equals("1")) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println(inputStr);
		}
				
	}

}
