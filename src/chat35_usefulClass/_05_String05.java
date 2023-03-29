package chat35_usefulClass;

import java.util.Scanner;

public class _05_String05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
	    String str2 =str1.replace("비트", "2");
	    String str3 = str2.replace("네이버", "2");
	    String str4 = str3.replace("클라우드", "2");
	    System.out.println(str4);
		String str5 = str4.replace("2", "");
	    System.out.println(str5);
	    
	   
		String[] strArr = str4.split("2");
		for(String s : strArr) {
			System.out.print(s);
		}
		System.out.println(s);
		
		
	}

}
