package homework.Basic3;

import java.util.Scanner;

public class Q2 {

	
	public static void main(String[] args) {

		int[]nums = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<=9; i++) {
		
			System.out.println("정수를 입력하세요");
			nums[i] = sc.nextInt();
		
			sum += nums[i];
			
			
	      
	}
		for(int j =0; j<=9; j++) {
			
		
		System.out.println(nums[j]);
		}
		System.out.println(sum);
}
}