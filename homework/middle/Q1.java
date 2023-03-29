package homework.middle;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요:");
		int age = sc.nextInt();
				
		if(age/10 == 2) {
			System.out.println("20대입니다.");
		}
		else if(age/10 >= 3)
		{
			System.out.println("20대가 아닙니다.");
		}
		else
		{
			System.out.println("다시 입력하세요");
		}
	}

}
