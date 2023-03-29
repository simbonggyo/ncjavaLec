package homework;

import java.util.Scanner;

import homework.advance0323.Studentpage;

public class test {

	public static void main(String[] args) {
		Studentpage stp = new Studentpage();
		Scanner sc = new Scanner(System.in);
		
		//회원정보 검색
		for(int i =0; i <10; i++) {
		int a = sc.nextInt();
		String b = sc.next();
		stp.printinfo(a, b);
		}
		stp.printinfoAll();
	
	}

}
