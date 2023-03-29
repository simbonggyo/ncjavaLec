package chat99.java;

import java.util.Scanner;

public class _02_countKorean {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("문자를입력하세요.");
		String str = sc.next();	
		
		//대소문자 변환 된 문자열
		int hanCount = 0;
		int enCount = 0;
		
		//fEdCBa
		//대문자 소문자 바꿔주는 작업
		for(int i  = 0; i<str.length(); i++) {
			char ch = str.charAt(i); //ch 에 문자열 을 넣는다. charAt 해당 문자열을 꺼내올수있다.
		if(ch>= 44032&& ch<=55203) {
			hanCount++;
		}
		else {
			if(ch>='A'&&ch<='z')
		   enCount++;
			else {
				
			}
		}
		
		}
		System.out.println("한글의 개수는"+hanCount+"개 입니다.");
		System.out.println("영문자의 개수는"+enCount+"개 입니다.");
	
		}
	}


