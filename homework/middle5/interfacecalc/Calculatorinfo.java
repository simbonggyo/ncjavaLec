package homework.middle5.interfacecalc;

import java.util.Scanner;

public class Calculatorinfo {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Add add = new Add();
		Div div = new Div();
		mul mul = new mul();
		sub sub = new sub();
		System.out.println("1은 덧셈 \n"+"2은 뺄셈 \n"+"3은 곱셈\n" +"4은 나눗셈\n");
		int a = sc.nextInt();
		System.out.println("계산할 두가지 수를 쓰세요:");
		int b = sc.nextInt();
		int c = sc.nextInt();
		switch(a) 
		{
		case 1: add.add(b, c);
			
		case 2: sub.sub(b, c);
			
		case 3: mul.mul(b, c);
	
		case 4: div.div(b, c);
			
		
		break;
		}
	}

}
