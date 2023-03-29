package homework.advance3;

import java.util.Scanner;

public class employeeinfo {

	

	public static void main(String[] args) {

		employee[] em = new employee[200];
		Scanner sc = new Scanner(System.in);
		System.out.println("***메뉴를 선택하세요***\n"+"*1.정규직 저장\n*"+"*2.임시직저장\n*"+"*3.계약직 저장\n*"+"*4.전체정보 출력\n*"+"*5.월급 계산 출력\n*"+"6.*프로그램 종료\n*");
		int num = sc.nextInt();
			
		switch (num) {
		case 1:
			System.out.println("회원정보을 입력하세요");
			int employeenum = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();	
			fulltime fc = new fulltime(employeenum, name, salary);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			if(num==1)
			{
				
			}
		case 5:
			break;
		case 6:
			break;
		}
		
	

}
}
