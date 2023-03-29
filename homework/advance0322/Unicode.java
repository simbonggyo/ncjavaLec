package homework.advance0322;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		boolean ad = true;
		Scanner sc = new Scanner(System.in);
		int index = 0;
		String str2[] = new String[index+1];
		
	
		System.out.println("문자열을 입력하세요.");
			unicodeconver uni = new unicodeconver();		
			String str = sc.next();
			str2[index] = str;
			uni.unicode(str2, index+1);
			
	
	}

}
	


