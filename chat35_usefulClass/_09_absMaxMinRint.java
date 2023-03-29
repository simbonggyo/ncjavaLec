package chat35_usefulClass;

import java.util.Scanner;

public class _09_absMaxMinRint {

	public static void main(String[] args) {

		int num =0;
		Scanner sc = new Scanner(System.in);
		int[] intarray = new int[num];

		while (true) {
			System.out.println("종료를 원하시면 2번 게속하실거면 1번을 눌러주세요");
			int key = sc.nextInt();
			if(key==1) {
				System.out.println("숫자를 입력하세요");
				intarray[num] = sc.nextInt();
				num++;
			  }
		}
		
		
		

	}
}


