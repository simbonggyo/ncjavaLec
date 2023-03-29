package chat99.java.game;

import java.util.Scanner;

public class person extends Lotto {

	
	public void Inputnum() {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<=6; i++) {
			this.arr[i] = sc.nextInt();  
		}
		
	}
}
