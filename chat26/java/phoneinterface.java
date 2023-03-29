package chat26.java;

import java.util.Scanner;

import chat26.java.Phone.PhoneInfo;

public class phoneinterface {

	public static void main(String[] args) {

		PhoneInfo ph = new PhoneInfo();
		for(int i = 0; i<10; i++) {
		Scanner a = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
		System.out.println("이름과 전화번호를 입력하세요."+ i+"번째입력중");
		String b = a.next();
		String c = a.next();
		ph.insertPhonenum(b, c);
		}
		
		System.out.println("모든 내용 출력");	
		ph.printAllPhonenum();
		
		Scanner i = new Scanner(System.in);
		while(true) {
		System.out.println("검색하시겠습니까? 1은게속 2은 정지");
		int why = i.nextInt();
		if(why == 1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		ph.printPhonenum(name);
		}
		else if(why ==0) {
			System.out.println("끝났습니다.");
			break;
		}else
		{
			System.out.println("다시입력하세요");
			continue;
		}
		}
	    
		
		
	}
	

}
