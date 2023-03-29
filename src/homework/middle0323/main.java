package homework.middle0323;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		QQ add = new QQ();
		Scanner sc = new Scanner(System.in);
		int num =0;
	int sum =0;
	for(int i=0; i<10; i++) {
	
		
			num = sc.nextInt();
			sum =QQ.add(num);
				
		}

		
		System.out.println(sum);
	}

}
