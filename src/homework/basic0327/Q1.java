package homework.basic0327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i<5; i++)
		intList.add(sc.nextInt());
		System.out.println(intList);
		
	}

}
