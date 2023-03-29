package homework.basic0327;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> IntLinked = new LinkedList<>();
		for(int i =0; i<5; i++)
			IntLinked.add(sc.nextInt());
		IntLinked.set(3, 100);
		IntLinked.set(4, 200);	
		System.out.println(IntLinked);
		}

}
