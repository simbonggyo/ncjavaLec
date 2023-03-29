package chat26.java;

import java.util.Scanner;

import chat26.java.animal.Bird;

public class birdinfo {

	public static void main(String[] args) {

		Bird bird = new Bird("참새","모이");
		Bird engle = new Bird("독수리","뱀");
		Bird dakdulgi = new Bird("닭둘기","잡식");
		
		bird.name = "참새";
		bird.food = "모이";
		bird.fly(2, 3, "aa");
		
		engle.name = "독수리";
		engle.food = "뱀";
		
		dakdulgi.name = "닭둘기";
		dakdulgi.food = "잡식";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name2 = sc.nextLine();
		
		if(bird.name.equals(name2)) {
		bird.walk();
		bird.eatingfood();	
	}

}
}
