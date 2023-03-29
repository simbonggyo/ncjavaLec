package homework.advance2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
   System.out.println("입금할 금액을 입력하세요.");
		
		int money = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		
		
		
	
		
		a = money/50000;//5만원
		b = (money%50000)/10000;//만원
		c = (money%50000%10000)/5000;//오천원
		d = (money%50000%10000%5000)/1000;//천원
		e = (money%50000%10000%5000%1000)/500;//오백원
		f = (money%50000%10000%5000%1000%500)/100;//백원
		g = (money%50000%10000%5000%1000%500%100)/50;//50원
		h = (money%50000%10000%5000%1000%500%100%50)/10;//10원
			
	 System.out.println("오만원"+a+"매"+"만원"+b+"매"+"오천원"+c+"매"+"천원"+d+"매"+"500원"+e+"매"+"100원"+f+"매"+"50원"+g+"매"+"10원"+h+"매");
		
		

	}

}
