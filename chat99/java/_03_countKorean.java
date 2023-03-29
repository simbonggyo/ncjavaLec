package chat99.java;

import java.awt.Taskbar.State;
import java.util.Scanner;

public class _03_countKorean {
	
public static int hanCount(String str) {
	
	int hanCount = 0;
	
	for(int i  = 0; i<str.length(); i++) {
		char ch = str.charAt(i); //ch 에 문자열 을 넣는다. charAt 해당 문자열을 꺼내올수있다.
	if(ch>= 44032&& ch<=55203) {
		hanCount++;
	}
	else {
			
	}
	
	}
	return hanCount;
}
	public static int enCount(String str) {
		
		int enCount = 0;
		
		for(int i  = 0; i<str.length(); i++) {
			char ch = str.charAt(i); //ch 에 문자열 을 넣는다. charAt 해당 문자열을 꺼내올수있다.
		if(ch>= 44032&& ch<=55203) {
			enCount++;
		}
		else {
				
		}
		
		}
		return enCount;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("문자를입력하세요.");
		String str = sc.next();	
		
		System.out.println(hanCount(str));
		System.out.println(enCount(str));
		
		
	
		
	}
}


