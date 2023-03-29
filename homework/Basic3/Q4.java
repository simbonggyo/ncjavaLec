package homework.Basic3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("정수 10개를 입력하세요");
		for(int i=1; i<=9; i++) {
			num[i] = sc.nextInt();
		
		}

		for(int j=1; j<=9; j++) {
			if(num[j]%2==0||num[j]%3==0) {
				System.out.println(num[j]);
			}
		}
	}

}
